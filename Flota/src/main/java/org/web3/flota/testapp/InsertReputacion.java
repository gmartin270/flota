package org.web3.flota.testapp;

import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.facade.CreateFacade;
import org.web3.flota.bussiness.facade.TipoFacade;
import org.web3.flota.bussiness.factory.FactoryFacade;
import org.web3.flota.model.ReputacionDTO;

public class InsertReputacion {

	public static void main(String[] args) {
		
		CreateFacade facadeCreate = (CreateFacade)FactoryFacade.getFacade(TipoFacade.CREATE);
		
		ReputacionDTO rep = new ReputacionDTO();
		rep.setDescripcion("Excelente");
		
		try {
			facadeCreate.create(rep);
		} catch (CreateObjectException e) {
			e.printStackTrace();
		}
		
		rep = new ReputacionDTO();
		rep.setDescripcion("Bueno");
		
		try {
			facadeCreate.create(rep);
		} catch (CreateObjectException e) {
			e.printStackTrace();
		}
		
		rep = new ReputacionDTO();
		rep.setDescripcion("Regular");
		
		try {
			facadeCreate.create(rep);
		} catch (CreateObjectException e) {
			e.printStackTrace();
		}
		
		rep = new ReputacionDTO();
		rep.setDescripcion("Malo");
		
		try {
			facadeCreate.create(rep);
		} catch (CreateObjectException e) {
			e.printStackTrace();
		}
	}
}
