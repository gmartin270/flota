package org.web3.flota.bussiness.facade;

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
	
	public void create(Object objeto) throws CreateObjectException {
		if(objeto instanceof VehiculoDTO) {
			VehiculoBO vehiculoBo = (VehiculoBO)FactoryObjectBO.getInstance().createObjectBO(objeto);
			vehiculoBo.createVehiculo((VehiculoDTO)objeto);
		} else if(objeto instanceof ClienteDTO) {
			ClienteBO cliente = (ClienteBO)FactoryObjectBO.getInstance().createObjectBO(objeto);
			cliente.createCliente((ClienteDTO)objeto);
		}
	}	
}
