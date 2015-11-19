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

public class TipoVehiculoBO implements IObjectBO{
	private static TipoVehiculoBO instance;
	private IGenericDAO dao;
	
	private TipoVehiculoBO(){
		dao = FactoryObjectDAO.createObjectDAO(AsignacionDAO.class);
	};
	
	public static TipoVehiculoBO getInstance(){
		if(instance == null)
			instance = new TipoVehiculoBO();
		
		return instance;
	}
	
	public List<Object> getAll() throws SearchObjectException{
		return dao.getAll();
	}
	
	public void createObject(Object tipoVehiculoDTO) throws CreateObjectException{
		dao.create(tipoVehiculoDTO);
	}
	
	public void editObject(String id, Object tipoVehiculoDTO) throws EditObjectException{
		
		if(((VehiculoDTO)tipoVehiculoDTO).getId() != null)
			dao.update(tipoVehiculoDTO);
		else
			throw new EditObjectException("");
	}
	
	public void removeObject(Object tipoVehiculoDTO) throws RemoveObjectException{
		if(((VehiculoDTO)tipoVehiculoDTO).getId() != null)
			dao.delete(tipoVehiculoDTO);
		else
			throw new RemoveObjectException("");
	}
}
