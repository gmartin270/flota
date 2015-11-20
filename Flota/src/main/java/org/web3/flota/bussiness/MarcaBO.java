package org.web3.flota.bussiness;

import java.util.List;

import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.exceptions.EditObjectException;
import org.web3.flota.bussiness.exceptions.RemoveObjectException;
import org.web3.flota.bussiness.exceptions.SearchObjectException;
import org.web3.flota.bussiness.factory.IObjectBO;
import org.web3.flota.model.MarcaDTO;
import org.web3.flota.model.VehiculoDTO;
import org.web3.flota.persist.FactoryObjectDAO;
import org.web3.flota.persist.IGenericDAO;

public class MarcaBO implements IObjectBO{
	private static MarcaBO instance;
	private IGenericDAO dao;
	
	private MarcaBO(){
		dao = FactoryObjectDAO.createObjectDAO(MarcaDTO.class);
	};
	
	public static MarcaBO getInstance(){
		if(instance == null)
			instance = new MarcaBO();
		
		return instance;
	}
	
	public List<Object> getAll() throws SearchObjectException{
		return dao.getAll();
	}
	
	public void createObject(Object marcaDTO) throws CreateObjectException{
		dao.create(marcaDTO);
	}
	
	public void editObject( Object marcaDTO) throws EditObjectException{
		
		if(((VehiculoDTO)marcaDTO).getId() != null)
			dao.update(marcaDTO);
		else
			throw new EditObjectException("");
	}
	
	public void removeObject(Object marcaDTO) throws RemoveObjectException{
		if(((VehiculoDTO)marcaDTO).getId() != null)
			dao.delete(marcaDTO);
		else
			throw new RemoveObjectException("");
	}
}
