package org.web3.flota.persist;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.web3.flota.model.VehiculoDTO;
import org.web3.flota.util.HibernateUtil;

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
	
	@SuppressWarnings("unchecked")
	public List<Object> getByVehiculo(VehiculoDTO vehiculoFiltro){
		List<Object> vehiculos = null;
		List<String> filtros = new ArrayList<String>();
		String queryFilter = "";
		
		try {
            
            if(vehiculoFiltro.getDominio() != null){
            	filtros.add(" v.dominio=:dominio ");            	
            }
            
            if(vehiculoFiltro.getModelo() != null){
            	filtros.add(" v.modelo=:modelo ");            	
            }
            
            if(filtros.size() > 0){
            	for (int i = 0; i < filtros.size(); i++) {
					if(i == 0)
						queryFilter = " WHERE ";
					else
						queryFilter += " AND ";
					
					queryFilter += filtros.get(i);
				}
            }
            
            startOperation();
            Query query = session.createQuery("SELECT v FROM VehiculoDTO v" + queryFilter);
            
            if(vehiculoFiltro.getDominio() != null){
            	query.setParameter("dominio", vehiculoFiltro.getDominio());
            }
            
            if(vehiculoFiltro.getModelo() != null){
            	query.setParameter("modelo", vehiculoFiltro.getModelo());
            }
            
            vehiculos = query.list();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
        	HibernateUtil.close(session);
        }
        return vehiculos;
	}
	
	public Long getCountVehiculos(VehiculoDTO vehiculoFiltro, boolean allVehiculos){
		Long cantidad = null;
		
		List<String> filtros = new ArrayList<String>();
		String queryFilter = "";
		
		try {
            
			if(!allVehiculos)
				filtros.add(" v.disponible=:disponible ");            	
            
            if(filtros.size() > 0){
            	for (int i = 0; i < filtros.size(); i++) {
					if(i == 0)
						queryFilter = " WHERE ";
					else
						queryFilter += " AND ";
					
					queryFilter += filtros.get(i);
				}
            }
            
            startOperation();
            Query query = session.createQuery("SELECT COUNT(*) FROM VehiculoDTO v" + queryFilter);
            
            if(!allVehiculos)
            	query.setParameter("disponible", vehiculoFiltro.getDisponible());
            
            cantidad = (Long)query.uniqueResult();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
        	HibernateUtil.close(session);
        }
		
		return cantidad;
	}
	
	protected void handleException(HibernateException e)  {
    	HibernateUtil.rollback(tx);
        e.printStackTrace();
    }

    protected void startOperation() throws HibernateException {
        session = HibernateUtil.openSession();
        tx = session.beginTransaction();
    }
}
