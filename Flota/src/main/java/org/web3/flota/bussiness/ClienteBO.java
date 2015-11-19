package org.web3.flota.bussiness;

import java.util.List;

import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.exceptions.EditObjectException;
import org.web3.flota.bussiness.exceptions.RemoveObjectException;
import org.web3.flota.bussiness.exceptions.SearchObjectException;
import org.web3.flota.bussiness.factory.IObjectBO;
import org.web3.flota.persist.ClienteDAO;

public class ClienteBO implements IObjectBO {
	
	private static ClienteBO instance;
	private ClienteDAO clienteDAO;
	
	private ClienteBO(){
		clienteDAO = ClienteDAO.getInstance();
	};
	
	public static ClienteBO getInstance(){
		if(instance == null)
			instance = new ClienteBO();
		
		return instance;
	}
	
	public void createObject(Object objectDTO) throws CreateObjectException{
		clienteDAO.create(objectDTO);
	}
	
	public void editObject(String id, Object clienteDTO) throws EditObjectException{
		
	}
	
	public void removeObject(Object clienteDTO) throws RemoveObjectException{
		
	}
	
	public List<Object> getAll() throws SearchObjectException{
		return null;
	}
}
