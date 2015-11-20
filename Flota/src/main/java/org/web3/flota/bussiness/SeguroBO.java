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

public class SeguroBO implements IObjectBO{
	private static SeguroBO instance;
	private IGenericDAO dao;
	
	private SeguroBO(){
		dao = FactoryObjectDAO.createObjectDAO(AsignacionDAO.class);
	};
	
	public static SeguroBO getInstance(){
		if(instance == null)
			instance = new SeguroBO();
		
		return instance;
	}
	
	public List<Object> getAll() throws SearchObjectException{
		return dao.getAll();
	}
	
	public void createObject(Object seguroDTO) throws CreateObjectException{
		dao.create(seguroDTO);
	}
	
	public void editObject( Object seguroDTO) throws EditObjectException{
		
		if(((VehiculoDTO)seguroDTO).getId() != null)
			dao.update(seguroDTO);
		else
			throw new EditObjectException("");
	}
	
	public void removeObject(Object seguroDTO) throws RemoveObjectException{
		if(((VehiculoDTO)seguroDTO).getId() != null)
			dao.delete(seguroDTO);
		else
			throw new RemoveObjectException("");
	}
}
