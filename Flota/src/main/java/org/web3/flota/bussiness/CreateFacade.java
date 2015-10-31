package org.web3.flota.bussiness;

import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.model.ClienteDTO;
import org.web3.flota.model.VehiculoDTO;

public class CreateFacade {
	
	private static CreateFacade instance;
	private IFactoryObjectBO factory;
	
	private CreateFacade(){
		factory = new FactoryObjectBO();
	};
	
	public static CreateFacade getInstance(){
		
		if(instance == null)
			instance = new CreateFacade();
		
		return instance;
	}
	
	public void create(String clase, Object objeto) throws CreateObjectException{
		
		switch(clase){
		case "vehiculo":
			VehiculoBO vehiculo = (VehiculoBO)factory.createObjectBO(clase);
			vehiculo.createVehiculo((VehiculoDTO)objeto);
			
		case "cliente":
			ClienteBO cliente = (ClienteBO)factory.createObjectBO(clase);
			cliente.createCliente((ClienteDTO)objeto);
		}
	}	
}
