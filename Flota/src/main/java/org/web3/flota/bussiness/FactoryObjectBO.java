package org.web3.flota.bussiness;

public class FactoryObjectBO implements IFactoryObjectBO {

	@Override
	public Object createObjectBO(String clase) {
		
		switch(clase){
			case "vehiculo":
				return ((Object)VehiculoBO.getInstance());
			
			case "cliente":
				return ((Object)ClienteBO.getInstance());
				
			default:
				return null;
		}
	}

}
