package org.web3.flota.testapp;

import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.facade.CreateFacade;
import org.web3.flota.bussiness.facade.TipoFacade;
import org.web3.flota.bussiness.factory.FactoryFacade;
import org.web3.flota.model.UsuarioDTO;

public class InsertUsuario {

	public static void main(String[] args) {
		
		CreateFacade facadeCreate = (CreateFacade)FactoryFacade.getFacade(TipoFacade.CREATE);
		
		UsuarioDTO p = new UsuarioDTO();
		p.setUsuario("gmartin");
		p.setPassword("patoxkgm");
		p.setNomCompleto("Guillermo Martín");
		
		try {
			facadeCreate.create(p);
		} catch (CreateObjectException e) {
			e.printStackTrace();
		}
		
		try {
			facadeCreate.create(p);
		} catch (CreateObjectException e) {
			e.printStackTrace();
		}
	}
}
