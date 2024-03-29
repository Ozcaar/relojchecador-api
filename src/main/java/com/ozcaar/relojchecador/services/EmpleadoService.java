package com.ozcaar.relojchecador.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ozcaar.relojchecador.models.EmpleadoModel;
import com.ozcaar.relojchecador.repositories.EmpleadoRepository;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    public ArrayList<EmpleadoModel> obtenerEmpleados() {
        return (ArrayList<EmpleadoModel>) empleadoRepository.findAll();
    }

    public EmpleadoModel guardarEmpleado(EmpleadoModel empleado) {
        return empleadoRepository.save(empleado);
    }

    public Optional<EmpleadoModel> obtenerPorId(Long id) {
        return empleadoRepository.findById(id);
    }

    public ArrayList<EmpleadoModel> obtenerPorDepartamento(Integer departamento) {
        return empleadoRepository.findByDepartamento(departamento);

    }

    public boolean elimnarEmpleado(Long id) {
        try {
            empleadoRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}
