package org.web3.flota.bussiness.facade;

import org.web3.flota.bussiness.AbstractObjectBO;
import org.web3.flota.bussiness.exceptions.RemoveObjectException;
import org.web3.flota.bussiness.factory.FactoryObjectBO;

public class RemoveFacade {
	
	private static RemoveFacade instance;
	
	private RemoveFacade(){};
	
	public static RemoveFacade getInstance(){
		
		if(instance == null)
			instance = new RemoveFacade();
		
		return instance;
	}
	
	public void remove(Object objetoDTO) throws RemoveObjectException{
		AbstractObjectBO bo = FactoryObjectBO.createObjectBO(objetoDTO);
		
		bo.removeObject(objetoDTO);
	}	
}
