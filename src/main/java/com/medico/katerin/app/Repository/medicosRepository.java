package com.medico.katerin.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medico.katerin.app.variables.Medicos;


public interface medicosRepository extends JpaRepository<Medicos, Long> {

}
