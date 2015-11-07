package org.web3.flota.bussiness.factory;

import org.web3.flota.bussiness.facade.CreateFacade;
import org.web3.flota.bussiness.facade.EditFacade;
import org.web3.flota.bussiness.facade.RemoveFacade;
import org.web3.flota.bussiness.facade.SearchFacade;


public class FactoryFacade implements IFactoryFacade {

	private static FactoryFacade instance;
	
	private FactoryFacade(){};
	
	public static FactoryFacade getInstance(){
		if(instance == null)
			instance = new FactoryFacade();
		
		return instance;
	}
	
	public Object getFacade(String tipo){
		
		switch (tipo) {
		case "create":
			return (Object)CreateFacade.getInstance();
		
		case "edit":
			return (Object)EditFacade.getInstance();
			
		case "remove":
			return (Object)RemoveFacade.getInstance();
		
		case "search":
			return (Object)SearchFacade.getInstance();
			
		default:
			return null;
		}
	}
}
