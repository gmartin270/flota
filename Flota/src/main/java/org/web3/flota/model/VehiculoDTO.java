package org.web3.flota.model;

public class VehiculoDTO {
	private String id;
	private ModeloDTO modelo;
	private PolizaDTO poliza;
	private TipoVehiculoDTO tipo;
	private EstadoVehiculoDTO estado;
	
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
}
