package com.ozcaar.relojchecador.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ozcaar.relojchecador.models.EmpleadoModel;
import com.ozcaar.relojchecador.services.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    EmpleadoService empleadoService;

    @GetMapping
    public ArrayList<EmpleadoModel> obtenerEmpleados() {
        return empleadoService.obtenerEmpleados();
    }

    @PostMapping
    public EmpleadoModel guardarEmpleado(@RequestBody EmpleadoModel empleado) {
        return this.empleadoService.guardarEmpleado(empleado);
    }

    @GetMapping(path = "/{id}")
    public Optional<EmpleadoModel> obtenerEmpleadoPorId(@PathVariable("id") Long id) {
        return this.empleadoService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<EmpleadoModel> obtenerUsiarioPorDepartamento(@RequestParam("departamento") Integer departamento) {
        return this.empleadoService.obtenerPorDepartamento(departamento);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.empleadoService.elimnarEmpleado(id);
        if (ok) {
            return "Se elimino el empleado con el id" + id;
        } else {
            return "No se pudo eliminar el usuario con el id" + id;
        }
    }
}
