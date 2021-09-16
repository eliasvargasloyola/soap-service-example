package com.soap.service.example.service;

import io.spring.guides.gs_producing_web_service.CrearSolicitudInspeccionRequest;
import org.springframework.stereotype.Component;

@Component
public class CrearSolicitudInspeccionService {
    public String crearSoli(CrearSolicitudInspeccionRequest stringXml) {
        return "<response>Hola</response>";
    }
}
