package org.web3.flota.bussiness;

import java.util.List;

import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.exceptions.EditObjectException;
import org.web3.flota.bussiness.exceptions.RemoveObjectException;
import org.web3.flota.bussiness.exceptions.SearchObjectException;
import org.web3.flota.bussiness.factory.IObjectBO;
import org.web3.flota.model.PaisDTO;
import org.web3.flota.model.VehiculoDTO;
import org.web3.flota.persist.FactoryObjectDAO;
import org.web3.flota.persist.IGenericDAO;

public class PaisBO implements IObjectBO{
	private static PaisBO instance;
	private IGenericDAO dao;
	
	private PaisBO(){
		dao = FactoryObjectDAO.createObjectDAO(PaisDTO.class);
	};
	
	public static PaisBO getInstance(){
		if(instance == null)
			instance = new PaisBO();
		
		return instance;
	}
	
	public List<Object> getAll() throws SearchObjectException{
		return dao.getAll();
	}
	
	public void createObject(Object paisDTO) throws CreateObjectException{
		dao.create(paisDTO);
	}
	
	public void editObject( Object paisDTO) throws EditObjectException{
		
		if(((VehiculoDTO)paisDTO).getId() != null)
			dao.update(paisDTO);
		else
			throw new EditObjectException("");
	}
	
	public void removeObject(Object paisDTO) throws RemoveObjectException{
		if(((VehiculoDTO)paisDTO).getId() != null)
			dao.delete(paisDTO);
		else
			throw new RemoveObjectException("");
	}
}
