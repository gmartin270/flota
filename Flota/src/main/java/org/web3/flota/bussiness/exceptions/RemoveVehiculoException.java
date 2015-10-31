package org.web3.flota.bussiness.exceptions;

public class RemoveVehiculoException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4416006391632727036L;
	private String mensaje;
	private String codigo;
	
	public RemoveVehiculoException(String mensaje){
		this.mensaje = mensaje;
	}
	
	public String getMessage(){
		return mensaje;
	}
}
