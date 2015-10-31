package org.web3.flota.bussiness;

import org.web3.flota.bussiness.exceptions.RemoveObjectException;

public class RemoveFacade {
	
	private static RemoveFacade instance;
	private IFactoryObjectBO factory;
	
	private RemoveFacade(){
		factory = new FactoryObjectBO();
	};
	
	public static RemoveFacade getInstance(){
		
		if(instance == null)
			instance = new RemoveFacade();
		
		return instance;
	}
	
	public void edit(String clase, String id) throws RemoveObjectException{
		
		switch(clase){
		case "vehiculo":
			VehiculoBO vehiculo = (VehiculoBO)factory.createObjectBO(clase);
			vehiculo.removeVehiculo(id);
			
		case "cliente":
			ClienteBO cliente = (ClienteBO)factory.createObjectBO(clase);
			cliente.removeCliente(id);
		}
	}	
}
