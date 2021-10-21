package com.soap.service.example.endpoint;

import com.soap.service.example.service.CallCrearSolicitudInspeccionService;
import io.spring.guides.gs_producing_web_service.CallCrearSolicitudInspeccionRequest;
import io.spring.guides.gs_producing_web_service.CallCrearSolicitudInspeccionResponse;
import io.spring.guides.gs_producing_web_service.SolicitudInspeccionRespuesta;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@Slf4j
public class CallCrearSolicitudInspeccionEndpoint {

    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private final CallCrearSolicitudInspeccionService callCrearSolicitudInspeccionService;

    public CallCrearSolicitudInspeccionEndpoint(CallCrearSolicitudInspeccionService callCrearSolicitudInspeccionService) {
        this.callCrearSolicitudInspeccionService = callCrearSolicitudInspeccionService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CallCrearSolicitudInspeccionRequest")
    @ResponsePayload
    public CallCrearSolicitudInspeccionResponse crearSolicitud(@RequestPayload CallCrearSolicitudInspeccionRequest crearSolicitudInspeccion) {
        log.info("El parametro de input es " + crearSolicitudInspeccion.getParametro());
        String responseString = callCrearSolicitudInspeccionService.crearSoli(crearSolicitudInspeccion);
        log.info("La respuesta es " + responseString);
        CallCrearSolicitudInspeccionResponse response = new CallCrearSolicitudInspeccionResponse();
        SolicitudInspeccionRespuesta respuesta = new SolicitudInspeccionRespuesta();
        respuesta.setESTADO(responseString);
        response.setReturn(respuesta);
        return response;
    }
}
