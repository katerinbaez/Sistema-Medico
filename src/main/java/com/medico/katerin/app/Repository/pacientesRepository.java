package com.medico.katerin.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medico.katerin.app.variables.Pacientes;


public interface pacientesRepository extends JpaRepository<Pacientes, Long>  {

}
