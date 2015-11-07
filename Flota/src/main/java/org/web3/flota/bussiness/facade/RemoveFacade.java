package org.web3.flota.bussiness.facade;

import org.web3.flota.bussiness.ClienteBO;
import org.web3.flota.bussiness.VehiculoBO;
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
	
	public void edit(String clase, String id) throws RemoveObjectException{
		
		switch(clase){
		case "vehiculo":
			VehiculoBO vehiculo = (VehiculoBO)FactoryObjectBO.getInstance().createObjectBO(clase);
			vehiculo.removeVehiculo(id);
			
		case "cliente":
			ClienteBO cliente = (ClienteBO)FactoryObjectBO.getInstance().createObjectBO(clase);
			cliente.removeCliente(id);
		}
	}	
}
