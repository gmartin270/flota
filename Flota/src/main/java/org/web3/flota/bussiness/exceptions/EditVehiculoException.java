package org.web3.flota.bussiness.exceptions;

public class EditVehiculoException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3023233466604864179L;
	private String mensaje;
	private String codigo;
	
	public EditVehiculoException(String mensaje){
		this.mensaje = mensaje;
	}
	
	public String getMessage(){
		return mensaje;
	}
}
