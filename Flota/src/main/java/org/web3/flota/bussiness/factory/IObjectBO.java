package org.web3.flota.bussiness.factory;

import java.util.List;

import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.exceptions.EditObjectException;
import org.web3.flota.bussiness.exceptions.RemoveObjectException;
import org.web3.flota.bussiness.exceptions.SearchObjectException;

public interface IObjectBO {
	
	public List<Object> getAll() throws SearchObjectException;
	
	public void createObject(Object vehiculoDTO) throws CreateObjectException;
	
	public void editObject(Object vehiculoDTO) throws EditObjectException;
	
	public void removeObject(Object vehiculoDTO) throws RemoveObjectException;
}
