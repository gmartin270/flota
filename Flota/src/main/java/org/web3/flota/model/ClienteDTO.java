package org.web3.flota.model;

public class ClienteDTO {
	private String id;
	private String nombres;
	private String apellidos;
	private TipoDocumentoDTO tipo;
	private String nroDocumento;
	private PaisDTO nacionalidad;
	private String direccion;
	private ReputacionDTO reputacion;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNroDocumento() {
		return nroDocumento;
	}
	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	public TipoDocumentoDTO getTipo() {
		return tipo;
	}
	public void setTipo(TipoDocumentoDTO tipo) {
		this.tipo = tipo;
	}
	public PaisDTO getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(PaisDTO nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public ReputacionDTO getReputacion() {
		return reputacion;
	}
	public void setReputacion(ReputacionDTO reputacion) {
		this.reputacion = reputacion;
	}
	
	@Override
	public String toString(){
		return apellidos + ", " + nombres + " - " + tipo.getDescripcion() + ": " + nroDocumento;
	}
}
