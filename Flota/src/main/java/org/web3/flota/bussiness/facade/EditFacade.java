package org.web3.flota.bussiness.facade;

import org.web3.flota.bussiness.AbstractObjectBO;
import org.web3.flota.bussiness.exceptions.EditObjectException;
import org.web3.flota.bussiness.factory.FactoryObjectBO;

public class EditFacade {
	
	private static EditFacade instance;
	
	private EditFacade(){};
	
	public static EditFacade getInstance(){
		
		if(instance == null)
			instance = new EditFacade();
		
		return instance;
	}
	
	public void edit(String id, Object objetoDTO) throws EditObjectException{
		AbstractObjectBO bo = FactoryObjectBO.createObjectBO(objetoDTO);
		
		bo.editObject(id, objetoDTO);
	}	
}
