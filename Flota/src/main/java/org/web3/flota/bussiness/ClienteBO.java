package org.web3.flota.bussiness;

import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.exceptions.EditObjectException;
import org.web3.flota.bussiness.exceptions.RemoveObjectException;
import org.web3.flota.model.ClienteDTO;

public class ClienteBO {
	
	private static ClienteBO instance;
	
	private ClienteBO(){};
	
	public static ClienteBO getInstance(){
		if(instance == null)
			instance = new ClienteBO();
		
		return instance;
	}
	
	public void createCliente(ClienteDTO cliente) throws CreateObjectException{
		
	}
	
	public void editCliente(String id, ClienteDTO cliente) throws EditObjectException{
		
	}
	
	public void removeCliente (String id) throws RemoveObjectException{
		
	}
}
