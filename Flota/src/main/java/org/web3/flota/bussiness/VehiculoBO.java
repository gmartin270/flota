package org.web3.flota.bussiness;

import java.util.List;

import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.exceptions.EditObjectException;
import org.web3.flota.bussiness.exceptions.RemoveObjectException;
import org.web3.flota.bussiness.exceptions.SearchObjectException;
import org.web3.flota.bussiness.factory.IObjectBO;
import org.web3.flota.model.VehiculoDTO;
import org.web3.flota.persist.FactoryObjectDAO;
import org.web3.flota.persist.IGenericDAO;
import org.web3.flota.persist.VehiculoDAO;

public class VehiculoBO implements IObjectBO{
	private static VehiculoBO instance;
	private IGenericDAO dao;
	
	private VehiculoBO(){
		dao = FactoryObjectDAO.createObjectDAO(VehiculoDTO.class);
	};
	
	public static VehiculoBO getInstance(){
		if(instance == null)
			instance = new VehiculoBO();
		
		return instance;
	}
	
	public VehiculoDTO getById(String id){
		return null;
	}
	
	public List<VehiculoDTO> getByCategoria(String Categoria){
		return null;
	}
	
	public List<Object> getAll() throws SearchObjectException{
		List<Object> vehiculos = dao.getAll();
		
		for (Object object : vehiculos) {
			VehiculoDTO vehiculo = (VehiculoDTO)object;
			
			if(vehiculo.getDisponible())
				vehiculo.setEstado("Disponible");
			else
				vehiculo.setEstado("En uso");
		}
		return vehiculos;
	}
	
	public List<Object> getByVehiculo(VehiculoDTO vehiculoFiltro) throws SearchObjectException{
		List<Object> vehiculos = ((VehiculoDAO)dao).getByVehiculo(vehiculoFiltro);
		
		for (Object object : vehiculos) {
			VehiculoDTO vehiculo = (VehiculoDTO)object;
			
			if(vehiculo.getDisponible())
				vehiculo.setEstado("Disponible");
			else
				vehiculo.setEstado("En uso");
		}
		return vehiculos;
	}
	
	public Long getCountVehiculos(VehiculoDTO vehiculoFiltro, boolean allVehiculos) throws SearchObjectException{
		return ((VehiculoDAO)dao).getCountVehiculos(vehiculoFiltro, allVehiculos);		
	}
	
	public void createObject(Object vehiculoDTO) throws CreateObjectException{
		//Seteo la disponibilidad del vehiculo en la creación
		((VehiculoDTO)vehiculoDTO).setDisponible(true);
		
		dao.create(vehiculoDTO);
	}
	
	public void editObject( Object vehiculoDTO) throws EditObjectException{
		
		if(((VehiculoDTO)vehiculoDTO).getId() != null)
			dao.update(vehiculoDTO);
		else
			throw new EditObjectException("El vehiculo que desea editar no es válido");
	}
	
	public void removeObject(Object vehiculoDTO) throws RemoveObjectException{
		if(((VehiculoDTO)vehiculoDTO).getId() != null)
			dao.delete(vehiculoDTO);
		else
			throw new RemoveObjectException("El vehiculo que desea eliminar no es válido");
	}
}
