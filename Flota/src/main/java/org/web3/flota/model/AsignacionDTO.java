package org.web3.flota.model;

import java.util.Date;

public class AsignacionDTO {
	private String id;
	private ClienteDTO persona;
	private VehiculoDTO vehiculo;
	private Date fechaEntrega;
	private Date fechaDevolucion;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ClienteDTO getPersona() {
		return persona;
	}
	public void setPersona(ClienteDTO persona) {
		this.persona = persona;
	}
	public VehiculoDTO getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(VehiculoDTO vehiculo) {
		this.vehiculo = vehiculo;
	}
	public Date getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
}
