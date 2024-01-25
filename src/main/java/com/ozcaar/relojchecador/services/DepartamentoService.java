package com.ozcaar.relojchecador.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ozcaar.relojchecador.models.DepartamentoModel;
import com.ozcaar.relojchecador.repositories.DepartamentoRepository;

@Service
public class DepartamentoService {

    @Autowired
    DepartamentoRepository departamentoRepository;

    public ArrayList<DepartamentoModel> obtenerDepartamento() {
        return (ArrayList<DepartamentoModel>) departamentoRepository.findAll();
    }

    public DepartamentoModel guardarDepartamento(DepartamentoModel departamento) {
        return departamentoRepository.save(departamento);
    }

    public Optional<DepartamentoModel> obtenerPorId(Long id) {
        return departamentoRepository.findById(id);
    }
}
