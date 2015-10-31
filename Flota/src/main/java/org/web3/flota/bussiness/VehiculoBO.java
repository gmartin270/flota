package org.web3.flota.bussiness;

import java.util.ArrayList;
import java.util.List;

import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.exceptions.EditObjectException;
import org.web3.flota.bussiness.exceptions.RemoveObjectException;
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
	
	public void createVehiculo(VehiculoDTO vehiculo) throws CreateObjectException{
		
	}
	
	public void editVehiculo(String id, VehiculoDTO vehiculo) throws EditObjectException{
		
	}
	
	public void removeVehiculo(String id) throws RemoveObjectException{
		
	}
}
