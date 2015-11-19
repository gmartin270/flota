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

public class TipoDocumentoBO implements IObjectBO{
	private static TipoDocumentoBO instance;
	private IGenericDAO dao;
	
	private TipoDocumentoBO(){
		dao = FactoryObjectDAO.createObjectDAO(AsignacionDAO.class);
	};
	
	public static TipoDocumentoBO getInstance(){
		if(instance == null)
			instance = new TipoDocumentoBO();
		
		return instance;
	}
	
	public List<Object> getAll() throws SearchObjectException{
		return dao.getAll();
	}
	
	public void createObject(Object tipoDocumentoDTO) throws CreateObjectException{
		dao.create(tipoDocumentoDTO);
	}
	
	public void editObject(String id, Object tipoDocumentoDTO) throws EditObjectException{
		
		if(((VehiculoDTO)tipoDocumentoDTO).getId() != null)
			dao.update(tipoDocumentoDTO);
		else
			throw new EditObjectException("");
	}
	
	public void removeObject(Object tipoDocumentoDTO) throws RemoveObjectException{
		if(((VehiculoDTO)tipoDocumentoDTO).getId() != null)
			dao.delete(tipoDocumentoDTO);
		else
			throw new RemoveObjectException("");
	}
}
