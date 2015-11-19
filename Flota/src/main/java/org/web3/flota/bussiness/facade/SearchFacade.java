package org.web3.flota.bussiness.facade;

import java.util.List;

import org.web3.flota.bussiness.exceptions.SearchObjectException;
import org.web3.flota.bussiness.factory.FactoryObjectBO;
import org.web3.flota.bussiness.factory.IObjectBO;

public class SearchFacade {
	private static SearchFacade instance;
	
	public static SearchFacade getInstance(){
		if(instance == null)
			instance = new SearchFacade();
		
		return instance;
	}
	
	public List<Object> getAllObjects(Class<?> clazz) throws SearchObjectException {
		IObjectBO bo = FactoryObjectBO.createObjectBO(clazz);
		
		return bo.getAll();
	}
}
