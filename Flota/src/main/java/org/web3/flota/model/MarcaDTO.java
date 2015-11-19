package org.web3.flota.model;

import java.util.List;

public class MarcaDTO {
	private String id;
	private String nombre;
	private List<ModeloDTO> modelos;
	
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
	public List<ModeloDTO> getModelos() {
		return modelos;
	}
	public void setModelos(List<ModeloDTO> modelos) {
		this.modelos = modelos;
	}
}
