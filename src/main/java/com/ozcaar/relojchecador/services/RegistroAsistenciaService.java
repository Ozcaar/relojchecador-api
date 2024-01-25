package com.ozcaar.relojchecador.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ozcaar.relojchecador.repositories.RegistroAsistenciaRepository;
import com.ozcaar.relojchecador.models.RegistroAsistenciaModel;;

@Service
public class RegistroAsistenciaService {

    @Autowired
    RegistroAsistenciaRepository registroAsistenciaRepository;

    public ArrayList<RegistroAsistenciaModel> obtenerRegistro() {
        return (ArrayList<RegistroAsistenciaModel>) registroAsistenciaRepository.findAll();
    }

    public RegistroAsistenciaModel guardarRegistro(RegistroAsistenciaModel registro) {
        return registroAsistenciaRepository.save(registro);
    }

    public Optional<RegistroAsistenciaModel> obtenerPorId(Long id) {
        return registroAsistenciaRepository.findById(id);
    }
}
