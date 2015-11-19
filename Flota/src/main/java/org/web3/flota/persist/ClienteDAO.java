package org.web3.flota.persist;

import java.util.List;

public class ClienteDAO extends GenericDAO implements IGenericDAO{
	private static ClienteDAO instance;
	
	private ClienteDAO(){
		super();
	};
	
	public static ClienteDAO getInstance(){
		if(instance == null)
			instance = new ClienteDAO();
		return instance;
	}
	
	public void create(Object clienteDTO) {
        super.saveOrUpdate(clienteDTO);
    }
	
	public void update(Object clienteDTO) {
        super.saveOrUpdate(clienteDTO);
    }
	
	public void delete(Object clienteDTO) {
        super.delete(clienteDTO);
    }
	
	public List<Object> getAll() {
        return super.getAll("getAllClientes");
    }
}
