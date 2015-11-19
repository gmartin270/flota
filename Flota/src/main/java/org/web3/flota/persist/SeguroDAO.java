package org.web3.flota.persist;

import java.util.List;

public class SeguroDAO extends GenericDAO implements IGenericDAO{
	private static SeguroDAO instance;
	
	private SeguroDAO(){
		super();
	};
	
	public static SeguroDAO getInstance(){
		if(instance == null)
			instance = new SeguroDAO();
		return instance;
	}
	
	public void create(Object seguroDTO) {
        super.saveOrUpdate(seguroDTO);
    }
	
	public void update(Object seguroDTO) {
        super.saveOrUpdate(seguroDTO);
    }
	
	public void delete(Object seguroDTO) {
        super.delete(seguroDTO);
    }
	
	public List<Object> getAll() {
        return super.getAll("getAllSeguros");
    }
}
