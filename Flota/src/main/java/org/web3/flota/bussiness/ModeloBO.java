package org.web3.flota.bussiness;

import java.util.List;

import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.exceptions.EditObjectException;
import org.web3.flota.bussiness.exceptions.RemoveObjectException;
import org.web3.flota.bussiness.exceptions.SearchObjectException;
import org.web3.flota.bussiness.factory.IObjectBO;
import org.web3.flota.model.ModeloDTO;
import org.web3.flota.model.VehiculoDTO;
import org.web3.flota.persist.FactoryObjectDAO;
import org.web3.flota.persist.IGenericDAO;

public class ModeloBO implements IObjectBO{
	private static ModeloBO instance;
	private IGenericDAO dao;
	
	private ModeloBO(){
		dao = FactoryObjectDAO.createObjectDAO(ModeloDTO.class);
	};
	
	public static ModeloBO getInstance(){
		if(instance == null)
			instance = new ModeloBO();
		
		return instance;
	}
	
	public List<Object> getAll() throws SearchObjectException{
		return dao.getAll();
	}
	
	public void createObject(Object modeloDTO) throws CreateObjectException{
		dao.create(modeloDTO);
	}
	
	public void editObject( Object modeloDTO) throws EditObjectException{
		
		if(((VehiculoDTO)modeloDTO).getId() != null)
			dao.update(modeloDTO);
		else
			throw new EditObjectException("");
	}
	
	public void removeObject(Object modeloDTO) throws RemoveObjectException{
		if(((VehiculoDTO)modeloDTO).getId() != null)
			dao.delete(modeloDTO);
		else
			throw new RemoveObjectException("");
	}
}
