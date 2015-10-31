package org.web3.flota.bussiness;

public class FactoryFacade implements IFactoryFacade {

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
