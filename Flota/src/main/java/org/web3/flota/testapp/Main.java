package org.web3.flota.testapp;

import java.util.List;

import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.facade.CreateFacade;
import org.web3.flota.bussiness.factory.FactoryFacade;
import org.web3.flota.model.ClienteDTO;
import org.web3.flota.model.VehiculoDTO;
import org.web3.flota.persist.ClienteDAO;
import org.web3.flota.persist.FactoryObjectDAO;
import org.web3.flota.persist.IGenericDAO;
import org.web3.flota.persist.VehiculoDAO;

public class Main {

	public static void main(String[] args) {
		
		CreateFacade facade = (CreateFacade)FactoryFacade.getInstance().getFacade(CreateFacade.class);
		VehiculoDTO vehiculo = null;
		
		for(int i = 0 ; i < 100 ; i++ ) {
			vehiculo = new VehiculoDTO();
			vehiculo.setDominio("SFT "+i);
			
			try {
				facade.create(vehiculo);
			} catch (CreateObjectException e) {
				e.printStackTrace();
			}
		}
		
		ClienteDTO cliente = new ClienteDTO();
		cliente.setApellidos("Martín");
		cliente.setNombres("Guillermo");
		
		try {
			facade.create(cliente);
		} catch (CreateObjectException e) {
			e.printStackTrace();
		}
		
		IGenericDAO vehiculoDAO = FactoryObjectDAO.createObjectDAO(VehiculoDAO.class);
		List<Object> vehiculoDTOs = vehiculoDAO.getAll();
		for (Object vehiculoDTO : vehiculoDTOs) {
			System.out.println(((VehiculoDTO)vehiculoDTO).getDominio());
		}
		
		IGenericDAO clienteDAO = FactoryObjectDAO.createObjectDAO(ClienteDAO.class);
		
		cliente = null;
		
		List<Object> clienteDTOs = clienteDAO.getAll();
		for (Object clienteDTO : clienteDTOs) {
			System.out.println(((ClienteDTO)clienteDTO).getNombres() + ((ClienteDTO)clienteDTO).getApellidos());
		}
	}

}
