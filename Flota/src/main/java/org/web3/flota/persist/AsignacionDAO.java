package org.web3.flota.persist;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.web3.flota.model.AsignacionDTO;
import org.web3.flota.util.HibernateUtil;

public class AsignacionDAO extends GenericDAO implements IGenericDAO{
	private static AsignacionDAO instance;
	
	private AsignacionDAO(){
		super();
	};
	
	public static AsignacionDAO getInstance(){
		if(instance == null)
			instance = new AsignacionDAO();
		return instance;
	}
	
	public void create(Object asignacionDTO) {
        super.saveOrUpdate(asignacionDTO);
    }
	
	public void update(Object asignacionDTO) {
        super.saveOrUpdate(asignacionDTO);
    }
	
	public void delete(Object asignacionDTO) {
        super.delete(asignacionDTO);
    }
	
	public List<Object> getAll() {
        return super.getAll("getAllAsignaciones");
    }
	
	@SuppressWarnings("unchecked")
	public List<Object> getByAsignacion(AsignacionDTO filtro, boolean fecDevNula){
		List<Object> asignaciones = null;
		List<String> filtros = new ArrayList<String>();
		String queryFilter = "";
		
		try {
            
            if(filtro.getId() != null){
            	filtros.add(" a.id=:id ");            	
            }
            
            if(filtro.getCliente() != null)
            	filtros.add(" a.cliente=:cliente ");
            
            if(filtro.getVehiculo() != null)
            	filtros.add(" a.vehiculo=:vehiculo ");
            	
            if(filtro.getFechaEntrega() != null)
            	filtros.add(" a.fechaEntrega=:fechaEntrega ");
            
            if(filtro.getFechaDevolucion() != null)
            	filtros.add(" a.fechaDevolucion=:fechaDevolucion ");
            
            if(filtro.getFechaDevolucionEfectiva() != null)
            	filtros.add(" a.fechaDevolucionEfectiva=:fechaDevolucionEfectiva ");
            
            if(fecDevNula)
            	filtros.add(" a.fechaDevolucionEfectiva is null ");
            
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
            Query query = session.createQuery("SELECT a FROM AsignacionDTO a" + queryFilter);
            
            if(filtro.getId() != null)
            	query.setParameter("id", filtro.getId());
            
            if(filtro.getCliente() != null)
            	query.setParameter("cliente", filtro.getCliente());
            
            if(filtro.getVehiculo() != null)
            	query.setParameter("vehiculo", filtro.getVehiculo());
            	
            if(filtro.getFechaEntrega() != null)
            	query.setParameter("fechaEntrega", filtro.getFechaEntrega());
            
            if(filtro.getFechaDevolucion() != null)
            	query.setParameter("fechaDevolucion", filtro.getFechaDevolucion());
            
            if(filtro.getFechaDevolucionEfectiva() != null)
            	query.setParameter("fechaDevolucionEfectiva", filtro.getFechaDevolucionEfectiva());
            
            asignaciones = query.list();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
        	HibernateUtil.close(session);
        }
		
		return asignaciones;
	}
}
