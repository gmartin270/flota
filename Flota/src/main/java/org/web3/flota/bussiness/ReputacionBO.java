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

public class ReputacionBO implements IObjectBO{
	private static ReputacionBO instance;
	private IGenericDAO dao;
	
	private ReputacionBO(){
		dao = FactoryObjectDAO.createObjectDAO(AsignacionDAO.class);
	};
	
	public static ReputacionBO getInstance(){
		if(instance == null)
			instance = new ReputacionBO();
		
		return instance;
	}
	
	public List<Object> getAll() throws SearchObjectException{
		return dao.getAll();
	}
	
	public void createObject(Object reputacionDTO) throws CreateObjectException{
		dao.create(reputacionDTO);
	}
	
	public void editObject(String id, Object reputacionDTO) throws EditObjectException{
		
		if(((VehiculoDTO)reputacionDTO).getId() != null)
			dao.update(reputacionDTO);
		else
			throw new EditObjectException("");
	}
	
	public void removeObject(Object reputacionDTO) throws RemoveObjectException{
		if(((VehiculoDTO)reputacionDTO).getId() != null)
			dao.delete(reputacionDTO);
		else
			throw new RemoveObjectException("");
	}
}
