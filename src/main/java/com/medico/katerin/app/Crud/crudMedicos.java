package com.medico.katerin.app.Crud;

import org.springframework.data.repository.CrudRepository;

import com.medico.katerin.app.variables.Medicos;


public interface crudMedicos extends CrudRepository <Medicos, Long> {

}
