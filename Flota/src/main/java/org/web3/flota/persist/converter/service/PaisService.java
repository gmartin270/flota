package org.web3.flota.persist.converter.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.web3.flota.model.PaisDTO;

@ManagedBean(name="paisService", eager=true)
@ApplicationScoped
public class PaisService {

	private List<PaisDTO> paises;
	
	@PostConstruct
	public void init(){
		paises = new ArrayList<PaisDTO>();
		/*paises.add(new PaisDTO("0", "AR", "Argentina"));
		paises.add(new PaisDTO("1", "BR", "Brasil"));*/
	}

	public List<PaisDTO> getPaises() {
		return paises;
	}	
}
