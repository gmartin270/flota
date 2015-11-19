package org.web3.flota.persist;

import java.util.List;

public class TipoVehiculoDAO extends GenericDAO implements IGenericDAO{
	private static TipoVehiculoDAO instance;
	
	private TipoVehiculoDAO(){
		super();
	};
	
	public static TipoVehiculoDAO getInstance(){
		if(instance == null)
			instance = new TipoVehiculoDAO();
		return instance;
	}
	
	public void create(Object tipoVehiculoDTO) {
        super.saveOrUpdate(tipoVehiculoDTO);
    }
	
	public void update(Object tipoVehiculoDTO) {
        super.saveOrUpdate(tipoVehiculoDTO);
    }
	
	public void delete(Object tipoVehiculoDTO) {
        super.delete(tipoVehiculoDTO);
    }
	
	public List<Object> getAll() {
        return super.getAll("getAllTiposVehiculo");
    }
}
