package org.web3.flota.persist;

import java.util.ArrayList;
import java.util.List;

import org.web3.flota.model.VehiculoDTO;


public class VehiculoDAO {
	private static VehiculoDAO instance;
	
	private VehiculoDAO(){};
	
	private List<VehiculoDTO> vehiculoDTOs = new ArrayList<VehiculoDTO>();
	
	public static VehiculoDAO getInstance(){
		if(instance == null)
			instance = new VehiculoDAO();
		return instance;
	}
	
	public void saveOrUpdate(Object vehiculoDTO) {
		vehiculoDTOs.add((VehiculoDTO)vehiculoDTO);
	}
	
	public List<VehiculoDTO> getAll() {
		return vehiculoDTOs;
	}

}
