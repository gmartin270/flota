package org.web3.flota.persist;

import java.util.List;

public interface IGenericDAO {
	
	public void create(Object objectDTO);
	
	public void update(Object objectDTO);
	
	public void delete(Object objectDTO);
	
	public List<Object> getAll();
}
