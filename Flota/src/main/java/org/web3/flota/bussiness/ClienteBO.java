package org.web3.flota.bussiness;

import org.web3.flota.bussiness.exceptions.CreateClienteException;
import org.web3.flota.bussiness.exceptions.EditClienteException;
import org.web3.flota.bussiness.exceptions.RemoveClienteException;
import org.web3.flota.model.ClienteDTO;

public class ClienteBO {
	
	private static ClienteBO instance;
	
	private ClienteBO(){};
	
	public static ClienteBO getInstance(){
		if(instance == null)
			instance = new ClienteBO();
		
		return instance;
	}
	
	public void createCliente(ClienteDTO cliente) throws CreateClienteException{
		
	}
	
	public void editCliente(String id, ClienteDTO cliente) throws EditClienteException{
		
	}
	
	public void removeCliente (String id) throws RemoveClienteException{
		
	}
}
