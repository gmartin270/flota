package org.web3.flota.testapp;

import java.util.List;

import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.exceptions.RemoveObjectException;
import org.web3.flota.bussiness.exceptions.SearchObjectException;
import org.web3.flota.bussiness.facade.CreateFacade;
import org.web3.flota.bussiness.facade.TipoFacade;
import org.web3.flota.bussiness.facade.RemoveFacade;
import org.web3.flota.bussiness.facade.SearchFacade;
import org.web3.flota.bussiness.factory.FactoryFacade;
import org.web3.flota.model.ClienteDTO;
import org.web3.flota.model.TipoVehiculoDTO;
import org.web3.flota.model.VehiculoDTO;
import org.web3.flota.persist.ClienteDAO;
import org.web3.flota.persist.FactoryObjectDAO;
import org.web3.flota.persist.IGenericDAO;
import org.web3.flota.persist.VehiculoDAO;

public class Main {

	public static void main(String[] args) {
		
		CreateFacade facadeCreate = (CreateFacade)FactoryFacade.getFacade(TipoFacade.CREATE);
		RemoveFacade facadeDelete = (RemoveFacade)FactoryFacade.getFacade(TipoFacade.REMOVE);
		SearchFacade facadeSearch = (SearchFacade)FactoryFacade.getFacade(TipoFacade.SEARCH);
		VehiculoDTO vehiculo = null;
		
		/*for(int i = 0 ; i < 100 ; i++ ) {
			vehiculo = new VehiculoDTO();
			vehiculo.setDominio("SFT "+i);
			
			try {
				facade.create(vehiculo);
			} catch (CreateObjectException e) {
				e.printStackTrace();
			}
		}*/
		
		TipoVehiculoDTO tipo = new TipoVehiculoDTO();
		tipo.setDescripcion("Utilitario");
		
		vehiculo = new VehiculoDTO();
		vehiculo.setDominio("ABC 001");
		vehiculo.setTipo(tipo);
		
		try {
			facadeCreate.create(vehiculo);
		} catch (CreateObjectException e) {
			e.printStackTrace();
		}
		
		
		List<Object> vehiculos = null;
		try {
			vehiculos = facadeSearch.getAll(VehiculoDTO.class);
		} catch (SearchObjectException e) {
			e.printStackTrace();
		}
		
		for (Object vehiculoDTO : vehiculos) {
			System.out.println(((VehiculoDTO)vehiculoDTO).getDominio() + " - " + ((VehiculoDTO)vehiculoDTO).getTipo().getDescripcion());
		}
		
		/*try {
			facadeDelete.remove(vehiculo);
		} catch (RemoveObjectException e) {
			e.printStackTrace();
		}*/	
		
		ClienteDTO cliente = new ClienteDTO();
		cliente.setApellidos("Martín");
		cliente.setNombres("Guillermo");
		
		/*try {
			facadeCreate.create(cliente);
		} catch (CreateObjectException e) {
			e.printStackTrace();
		}*/
		
		/*IGenericDAO vehiculoDAO = FactoryObjectDAO.createObjectDAO(VehiculoDAO.class);
		List<Object> vehiculoDTOs = vehiculoDAO.getAll();
		for (Object vehiculoDTO : vehiculoDTOs) {
			System.out.println(((VehiculoDTO)vehiculoDTO).getDominio());
		}*/
		
		IGenericDAO clienteDAO = FactoryObjectDAO.createObjectDAO(ClienteDAO.class);
		
		cliente = null;
		
		List<Object> clienteDTOs = clienteDAO.getAll();
		for (Object clienteDTO : clienteDTOs) {
			System.out.println(((ClienteDTO)clienteDTO).getNombres() + ((ClienteDTO)clienteDTO).getApellidos());
		}
	}

}
