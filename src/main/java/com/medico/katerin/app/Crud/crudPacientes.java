package com.medico.katerin.app.Crud;

import org.springframework.data.repository.CrudRepository;

import com.medico.katerin.app.variables.Pacientes;

public interface crudPacientes extends CrudRepository<Pacientes,Long> {

}
