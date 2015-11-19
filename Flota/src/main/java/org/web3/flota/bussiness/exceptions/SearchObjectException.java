package org.web3.flota.bussiness.exceptions;

public class SearchObjectException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6995065915686767647L;
	private String mensaje;
	private String codigo;
	
	public SearchObjectException(String mensaje){
		this.mensaje = mensaje;
	}
	
	public String getMessage(){
		return mensaje;
	}
}
