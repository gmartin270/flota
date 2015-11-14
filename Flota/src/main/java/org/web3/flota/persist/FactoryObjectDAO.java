package org.web3.flota.persist;

public class FactoryObjectDAO implements IFactoryObjectDAO {

	public static GenericDAO createObjectDAO(Class<?> clazz) {

		GenericDAO dao = null;
		
		if(clazz.equals(ClienteDAO.class))
			dao = ClienteDAO.getInstance();
		else if(clazz.equals(VehiculoDAO.class))
			dao = VehiculoDAO.getInstance();
		
		return dao;
	}

}
