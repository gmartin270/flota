package org.web3.flota.bussiness.factory;

import org.web3.flota.bussiness.ClienteBO;
import org.web3.flota.bussiness.VehiculoBO;
import org.web3.flota.model.ClienteDTO;
import org.web3.flota.model.VehiculoDTO;

public class FactoryObjectBO implements IFactoryObjectBO {

	private static FactoryObjectBO instance;
	
	private FactoryObjectBO() {};
	
	public static FactoryObjectBO getInstance(){
		if(instance == null)
			instance = new FactoryObjectBO();
		
		return instance;
	}
	
	@Override
	public Object createObjectBO(Object objetoDTO) {
		Object objectBO = null;
		
		if(objetoDTO instanceof VehiculoDTO) {
			objectBO = VehiculoBO.getInstance();
		} else if(objetoDTO instanceof ClienteDTO) {
			objectBO = ClienteBO.getInstance();
		}
		
		return objectBO;		
	}
}
