package com.ozcaar.relojchecador.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ozcaar.relojchecador.models.DepartamentoModel;

@Repository
public interface DepartamentoRepository extends CrudRepository<DepartamentoModel, Long> {

}
