package org.web3.flota.persist;

import java.util.List;

public interface IGenericDAO {
	
	public void saveOrUpdate(Object objectDTO);
	
	public void create(Object objectDTO);
	
	public void create(List<Object> objects);
	
	public void delete(String id);
	
	public List<Object> find(Class<?> clazz);
	
	public List<Object> find(Object objectDTO);
	
	public Object find(Class<?> clazz, String id);	
	
	public List<Object> getAll();
	
	public Object get(Class<?> clazz, String id);
	
	public Object get(Object objectDTO);
	
}
