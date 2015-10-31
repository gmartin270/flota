package org.web3.flota.bussiness;

public class SearchFacade {
	private static SearchFacade instance;
	
	public static SearchFacade getInstance(){
		
		if(instance == null)
			instance = new SearchFacade();
		
		return instance;
	}
}