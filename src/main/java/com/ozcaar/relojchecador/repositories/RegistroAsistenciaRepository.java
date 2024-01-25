package com.ozcaar.relojchecador.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ozcaar.relojchecador.models.RegistroAsistenciaModel;

@Repository

public interface RegistroAsistenciaRepository extends CrudRepository<RegistroAsistenciaModel, Long> {

    // public abstract ArrayList<RegistroAsistenciaModel> fifindByEmpleadoId(Integer
    // empleadoId);
}
