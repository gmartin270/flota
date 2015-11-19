package org.web3.flota.persist;

import java.util.List;

public class PaisDAO extends GenericDAO implements IGenericDAO{
	private static PaisDAO instance;
	
	private PaisDAO(){
		super();
	};
	
	public static PaisDAO getInstance(){
		if(instance == null)
			instance = new PaisDAO();
		return instance;
	}
	
	public void create(Object paisDTO) {
        super.saveOrUpdate(paisDTO);
    }
	
	public void update(Object paisDTO) {
        super.saveOrUpdate(paisDTO);
    }
	
	public void delete(Object paisDTO) {
        super.delete(paisDTO);
    }
	
	public List<Object> getAll() {
        return super.getAll("getAllPaises");
    }
}
