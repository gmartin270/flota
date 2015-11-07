package org.web3.flota.bussiness;

import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.exceptions.EditObjectException;
import org.web3.flota.bussiness.exceptions.RemoveObjectException;
import org.web3.flota.model.ClienteDTO;

public class ClienteBO extends AbstractObjectBO {
	
	private static ClienteBO instance;
	
	private ClienteBO(){};
	
	public static ClienteBO getInstance(){
		if(instance == null)
			instance = new ClienteBO();
		
		return instance;
	}
	
	@Override
	public void createObject(Object clienteDTO) throws CreateObjectException{
		
	}
	
	@Override
	public void editObject(String id, Object clienteDTO) throws EditObjectException{
		
	}
	
	@Override
	public void removeObject(Object clienteDTO) throws RemoveObjectException{
		
	}
}
