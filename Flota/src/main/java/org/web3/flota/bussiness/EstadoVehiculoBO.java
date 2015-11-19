package org.web3.flota.bussiness;

import java.util.List;

import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.exceptions.EditObjectException;
import org.web3.flota.bussiness.exceptions.RemoveObjectException;
import org.web3.flota.bussiness.exceptions.SearchObjectException;
import org.web3.flota.bussiness.factory.IObjectBO;
import org.web3.flota.model.VehiculoDTO;
import org.web3.flota.persist.AsignacionDAO;
import org.web3.flota.persist.FactoryObjectDAO;
import org.web3.flota.persist.IGenericDAO;

public class EstadoVehiculoBO implements IObjectBO{
	private static EstadoVehiculoBO instance;
	private IGenericDAO dao;
	
	private EstadoVehiculoBO(){
		dao = FactoryObjectDAO.createObjectDAO(AsignacionDAO.class);
	};
	
	public static EstadoVehiculoBO getInstance(){
		if(instance == null)
			instance = new EstadoVehiculoBO();
		
		return instance;
	}
	
	public List<Object> getAll() throws SearchObjectException{
		return dao.getAll();
	}
	
	public void createObject(Object estadoVehiculoDTO) throws CreateObjectException{
		dao.create(estadoVehiculoDTO);
	}
	
	public void editObject(String id, Object estadoVehiculoDTO) throws EditObjectException{
		
		if(((VehiculoDTO)estadoVehiculoDTO).getId() != null)
			dao.update(estadoVehiculoDTO);
		else
			throw new EditObjectException("");
	}
	
	public void removeObject(Object estadoVehiculoDTO) throws RemoveObjectException{
		if(((VehiculoDTO)estadoVehiculoDTO).getId() != null)
			dao.delete(estadoVehiculoDTO);
		else
			throw new RemoveObjectException("");
	}
}
