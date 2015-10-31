package org.web3.flota.model;

public class ModeloDTO {
	private String id;
	private String nombre;
	private MarcaDTO marca;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public MarcaDTO getMarca() {
		return marca;
	}
	public void setMarca(MarcaDTO marca) {
		this.marca = marca;
	}
}
