package org.web3.flota.persist;

import java.util.List;

public class PolizaDAO extends GenericDAO implements IGenericDAO{
	private static PolizaDAO instance;
	
	private PolizaDAO(){
		super();
	};
	
	public static PolizaDAO getInstance(){
		if(instance == null)
			instance = new PolizaDAO();
		return instance;
	}
	
	public void create(Object vehiculoDTO) {
        super.saveOrUpdate(vehiculoDTO);
    }
	
	public void update(Object vehiculoDTO) {
        super.saveOrUpdate(vehiculoDTO);
    }
	
	public void delete(Object vehiculoDTO) {
        super.delete(vehiculoDTO);
    }
	
	public List<Object> getAll() {
        return super.getAll("getAllPolizas");
    }
}
