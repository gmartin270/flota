package org.web3.flota.persist;

import java.util.List;

public abstract class GenericDAO implements IGenericDAO {

	public abstract void saveOrUpdate(Object objectDTO);
	
	public abstract void create(Object objectDTO);
	
	public abstract void create(List<Object> objects);
	
	public abstract void delete(String id);
	
	public abstract List<Object> find(Class<?> clazz);
	
	public abstract List<Object> find(Object objectDTO);
	
	public abstract Object find(Class<?> clazz, String id);
	
	public abstract List<Object> getAll();
	
	public abstract Object get(Class<?> clazz, String id);
	
	public abstract Object get(Object objectDTO);
}
