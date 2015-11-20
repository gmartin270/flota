package org.web3.flota.presentation.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.web3.flota.bussiness.exceptions.SearchObjectException;
import org.web3.flota.bussiness.facade.SearchFacade;
import org.web3.flota.bussiness.facade.TipoFacade;
import org.web3.flota.bussiness.factory.FactoryFacade;
import org.web3.flota.model.ReputacionDTO;

@ManagedBean(name="reputacionService")
@ApplicationScoped
public class ReputacionService {

	private List<Object> reputaciones;
	
	@PostConstruct
	public void init(){
		SearchFacade sfacade = (SearchFacade)FactoryFacade.getFacade(TipoFacade.SEARCH);
		
		try{
			reputaciones = (List<Object>)sfacade.getAll(ReputacionDTO.class);
		}catch (SearchObjectException e){
			
		}
	}

	public List<Object> getReputaciones() {
		return reputaciones;
	}	
}
