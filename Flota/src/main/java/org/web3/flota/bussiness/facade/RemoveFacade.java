package org.web3.flota.bussiness.facade;

import org.web3.flota.bussiness.AbstractObjectBO;
import org.web3.flota.bussiness.ClienteBO;
import org.web3.flota.bussiness.VehiculoBO;
import org.web3.flota.bussiness.exceptions.RemoveObjectException;
import org.web3.flota.bussiness.factory.FactoryObjectBO;
import org.web3.flota.model.VehiculoDTO;

public class RemoveFacade {
	
	private static RemoveFacade instance;
	
	private RemoveFacade(){};
	
	public static RemoveFacade getInstance(){
		
		if(instance == null)
			instance = new RemoveFacade();
		
		return instance;
	}
	
	public void remove(Object objetoDTO) throws RemoveObjectException{
		AbstractObjectBO bo = null;
		
		if(objetoDTO instanceof VehiculoDTO){
			bo = (VehiculoBO)FactoryObjectBO.getInstance().createObjectBO(objetoDTO);
		}else{
			bo = (ClienteBO)FactoryObjectBO.getInstance().createObjectBO(objetoDTO);
		}
		
		bo.removeObject(objetoDTO);
	}	
}
