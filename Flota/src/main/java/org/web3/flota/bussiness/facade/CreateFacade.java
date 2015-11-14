package org.web3.flota.bussiness.facade;

import org.web3.flota.bussiness.AbstractObjectBO;
import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.factory.FactoryObjectBO;

public class CreateFacade {
	
	private static CreateFacade instance;
	
	private CreateFacade(){};
	
	public static CreateFacade getInstance(){
		
		if(instance == null)
			instance = new CreateFacade();
		
		return instance;
	}
	
	public void create(Object objetoDTO) throws CreateObjectException {
		AbstractObjectBO bo = FactoryObjectBO.createObjectBO(objetoDTO);
		
		bo.createObject(objetoDTO);
	}	
}
