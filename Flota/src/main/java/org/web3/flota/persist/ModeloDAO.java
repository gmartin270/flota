package org.web3.flota.persist;

import java.util.List;

public class ModeloDAO extends GenericDAO implements IGenericDAO{
	private static ModeloDAO instance;
	
	private ModeloDAO(){
		super();
	};
	
	public static ModeloDAO getInstance(){
		if(instance == null)
			instance = new ModeloDAO();
		return instance;
	}
	
	public void create(Object modeloDTO) {
        super.saveOrUpdate(modeloDTO);
    }
	
	public void update(Object modeloDTO) {
        super.saveOrUpdate(modeloDTO);
    }
	
	public void delete(Object modeloDTO) {
        super.delete(modeloDTO);
    }
	
	public List<Object> getAll() {
        return super.getAll("getAllModelos");
    }
}
