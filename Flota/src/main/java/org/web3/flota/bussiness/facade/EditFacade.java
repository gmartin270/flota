package org.web3.flota.bussiness.facade;

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
	
	public void edit(String id, Object objeto) throws EditObjectException{
		if(objeto instanceof VehiculoDTO) {
			VehiculoBO vehiculoBo = (VehiculoBO)FactoryObjectBO.getInstance().createObjectBO(objeto);
			vehiculoBo.editVehiculo(id, (VehiculoDTO)objeto);
		} else if(objeto instanceof ClienteDTO) {
			ClienteBO cliente = (ClienteBO)FactoryObjectBO.getInstance().createObjectBO(objeto);
			cliente.editCliente(id, (ClienteDTO)objeto);
		}
	}	
}
