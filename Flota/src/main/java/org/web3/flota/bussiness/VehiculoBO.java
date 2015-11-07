package org.web3.flota.bussiness;

import java.util.ArrayList;
import java.util.List;

import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.exceptions.EditObjectException;
import org.web3.flota.bussiness.exceptions.RemoveObjectException;
import org.web3.flota.model.VehiculoDTO;
import org.web3.flota.persist.VehiculoDAO;

public class VehiculoBO extends AbstractObjectBO{
	private static VehiculoBO instance;
	private VehiculoDAO vehiculoDTODAO;
	
	private VehiculoBO(){
		vehiculoDTODAO = VehiculoDAO.getInstance(); 
	};
	
	public static VehiculoBO getInstance(){
		if(instance == null)
			instance = new VehiculoBO();
		
		return instance;
	}
	
	public VehiculoDTO getById(String id){
		VehiculoDTO vehiculoDTO = new VehiculoDTO();
		
		return vehiculoDTO;
	}
	
	public List<VehiculoDTO> getByCategoria(String Categoria){
		List<VehiculoDTO> vehiculoDTOs = new ArrayList<VehiculoDTO>();
		
		return vehiculoDTOs;
	}
	
	public List<VehiculoDTO> getByVehiculo(VehiculoDTO vehiculoDTOToSearch){
		List<VehiculoDTO> vehiculoDTOs = new ArrayList<VehiculoDTO>();
		
		return vehiculoDTOs;
	}
	
	@Override
	public void createObject(Object vehiculoDTODTO) throws CreateObjectException{
		vehiculoDTODAO.saveOrUpdate(vehiculoDTODTO);
	}
	
	@Override
	public void editObject(String id, Object vehiculoDTO) throws EditObjectException{
		
	}
	
	@Override
	public void removeObject(Object vehiculoDTO) throws RemoveObjectException{
		
	}
}
