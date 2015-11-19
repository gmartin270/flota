package org.web3.flota.persist;

import java.util.List;

public class VehiculoDAO extends GenericDAO implements IGenericDAO{
	private static VehiculoDAO instance;
	
	private VehiculoDAO(){
		super();
	};
	
	public static VehiculoDAO getInstance(){
		if(instance == null)
			instance = new VehiculoDAO();
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
        return super.getAll("getAllVehiculos");
    }
}
