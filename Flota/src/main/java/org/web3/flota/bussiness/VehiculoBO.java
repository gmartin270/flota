package org.web3.flota.bussiness;

import java.util.ArrayList;
import java.util.List;

import org.web3.flota.bussiness.exceptions.CreateVehiculoException;
import org.web3.flota.bussiness.exceptions.EditVehiculoException;
import org.web3.flota.bussiness.exceptions.RemoveVehiculoException;
import org.web3.flota.model.VehiculoDTO;

public class VehiculoBO {
	private static VehiculoBO instance;
	
	private VehiculoBO(){};
	
	public static VehiculoBO getInstance(){
		if(instance == null)
			instance = new VehiculoBO();
		
		return instance;
	}
	
	public VehiculoDTO getById(String id){
		VehiculoDTO vehiculo = new VehiculoDTO();
		
		return vehiculo;
	}
	
	public List<VehiculoDTO> getByCategoria(String Categoria){
		List<VehiculoDTO> vehiculos = new ArrayList<VehiculoDTO>();
		
		return vehiculos;
	}
	
	public List<VehiculoDTO> getByVehiculo(VehiculoDTO vehiculoToSearch){
		List<VehiculoDTO> vehiculos = new ArrayList<VehiculoDTO>();
		
		return vehiculos;
	}
	
	public void createVehiculo(VehiculoDTO vehiculo) throws CreateVehiculoException{
		
	}
	
	public void editVehiculo(String id, VehiculoDTO vehiculo) throws EditVehiculoException{
		
	}
	
	public void removeVehiculo(String id) throws RemoveVehiculoException{
		
	}
}
