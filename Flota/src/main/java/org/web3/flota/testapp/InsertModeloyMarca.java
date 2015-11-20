package org.web3.flota.testapp;

import java.util.Iterator;
import java.util.List;

import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.exceptions.SearchObjectException;
import org.web3.flota.bussiness.facade.CreateFacade;
import org.web3.flota.bussiness.facade.SearchFacade;
import org.web3.flota.bussiness.facade.TipoFacade;
import org.web3.flota.bussiness.factory.FactoryFacade;
import org.web3.flota.model.MarcaDTO;
import org.web3.flota.model.ModeloDTO;

public class InsertModeloyMarca {

	public static void main(String[] args) {
		
		CreateFacade facadeCreate = (CreateFacade)FactoryFacade.getFacade(TipoFacade.CREATE);
		SearchFacade facadeSearch = (SearchFacade)FactoryFacade.getFacade(TipoFacade.SEARCH);
		List<Object> marcas = null;
		Iterator<Object> it;
		
		MarcaDTO m = new MarcaDTO();
		m.setNombre("Volkswagen");
		
		try {
			facadeCreate.create(m);
		} catch (CreateObjectException e) {
			e.printStackTrace();
		}
		
		m = new MarcaDTO();
		m.setNombre("Ford");
		
		try {
			facadeCreate.create(m);
		} catch (CreateObjectException e) {
			e.printStackTrace();
		}
		
		try{
			marcas = facadeSearch.getAll(MarcaDTO.class);
		} catch (SearchObjectException e) {
			e.printStackTrace();
		}
		
		if(marcas != null && marcas.size() > 0){
			MarcaDTO marca = null;
			it = marcas.iterator();
			
			while(it.hasNext()){
				marca = (MarcaDTO)it.next();
				ModeloDTO n = null;
					
				if(marca.getNombre().equalsIgnoreCase("Volkswagen")){
					n = new ModeloDTO();
					n.setNombre("Golf");
					n.setMarca(marca);
					
					try {
						facadeCreate.create(n);
					} catch (CreateObjectException e) {
						e.printStackTrace();
					}
					
					n = new ModeloDTO();
					n.setNombre("Passat");
					n.setMarca(marca);
					
					try {
						facadeCreate.create(n);
					} catch (CreateObjectException e) {
						e.printStackTrace();
					}
				}else{
					n = new ModeloDTO();
					n.setNombre("Focus");
					n.setMarca(marca);
					
					try {
						facadeCreate.create(n);
					} catch (CreateObjectException e) {
						e.printStackTrace();
					}
					
					n = new ModeloDTO();
					n.setNombre("Fiesta");
					n.setMarca(marca);
					
					try {
						facadeCreate.create(n);
					} catch (CreateObjectException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
