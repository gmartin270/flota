package org.web3.flota.bussiness.factory;

import org.web3.flota.bussiness.facade.CreateFacade;
import org.web3.flota.bussiness.facade.EditFacade;
import org.web3.flota.bussiness.facade.TipoFacade;
import org.web3.flota.bussiness.facade.RemoveFacade;
import org.web3.flota.bussiness.facade.SearchFacade;

public class FactoryFacade {

	public static Object getFacade(TipoFacade tipo){
		Object facade = null;

		switch(tipo){
			case CREATE:
				facade = (Object)CreateFacade.getInstance();
				break;
			case EDIT:
				facade = (Object)EditFacade.getInstance();
				break;
			case REMOVE:
				facade = (Object)RemoveFacade.getInstance();
				break;
			case SEARCH:
				facade = (Object)SearchFacade.getInstance();
				break;
			default:
				facade = null;
		}
		
		return facade;
	}
}
