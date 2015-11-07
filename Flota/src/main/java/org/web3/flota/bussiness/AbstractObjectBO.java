package org.web3.flota.bussiness;

import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.exceptions.EditObjectException;
import org.web3.flota.bussiness.exceptions.RemoveObjectException;

public abstract class AbstractObjectBO {

	public abstract void createObject(Object objetoDTO) throws CreateObjectException;
	
	public abstract void editObject(String id, Object objetoDTO) throws EditObjectException;
	
	public abstract void removeObject(Object objetoDTO) throws RemoveObjectException;
}
