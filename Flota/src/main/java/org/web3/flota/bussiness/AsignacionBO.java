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

public class AsignacionBO implements IObjectBO{
	private static AsignacionBO instance;
	private IGenericDAO dao;
	
	private AsignacionBO(){
		dao = FactoryObjectDAO.createObjectDAO(AsignacionDAO.class);
	};
	
	public static AsignacionBO getInstance(){
		if(instance == null)
			instance = new AsignacionBO();
		
		return instance;
	}
	
	public List<Object> getAll() throws SearchObjectException{
		return dao.getAll();
	}
	
	public void createObject(Object asignacionDTO) throws CreateObjectException{
		dao.create(asignacionDTO);
	}
	
	public void editObject(String id, Object asignacionDTO) throws EditObjectException{
		
		if(((VehiculoDTO)asignacionDTO).getId() != null)
			dao.update(asignacionDTO);
		else
			throw new EditObjectException("");
	}
	
	public void removeObject(Object asignacionDTO) throws RemoveObjectException{
		if(((VehiculoDTO)asignacionDTO).getId() != null)
			dao.delete(asignacionDTO);
		else
			throw new RemoveObjectException("");
	}
}
