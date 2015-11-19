package org.web3.flota.persist;

import java.util.List;

public class MarcaDAO extends GenericDAO implements IGenericDAO{
	private static MarcaDAO instance;
	
	private MarcaDAO(){
		super();
	};
	
	public static MarcaDAO getInstance(){
		if(instance == null)
			instance = new MarcaDAO();
		return instance;
	}
	
	public void create(Object marcaDTO) {
        super.saveOrUpdate(marcaDTO);
    }
	
	public void update(Object marcaDTO) {
        super.saveOrUpdate(marcaDTO);
    }
	
	public void delete(Object marcaDTO) {
        super.delete(marcaDTO);
    }
	
	public List<Object> getAll() {
        return super.getAll("getAllMarcas");
	}    
}
