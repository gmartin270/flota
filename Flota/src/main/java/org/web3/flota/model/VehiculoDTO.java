package org.web3.flota.model;

import java.util.List;

public class VehiculoDTO {
	private String id;
	private ModeloDTO modelo;
	private PolizaDTO poliza;
	private TipoVehiculoDTO tipo;
	private EstadoVehiculoDTO estado;
	private String dominio;
	private CedulaDTO cedulaVerde;
	private List<CedulaDTO> cedulasAzul;
	private String categoria;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ModeloDTO getModelo() {
		return modelo;
	}
	public void setModelo(ModeloDTO modelo) {
		this.modelo = modelo;
	}
	public PolizaDTO getPoliza() {
		return poliza;
	}
	public void setPoliza(PolizaDTO poliza) {
		this.poliza = poliza;
	}
	public TipoVehiculoDTO getTipo() {
		return tipo;
	}
	public void setTipo(TipoVehiculoDTO tipo) {
		this.tipo = tipo;
	}
	public EstadoVehiculoDTO getEstado() {
		return estado;
	}
	public void setEstado(EstadoVehiculoDTO estado) {
		this.estado = estado;
	}
	public String getDominio() {
		return dominio;
	}
	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	public CedulaDTO getCedulaVerde() {
		return cedulaVerde;
	}
	public void setCedulaVerde(CedulaDTO cedulaVerde) {
		this.cedulaVerde = cedulaVerde;
	}
	public List<CedulaDTO> getCedulasAzul() {
		return cedulasAzul;
	}
	public void setCedulasAzul(List<CedulaDTO> cedulasAzul) {
		this.cedulasAzul = cedulasAzul;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
