package org.web3.flota.model;

import java.util.Date;

public class PolizaDTO {
	private String id;
	private SeguroDTO asegurador;
	private Long numero;
	private String cobertura;
	private Date fechaDesde;
	private Date fechaHasta;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public SeguroDTO getAsegurador() {
		return asegurador;
	}
	public void setAsegurador(SeguroDTO asegurador) {
		this.asegurador = asegurador;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public String getCobertura() {
		return cobertura;
	}
	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	public Date getFechaDesde() {
		return fechaDesde;
	}
	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}
	public Date getFechaHasta() {
		return fechaHasta;
	}
	public void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = fechaHasta;
	}
	
}
