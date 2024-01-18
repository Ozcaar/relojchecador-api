package com.ozcaar.relojchecador.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ozcaar.relojchecador.models.EmpleadoModel;

@Repository
public interface EmpleadoRepository extends CrudRepository<EmpleadoModel, Long> {
    public abstract ArrayList<EmpleadoModel> findByDepartamento(Integer departamento);
}
