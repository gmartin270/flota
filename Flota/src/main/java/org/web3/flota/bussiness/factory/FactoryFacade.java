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
	
	public Object getFacade(Class<?> clazz){
		Object facade = null;
		
		if(clazz.equals(CreateFacade.class)){
			facade = (Object)CreateFacade.getInstance();
		}else if(clazz.equals(EditFacade.class)){
			facade = (Object)EditFacade.getInstance();
		}else if(clazz.equals(RemoveFacade.class)){
			facade = (Object)RemoveFacade.getInstance();
		}else if(clazz.equals(SearchFacade.class)){
			facade = (Object)SearchFacade.getInstance();
		}
		
		return facade;
	}
}
