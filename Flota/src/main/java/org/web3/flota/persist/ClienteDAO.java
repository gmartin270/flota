package org.web3.flota.persist;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO extends GenericDAO{
	private static ClienteDAO instance;
	
	private ClienteDAO(){};
	
	private List<Object> clienteDTOs = new ArrayList<Object>();
	
	public static ClienteDAO getInstance(){
		if(instance == null)
			instance = new ClienteDAO();
		return instance;
	}
	
	public void saveOrUpdate(Object objectDTO) {
		clienteDTOs.add((Object)objectDTO);
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
		return clienteDTOs;
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
