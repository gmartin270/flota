package org.web3.flota.testapp;

import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.facade.CreateFacade;
import org.web3.flota.bussiness.facade.TipoFacade;
import org.web3.flota.bussiness.factory.FactoryFacade;
import org.web3.flota.model.PaisDTO;

public class InsertPais {

	public static void main(String[] args) {
		
		CreateFacade facadeCreate = (CreateFacade)FactoryFacade.getFacade(TipoFacade.CREATE);
		
		PaisDTO p = new PaisDTO();
		p.setAbreviatura("AR");
		p.setNombre("Argentina");
		
		try {
			facadeCreate.create(p);
		} catch (CreateObjectException e) {
			e.printStackTrace();
		}
		
		p = new PaisDTO();
		p.setAbreviatura("BR");
		p.setNombre("Brasil");
		
		try {
			facadeCreate.create(p);
		} catch (CreateObjectException e) {
			e.printStackTrace();
		}
		
		p = new PaisDTO();
		p.setAbreviatura("CL");
		p.setNombre("Chile");
		
		try {
			facadeCreate.create(p);
		} catch (CreateObjectException e) {
			e.printStackTrace();
		}
	}
}
