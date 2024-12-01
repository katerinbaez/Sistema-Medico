package com.medico.katerin.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medico.katerin.app.variables.Servicio;


public interface servicioRepository extends JpaRepository<Servicio, Long>  {

}
