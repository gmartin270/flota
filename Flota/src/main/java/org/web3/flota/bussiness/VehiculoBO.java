package org.web3.flota.bussiness;

import java.util.ArrayList;
import java.util.List;

import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.exceptions.EditObjectException;
import org.web3.flota.bussiness.exceptions.RemoveObjectException;
import org.web3.flota.model.VehiculoDTO;
import org.web3.flota.persist.FactoryObjectDAO;
import org.web3.flota.persist.IGenericDAO;
import org.web3.flota.persist.VehiculoDAO;

public class VehiculoBO extends AbstractObjectBO{
	private static VehiculoBO instance;
	private IGenericDAO dao;
	
	private VehiculoBO(){
		dao = FactoryObjectDAO.createObjectDAO(VehiculoDAO.class);
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
	
	public List<Object> getByVehiculo(Object vehiculoDTOToSearch){
		List<Object> vehiculoDTOs = new ArrayList<Object>();
		
		return vehiculoDTOs;
	}
	
	@Override
	public void createObject(Object vehiculoDTO) throws CreateObjectException{
		dao.saveOrUpdate(vehiculoDTO);
	}
	
	@Override
	public void editObject(String id, Object vehiculoDTO) throws EditObjectException{
		VehiculoDTO vehiculo = (VehiculoDTO)vehiculoDTO;
		
		if(vehiculo.getId() != null)
			dao.saveOrUpdate(vehiculoDTO);
		else
			throw new EditObjectException("El vehiculo que desea editar no es válido");
			
	}
	
	@Override
	public void removeObject(Object vehiculoDTO) throws RemoveObjectException{
		
	}
}
