package org.web3.flota.persist;

import java.util.List;

public class EstadoVehiculoDAO extends GenericDAO implements IGenericDAO{
	private static EstadoVehiculoDAO instance;
	
	private EstadoVehiculoDAO(){
		super();
	};
	
	public static EstadoVehiculoDAO getInstance(){
		if(instance == null)
			instance = new EstadoVehiculoDAO();
		return instance;
	}
	
	public void create(Object estadoVehiculoDTO) {
        super.saveOrUpdate(estadoVehiculoDTO);
    }
	
	public void update(Object estadoVehiculoDTO) {
        super.saveOrUpdate(estadoVehiculoDTO);
    }
	
	public void delete(Object estadoVehiculoDTO) {
        super.delete(estadoVehiculoDTO);
    }
	
	public List<Object> getAll() {
        return super.getAll("getAllEstadosVehiculo");
    }
}
