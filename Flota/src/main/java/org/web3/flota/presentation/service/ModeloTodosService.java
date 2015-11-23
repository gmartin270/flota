package org.web3.flota.presentation.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.web3.flota.bussiness.exceptions.SearchObjectException;
import org.web3.flota.bussiness.facade.SearchFacade;
import org.web3.flota.bussiness.facade.TipoFacade;
import org.web3.flota.bussiness.factory.FactoryFacade;
import org.web3.flota.model.ModeloDTO;

@ManagedBean(name="modeloTodosService")
@ApplicationScoped
public class ModeloTodosService {

	private List<Object> modelos;
	
	@PostConstruct
	public void init(){
		SearchFacade sfacade = (SearchFacade)FactoryFacade.getFacade(TipoFacade.SEARCH);
		
		try{
			modelos = new ArrayList<Object>();
			
			ModeloDTO modelo = new ModeloDTO();
			modelo.setNombre("TODOS");
			modelo.setCodigo(new Long(0));
			modelos.add(modelo);
			
			List<Object> modelosDTO = (List<Object>)sfacade.getAll(ModeloDTO.class);
			
			for (Object object : modelosDTO) {
				modelos.add(object);
			}
			
		}catch (SearchObjectException e){
			
		}
	}

	public List<Object> getModelos() {
		return modelos;
	}	
}
