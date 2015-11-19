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

public class CedulaBO implements IObjectBO{
	private static CedulaBO instance;
	private IGenericDAO dao;
	
	private CedulaBO(){
		dao = FactoryObjectDAO.createObjectDAO(AsignacionDAO.class);
	};
	
	public static CedulaBO getInstance(){
		if(instance == null)
			instance = new CedulaBO();
		
		return instance;
	}
	
	public List<Object> getAll() throws SearchObjectException{
		return dao.getAll();
	}
	
	public void createObject(Object cedulaDTO) throws CreateObjectException{
		dao.create(cedulaDTO);
	}
	
	public void editObject(String id, Object cedulaDTO) throws EditObjectException{
		
		if(((VehiculoDTO)cedulaDTO).getId() != null)
			dao.update(cedulaDTO);
		else
			throw new EditObjectException("");
	}
	
	public void removeObject(Object cedulaDTO) throws RemoveObjectException{
		if(((VehiculoDTO)cedulaDTO).getId() != null)
			dao.delete(cedulaDTO);
		else
			throw new RemoveObjectException("");
	}
}
