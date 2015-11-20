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

public class PolizaBO implements IObjectBO{
	private static PolizaBO instance;
	private IGenericDAO dao;
	
	private PolizaBO(){
		dao = FactoryObjectDAO.createObjectDAO(AsignacionDAO.class);
	};
	
	public static PolizaBO getInstance(){
		if(instance == null)
			instance = new PolizaBO();
		
		return instance;
	}
	
	public List<Object> getAll() throws SearchObjectException{
		return dao.getAll();
	}
	
	public void createObject(Object polizaDTO) throws CreateObjectException{
		dao.create(polizaDTO);
	}
	
	public void editObject( Object polizaDTO) throws EditObjectException{
		
		if(((VehiculoDTO)polizaDTO).getId() != null)
			dao.update(polizaDTO);
		else
			throw new EditObjectException("");
	}
	
	public void removeObject(Object polizaDTO) throws RemoveObjectException{
		if(((VehiculoDTO)polizaDTO).getId() != null)
			dao.delete(polizaDTO);
		else
			throw new RemoveObjectException("");
	}
}
