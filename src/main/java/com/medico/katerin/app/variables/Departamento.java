package com.medico.katerin.app.variables;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="departamento")
public class Departamento{
	@Id
	private Long id;
	private String nombre;
	private String codigo;
	private int ubicacion;
	private String jefe;
	private int numeroDe_Personal;
	private int capacidadMaxPacientes;
	private String telefono;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(int ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getJefe() {
		return jefe;
	}
	public void setJefe(String jefe) {
		this.jefe = jefe;
	}
	public int getNumeroDe_Personal() {
		return numeroDe_Personal;
	}
	public void setNumeroDe_Personal(int numeroDe_Personal) {
		this.numeroDe_Personal = numeroDe_Personal;
	}
	public int getCapacidadMaxPacientes() {
		return capacidadMaxPacientes;
	}
	public void setCapacidadMaxPacientes(int capacidadMaxPacientes) {
		this.capacidadMaxPacientes = capacidadMaxPacientes;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
}