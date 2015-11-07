package org.web3.flota.bussiness.facade;

import org.web3.flota.bussiness.AbstractObjectBO;
import org.web3.flota.bussiness.ClienteBO;
import org.web3.flota.bussiness.VehiculoBO;
import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.factory.FactoryObjectBO;
import org.web3.flota.model.ClienteDTO;
import org.web3.flota.model.VehiculoDTO;

public class CreateFacade {
	
	private static CreateFacade instance;
	
	private CreateFacade(){};
	
	public static CreateFacade getInstance(){
		
		if(instance == null)
			instance = new CreateFacade();
		
		return instance;
	}
	
	public void create(Object objetoDTO) throws CreateObjectException {
		AbstractObjectBO bo = null;
		
		if(objetoDTO instanceof VehiculoDTO) {
			bo = (VehiculoBO)FactoryObjectBO.getInstance().createObjectBO(objetoDTO);			
		} else if(objetoDTO instanceof ClienteDTO) {
			bo = (ClienteBO)FactoryObjectBO.getInstance().createObjectBO(objetoDTO);
		}
		
		bo.createObject(objetoDTO);
	}	
}
