package org.web3.flota.bussiness;

import java.util.List;

import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.exceptions.EditObjectException;
import org.web3.flota.bussiness.exceptions.RemoveObjectException;
import org.web3.flota.bussiness.exceptions.SearchObjectException;
import org.web3.flota.bussiness.factory.IObjectBO;
import org.web3.flota.model.VehiculoDTO;
import org.web3.flota.persist.FactoryObjectDAO;
import org.web3.flota.persist.IGenericDAO;

public class VehiculoBO implements IObjectBO{
	private static VehiculoBO instance;
	private IGenericDAO dao;
	
	private VehiculoBO(){
		dao = FactoryObjectDAO.createObjectDAO(VehiculoDTO.class);
	};
	
	public static VehiculoBO getInstance(){
		if(instance == null)
			instance = new VehiculoBO();
		
		return instance;
	}
	
	public VehiculoDTO getById(String id){
		return null;
	}
	
	public List<VehiculoDTO> getByCategoria(String Categoria){
		return null;
	}
	
	public List<Object> getByVehiculo(Object vehiculoDTOToSearch){
		return null;
	}
	
	public List<Object> getAll() throws SearchObjectException{
		return dao.getAll();
	}
	
	public void createObject(Object vehiculoDTO) throws CreateObjectException{
		dao.create(vehiculoDTO);
	}
	
	public void editObject(String id, Object vehiculoDTO) throws EditObjectException{
		
		if(((VehiculoDTO)vehiculoDTO).getId() != null)
			dao.update(vehiculoDTO);
		else
			throw new EditObjectException("El vehiculo que desea editar no es válido");
	}
	
	public void removeObject(Object vehiculoDTO) throws RemoveObjectException{
		if(((VehiculoDTO)vehiculoDTO).getId() != null)
			dao.delete(vehiculoDTO);
		else
			throw new RemoveObjectException("El vehiculo que desea eliminar no es válido");
	}
}
