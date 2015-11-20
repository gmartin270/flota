package org.web3.flota.testapp;

import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.facade.CreateFacade;
import org.web3.flota.bussiness.facade.TipoFacade;
import org.web3.flota.bussiness.factory.FactoryFacade;
import org.web3.flota.model.TipoDocumentoDTO;

public class InsertTipoDocumento {

	public static void main(String[] args) {
		
		CreateFacade facadeCreate = (CreateFacade)FactoryFacade.getFacade(TipoFacade.CREATE);
		
		TipoDocumentoDTO tipo = new TipoDocumentoDTO();
		tipo.setDescripcion("DNI");
		
		try {
			facadeCreate.create(tipo);
		} catch (CreateObjectException e) {
			e.printStackTrace();
		}
		
		tipo = new TipoDocumentoDTO();
		tipo.setDescripcion("Cedula");
		
		try {
			facadeCreate.create(tipo);
		} catch (CreateObjectException e) {
			e.printStackTrace();
		}
	}
}
