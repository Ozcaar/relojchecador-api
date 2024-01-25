package com.ozcaar.relojchecador.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ozcaar.relojchecador.models.DepartamentoModel;
import com.ozcaar.relojchecador.services.DepartamentoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {

    @Autowired
    DepartamentoService departamentoService;

    @GetMapping
    public ArrayList<DepartamentoModel> obtenerDepartamento() {
        return departamentoService.obtenerDepartamento();
    }

    @PostMapping
    public DepartamentoModel postMethodName(@RequestBody DepartamentoModel departamento) {
        return this.departamentoService.guardarDepartamento(departamento);
    }
}
