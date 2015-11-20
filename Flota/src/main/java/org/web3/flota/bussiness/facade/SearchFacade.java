package org.web3.flota.bussiness.facade;

import java.util.List;

import org.web3.flota.bussiness.UsuarioBO;
import org.web3.flota.bussiness.exceptions.SearchObjectException;
import org.web3.flota.bussiness.factory.FactoryObjectBO;
import org.web3.flota.bussiness.factory.IObjectBO;
import org.web3.flota.model.UsuarioDTO;

public class SearchFacade {
	private static SearchFacade instance;
	
	public static SearchFacade getInstance(){
		if(instance == null)
			instance = new SearchFacade();
		
		return instance;
	}
	
	public List<Object> getAll(Class<?> clazz) throws SearchObjectException {
		IObjectBO bo = FactoryObjectBO.createObjectBO(clazz);
		
		return bo.getAll();
	}
	
	public boolean validarUsuario(String login, String password) throws SearchObjectException {
		UsuarioBO bo = (UsuarioBO)FactoryObjectBO.createObjectBO(UsuarioDTO.class);
		
		return bo.validarUsuario(login, password);
	}
}
