package com.medico.katerin.app.variables;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="servicios")
public class Servicio{
	@Id
	private Long id;
	private String nombre;
	private String requisitos;
	private int codigoServicio;
	private String costo;
	private String tipoServicio;
	private String frecuenciaAtencion;
	private String estado;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRequisitos() {
		return requisitos;
	}
	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}
	public int getCodigoServicio() {
		return codigoServicio;
	}
	public void setCodigoServicio(int codigoServicio) {
		this.codigoServicio = codigoServicio;
	}
	public String getCosto() {
		return costo;
	}
	public void setCosto(String costo) {
		this.costo = costo;
	}
	public String getTipoServicio() {
		return tipoServicio;
	}
	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}
	public String getFrecuenciaAtencion() {
		return frecuenciaAtencion;
	}
	public void setFrecuenciaAtencion(String frecuenciaAtencion) {
		this.frecuenciaAtencion = frecuenciaAtencion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}