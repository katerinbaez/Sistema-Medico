package com.medico.katerin.app.variables;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="director")
public class Director{
	@Id
	private Long id;
	private String nombre;
	private String apellido;
	private int edad;
	private String departamentoAsignado;
	private String identificacion;
	private String telefono;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDepartamentoAsignado() {
		return departamentoAsignado;
	}
	public void setDepartamentoAsignado(String departamentoAsignado) {
		this.departamentoAsignado = departamentoAsignado;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
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