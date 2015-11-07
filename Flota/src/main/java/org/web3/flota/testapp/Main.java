package org.web3.flota.testapp;

import java.util.List;

import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.facade.CreateFacade;
import org.web3.flota.bussiness.factory.FactoryFacade;
import org.web3.flota.model.VehiculoDTO;
import org.web3.flota.persist.VehiculoDAO;

public class Main {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 100 ; i++ ) {
			VehiculoDTO vehiculo = new VehiculoDTO();
			vehiculo.setDominio("SFT "+i);
			
			CreateFacade facade = (CreateFacade)FactoryFacade.getInstance().getFacade(CreateFacade.class);
			
			try {
					facade.create(vehiculo);
			} catch (CreateObjectException e) {
				e.printStackTrace();
			}
		}
		
		VehiculoDAO vehiculoDAO = VehiculoDAO.getInstance();
		List<VehiculoDTO> vehiculoDTOs = vehiculoDAO.getAll();
		for (VehiculoDTO vehiculoDTO : vehiculoDTOs) {
			System.out.println(vehiculoDTO.getDominio());
		}
	}

}
