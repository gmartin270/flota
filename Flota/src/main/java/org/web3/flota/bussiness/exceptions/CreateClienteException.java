package org.web3.flota.bussiness.exceptions;

public class CreateClienteException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7008380730011952422L;
	private String mensaje;
	private String codigo;
	
	public CreateClienteException(String mensaje){
		this.mensaje = mensaje;
	}
	
	public String getMessage(){
		return mensaje;
	}
}
