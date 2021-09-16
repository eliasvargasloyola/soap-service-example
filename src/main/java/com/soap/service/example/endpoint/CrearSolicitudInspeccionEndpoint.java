package com.soap.service.example.endpoint;

import com.soap.service.example.service.CrearSolicitudInspeccionService;
import io.spring.guides.gs_producing_web_service.CrearSolicitudInspeccionRequest;
import io.spring.guides.gs_producing_web_service.CrearSolicitudInspeccionResponse;
import io.spring.guides.gs_producing_web_service.SolicitudInspeccionRespuesta;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@Slf4j
public class CrearSolicitudInspeccionEndpoint {

    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private final CrearSolicitudInspeccionService crearSolicitudInspeccionService;

    public CrearSolicitudInspeccionEndpoint(CrearSolicitudInspeccionService crearSolicitudInspeccionService) {
        this.crearSolicitudInspeccionService = crearSolicitudInspeccionService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "crearSolicitudInspeccionRequest")
    @ResponsePayload
    public CrearSolicitudInspeccionResponse crearSolicitud(@RequestPayload CrearSolicitudInspeccionRequest crearSolicitudInspeccion) {
        log.info("El parametro de input es " + crearSolicitudInspeccion.getParametro());
        String responseString = crearSolicitudInspeccionService.crearSoli(crearSolicitudInspeccion);
        log.info("La respuesta es " + responseString);
        CrearSolicitudInspeccionResponse response = new CrearSolicitudInspeccionResponse();
        SolicitudInspeccionRespuesta respuesta = new SolicitudInspeccionRespuesta();
        respuesta.setESTADO(responseString);
        response.setSolicitudInspeccionRespuesta(respuesta);
        return response;
    }
}
