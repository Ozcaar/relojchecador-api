package com.ozcaar.relojchecador.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ozcaar.relojchecador.models.RegistroAsistenciaModel;
import com.ozcaar.relojchecador.services.RegistroAsistenciaService;

@RestController
@RequestMapping("/registro_asistencia")
public class RegistroAsistenciaController {

    @Autowired
    RegistroAsistenciaService registroAsistenciaService;

    @GetMapping
    public ArrayList<RegistroAsistenciaModel> obtenerRegistro() {
        return registroAsistenciaService.obtenerRegistro();
    }

    @PostMapping
    public RegistroAsistenciaModel guardarRegistro(@RequestBody RegistroAsistenciaModel registro) {
        return this.registroAsistenciaService.guardarRegistro(registro);
    }

}
