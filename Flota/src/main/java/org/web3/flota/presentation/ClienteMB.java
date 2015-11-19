package org.web3.flota.presentation;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;

import org.web3.flota.model.ClienteDTO;
import org.web3.flota.model.PaisDTO;
import org.web3.flota.persist.converter.service.PaisService;

public class ClienteMB implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1961134727785477803L;

	private List<ClienteDTO> clientes;
	
	private ClienteDTO selectedCliente;
	
	private String name;
	private String lastName;
	private String dni;
	
	private PaisDTO nacionalidad; 
    private List<PaisDTO> paises;
     
    //@ManagedProperty(value="#{paisService}", name="paisService")
    private PaisService paisService;
    
    @PostConstruct
    public void init() {
        paises = paisService.getPaises();
    }

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public PaisDTO getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(PaisDTO nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public List<PaisDTO> getPaises() {
		return paises;
	}

	public void setPaises(List<PaisDTO> paises) {
		this.paises = paises;
	}

	public PaisService getPaisService() {
		return paisService;
	}

	public void setPaisService(PaisService paisService) {
		this.paisService = paisService;
	}
	
	public List<ClienteDTO> getClientes() {
		return clientes;
	}

	public ClienteDTO getSelectedCliente() {
		return selectedCliente;
	}

	public void setSelectedCliente(ClienteDTO selectedCliente) {
		this.selectedCliente = selectedCliente;
	}
	
	public void save() {
		System.out.println("Saving ...");
		
		/*
		Persona physicalPerson = new Persona();
		physicalPerson.setName(name);
		physicalPerson.setLastName(lastName);
		physicalPerson.setDni(dni);
		physicalPerson.setNickName(nickName);
		physicalPerson.setNacionalidad(nacionalidad);
		
		if(personas == null)
			personas = new ArrayList<Persona>();
		
		if(selectedPersona != null){
			physicalPerson.setId(selectedPersona.getId());
			personas.remove(selectedPersona);
			personas.add(selectedPersona.getId().intValue(), physicalPerson);
			selectedPersona = null;
		}else{
			physicalPerson.setId(new Long(personas.size()));
			personas.add(physicalPerson);
		}*/
		
		name = null;
		lastName = null;
		dni = null;
		nacionalidad = null;
		
		System.out.println("Saved ...");
	}

	public void editarPersona(){
		/*name = selectedPersona.getName();
		lastName = selectedPersona.getLastName();
		dni = selectedPersona.getDni();
		nickName = selectedPersona.getNickName();
		nacionalidad = selectedPersona.getNacionalidad();*/
	}	
	
	public void borrarPersona(){
		/*personas.remove(selectedPersona);
		selectedPersona = null;*/
	}
}
