package com.soap.service.example.service;

import io.spring.guides.gs_producing_web_service.CallCrearSolicitudInspeccionRequest;
import org.springframework.stereotype.Component;

@Component
public class CallCrearSolicitudInspeccionService {
    public String crearSoli(CallCrearSolicitudInspeccionRequest stringXml) {
        return "<flujo Id='' Ins='' Proceso='20210930112454' IdUsuario='4123'><fichaDatos><numero_propuesta key='y'>123</numero_propuesta><respuesta_servicio>1</respuesta_servicio><detalle_respuesta>OK</detalle_respuesta><numero_inspeccion>0987654321</numero_inspeccion></fichaDatos></flujo>";
    }
}
