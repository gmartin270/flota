package org.web3.flota.bussiness.exceptions;

public class CreateVehiculoException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6421312933649024135L;
	private String mensaje;
	private String codigo;
	
	public CreateVehiculoException(String mensaje){
		this.mensaje = mensaje;
	}
	
	public String getMessage(){
		return mensaje;
	}
}
