package com.medico.katerin.app.variables;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="centros")
public class Centros{
	@Id
	private Long id;
	
	@OneToOne
	private Director director;
	
	@OneToMany
	private List <Pacientes>pacientes;
	
	@OneToMany
	private List <Medicos>medicos;

	@ManyToOne
	private Departamento departamento;
	
	@ManyToMany
	private List <Servicio>servicios;
	
	public Long getId() {
		return id;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}
	
	public Director getDirector() {
		return director;
	}
	
	public List<Medicos> getMedicos() {
		return medicos;
	}
	
	public List<Pacientes> getPacientes() {
		return pacientes;
	}
	
	public List<Servicio> getServicios() {
		return servicios;
	}
	
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public void setDirector(Director director) {
		this.director = director;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setMedicos(List<Medicos> medicos) {
		this.medicos = medicos;
	}
	
	public void setPacientes(List<Pacientes> pacientes) {
		this.pacientes = pacientes;
	}
	
	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}
	
	
}






