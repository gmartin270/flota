package org.web3.flota.persist;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.web3.flota.persist.hibernate.HibernateUtil;

public class VehiculoDAO extends GenericDAO{
	private static VehiculoDAO instance;
	Session session;
	
	private VehiculoDAO(){};
	
	private List<Object> vehiculoDTOs = new ArrayList<Object>();
	
	public static VehiculoDAO getInstance(){
		if(instance == null)
			instance = new VehiculoDAO();
		return instance;
	}
	
	public void saveOrUpdate(Object objectDTO) {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		//vehiculoDTOs.add(objectDTO);
		session.persist(objectDTO);
		session.getTransaction().commit();
		
		//HibernateUtil.getSessionFactory().close();
	}
	
	public void create(Object objectDTO){
		
	}
	
	public void create(List<Object> objects){
		
	}
	
	public void delete(String id){
		
	}
	
	public List<Object> find(Class<?> clazz){
		//TODO: cambiar el retorno null
		return null;
	}
	
	public List<Object> find(Object objectDTO){
		//TODO: cambiar el retorno null
		return null;
	}
	
	public Object find(Class<?> clazz, String id){
		//TODO: cambiar el retorno null
		return null;
	}
	
	public List<Object> getAll() {
		return vehiculoDTOs;
	}
	
	public Object get(Class<?> clazz, String id){
		//TODO: cambiar el retorno null
				return null;
	}
	
	public Object get(Object objectDTO){
		//TODO: cambiar el retorno null
				return null;
	}
	
	

}
