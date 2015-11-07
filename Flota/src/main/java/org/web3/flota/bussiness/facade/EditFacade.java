package org.web3.flota.bussiness.facade;

import org.web3.flota.bussiness.AbstractObjectBO;
import org.web3.flota.bussiness.ClienteBO;
import org.web3.flota.bussiness.VehiculoBO;
import org.web3.flota.bussiness.exceptions.EditObjectException;
import org.web3.flota.bussiness.factory.FactoryObjectBO;
import org.web3.flota.model.ClienteDTO;
import org.web3.flota.model.VehiculoDTO;

public class EditFacade {
	
	private static EditFacade instance;
	
	private EditFacade(){};
	
	public static EditFacade getInstance(){
		
		if(instance == null)
			instance = new EditFacade();
		
		return instance;
	}
	
	public void edit(String id, Object objetoDTO) throws EditObjectException{
		AbstractObjectBO bo = null;
		
		if(objetoDTO instanceof VehiculoDTO) {
			bo = (VehiculoBO)FactoryObjectBO.getInstance().createObjectBO(objetoDTO);
			
		} else if(objetoDTO instanceof ClienteDTO) {
			bo = (ClienteBO)FactoryObjectBO.getInstance().createObjectBO(objetoDTO);
			
		}
		
		bo.editObject(id, objetoDTO);
	}	
}
