package org.web3.flota.bussiness.factory;

import org.web3.flota.bussiness.AbstractObjectBO;
import org.web3.flota.bussiness.ClienteBO;
import org.web3.flota.bussiness.VehiculoBO;
import org.web3.flota.model.ClienteDTO;
import org.web3.flota.model.VehiculoDTO;

public class FactoryObjectBO implements IFactoryObjectBO {
	
	public static AbstractObjectBO createObjectBO(Object objetoDTO) {
		AbstractObjectBO objectBO = null;
		
		if(objetoDTO instanceof VehiculoDTO) {
			objectBO = VehiculoBO.getInstance();
		} else if(objetoDTO instanceof ClienteDTO) {
			objectBO = ClienteBO.getInstance();
		}
		
		return objectBO;		
	}
}
