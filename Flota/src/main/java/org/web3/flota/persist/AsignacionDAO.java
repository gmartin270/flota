package org.web3.flota.persist;

import java.util.List;

public class AsignacionDAO extends GenericDAO implements IGenericDAO{
	private static AsignacionDAO instance;
	
	private AsignacionDAO(){
		super();
	};
	
	public static AsignacionDAO getInstance(){
		if(instance == null)
			instance = new AsignacionDAO();
		return instance;
	}
	
	public void create(Object asignacionDTO) {
        super.saveOrUpdate(asignacionDTO);
    }
	
	public void update(Object asignacionDTO) {
        super.saveOrUpdate(asignacionDTO);
    }
	
	public void delete(Object asignacionDTO) {
        super.delete(asignacionDTO);
    }
	
	public List<Object> getAll() {
        return super.getAll("getAllAsignaciones");
    }
}
