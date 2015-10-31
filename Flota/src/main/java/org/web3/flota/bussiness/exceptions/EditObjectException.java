package org.web3.flota.bussiness.exceptions;

public class EditObjectException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8868808074691188791L;
	private String mensaje;
	private String codigo;
	
	public EditObjectException(String mensaje){
		this.mensaje = mensaje;
	}
	
	public String getMessage(){
		return mensaje;
	}
}
