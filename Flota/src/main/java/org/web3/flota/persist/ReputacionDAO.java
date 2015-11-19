package org.web3.flota.persist;

import java.util.List;

public class ReputacionDAO extends GenericDAO implements IGenericDAO{
	private static ReputacionDAO instance;
	
	private ReputacionDAO(){
		super();
	};
	
	public static ReputacionDAO getInstance(){
		if(instance == null)
			instance = new ReputacionDAO();
		return instance;
	}
	
	public void create(Object reputacionDTO) {
        super.saveOrUpdate(reputacionDTO);
    }
	
	public void update(Object reputacionDTO) {
        super.saveOrUpdate(reputacionDTO);
    }
	
	public void delete(Object reputacionDTO) {
        super.delete(reputacionDTO);
    }
	
	public List<Object> getAll() {
        return super.getAll("getAllReputaciones");
    }
}
