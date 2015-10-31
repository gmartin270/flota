package org.web3.flota.bussiness;

import org.web3.flota.bussiness.exceptions.EditObjectException;
import org.web3.flota.model.ClienteDTO;
import org.web3.flota.model.VehiculoDTO;

public class EditFacade {
	
	private static EditFacade instance;
	private IFactoryObjectBO factory;
	
	private EditFacade(){
		factory = new FactoryObjectBO();
	};
	
	public static EditFacade getInstance(){
		
		if(instance == null)
			instance = new EditFacade();
		
		return instance;
	}
	
	public void edit(String clase, String id, Object objeto) throws EditObjectException{
		
		switch(clase){
		case "vehiculo":
			VehiculoBO vehiculo = (VehiculoBO)factory.createObjectBO(clase);
			vehiculo.editVehiculo(id, (VehiculoDTO)objeto);
			
		case "cliente":
			ClienteBO cliente = (ClienteBO)factory.createObjectBO(clase);
			cliente.editCliente(id, (ClienteDTO)objeto);
		}
	}	
}
