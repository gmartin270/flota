package org.web3.flota.bussiness.facade;

import java.util.List;

import org.web3.flota.bussiness.AsignacionBO;
import org.web3.flota.bussiness.UsuarioBO;
import org.web3.flota.bussiness.VehiculoBO;
import org.web3.flota.bussiness.exceptions.SearchObjectException;
import org.web3.flota.bussiness.factory.FactoryObjectBO;
import org.web3.flota.bussiness.factory.IObjectBO;
import org.web3.flota.model.AsignacionDTO;
import org.web3.flota.model.UsuarioDTO;
import org.web3.flota.model.VehiculoDTO;

public class SearchFacade {
	private static SearchFacade instance;
	
	public static SearchFacade getInstance(){
		if(instance == null)
			instance = new SearchFacade();
		
		return instance;
	}
	
	public List<Object> getAll(Class<?> clazz) throws SearchObjectException {
		IObjectBO bo = FactoryObjectBO.createObjectBO(clazz);
		
		return bo.getAll();
	}
	
	public boolean validarUsuario(String login, String password) throws SearchObjectException {
		UsuarioBO bo = (UsuarioBO)FactoryObjectBO.createObjectBO(UsuarioDTO.class);
		
		return bo.validarUsuario(login, password);
	}
	
	public List<Object> getByVehiculo(VehiculoDTO vehiculoFiltro) throws SearchObjectException {
		VehiculoBO bo = (VehiculoBO)FactoryObjectBO.createObjectBO(VehiculoDTO.class);
		
		return bo.getByVehiculo(vehiculoFiltro);
	}
	
	public Long getCountVehiculos(VehiculoDTO vehiculoFiltro, boolean allVehiculos) throws SearchObjectException {
		VehiculoBO bo = (VehiculoBO)FactoryObjectBO.createObjectBO(VehiculoDTO.class);
		
		return bo.getCountVehiculos(vehiculoFiltro, allVehiculos);
	}
	
	public List<Object> getByAsignacion(AsignacionDTO asignacion, boolean fecDevNula) throws SearchObjectException {
		AsignacionBO bo = (AsignacionBO)FactoryObjectBO.createObjectBO(AsignacionDTO.class);
		
		return bo.getByAsignacion(asignacion, fecDevNula);
	}
}
