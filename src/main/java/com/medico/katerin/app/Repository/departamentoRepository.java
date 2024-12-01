package com.medico.katerin.app.Repository;

import com.medico.katerin.app.variables.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface departamentoRepository extends JpaRepository<Departamento, Long> {
}