package org.web3.flota.persist;

import java.util.List;

public class CedulaDAO extends GenericDAO implements IGenericDAO{
	private static CedulaDAO instance;
	
	private CedulaDAO(){
		super();
	};
	
	public static CedulaDAO getInstance(){
		if(instance == null)
			instance = new CedulaDAO();
		return instance;
	}
	
	public void create(Object cedulaDTO) {
        super.saveOrUpdate(cedulaDTO);
    }
	
	public void update(Object cedulaDTO) {
        super.saveOrUpdate(cedulaDTO);
    }
	
	public void delete(Object cedulaDTO) {
        super.delete(cedulaDTO);
    }
	
	public List<Object> getAll() {
        return super.getAll("getAllCedulas");
    }
}
