package org.web3.flota.presentation;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedProperty;

import org.web3.flota.bussiness.exceptions.CreateObjectException;
import org.web3.flota.bussiness.exceptions.EditObjectException;
import org.web3.flota.bussiness.exceptions.RemoveObjectException;
import org.web3.flota.bussiness.exceptions.SearchObjectException;
import org.web3.flota.bussiness.facade.CreateFacade;
import org.web3.flota.bussiness.facade.EditFacade;
import org.web3.flota.bussiness.facade.RemoveFacade;
import org.web3.flota.bussiness.facade.SearchFacade;
import org.web3.flota.bussiness.facade.TipoFacade;
import org.web3.flota.bussiness.factory.FactoryFacade;
import org.web3.flota.model.ClienteDTO;
import org.web3.flota.model.PaisDTO;
import org.web3.flota.model.ReputacionDTO;
import org.web3.flota.model.TipoDocumentoDTO;
import org.web3.flota.presentation.service.PaisService;
import org.web3.flota.presentation.service.ReputacionService;
import org.web3.flota.presentation.service.TipoDocumentoService;

public class ClienteMB implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1961134727785477803L;

	private List<Object> clientes;
	private ClienteDTO selectedCliente;
	private String id;
	private String name;
	private String lastName;
	private TipoDocumentoDTO tipoDocumento;
	private String dni;
	private String direccion;
	private PaisDTO nacionalidad;
	private ReputacionDTO reputacion;
    private List<Object> nacionalidades;
    private List<Object> reputaciones;
    private List<Object> tiposDocumento;
    
    @ManagedProperty("#{paisService}")
    private PaisService paisService;
    
    @ManagedProperty("#{reputacionService}")
    private ReputacionService reputacionService;
    
    @ManagedProperty("#{tipoDocumentoService}")
    private TipoDocumentoService tipoDocumentoService;
    
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

	public List<Object> getClientes() {
		return clientes;
	}

	public ClienteDTO getSelectedCliente() {
		return selectedCliente;
	}

	public void setSelectedCliente(ClienteDTO selectedCliente) {
		this.selectedCliente = selectedCliente;
	}
	public void setClientes(List<Object> clientes) {
		this.clientes = clientes;
	}
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setTipoDocumento(TipoDocumentoDTO tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public ReputacionDTO getReputacion() {
		return reputacion;
	}

	public void setReputacion(ReputacionDTO reputacion) {
		this.reputacion = reputacion;
	}
	public List<Object> getNacionalidades() {
		return nacionalidades;
	}
	public void setNacionalidades(List<Object> nacionalidades) {
		this.nacionalidades = nacionalidades;
	}
	public PaisService getPaisService() {
		return paisService;
	}
	public void setPaisService(PaisService paisService) {
		this.paisService = paisService;
	}
	public List<Object> getReputaciones() {
		return reputaciones;
	}
	public void setReputaciones(List<Object> reputaciones) {
		this.reputaciones = reputaciones;
	}
	public ReputacionService getReputacionService() {
		return reputacionService;
	}
	public void setReputacionService(ReputacionService reputacionService) {
		this.reputacionService = reputacionService;
	}
	public List<Object> getTiposDocumento() {
		return tiposDocumento;
	}
	public void setTiposDocumento(List<Object> tiposDocumento) {
		this.tiposDocumento = tiposDocumento;
	}
	public TipoDocumentoService getTipoDocumentoService() {
		return tipoDocumentoService;
	}
	public void setTipoDocumentoService(TipoDocumentoService tipoDocumentoService) {
		this.tipoDocumentoService = tipoDocumentoService;
	}
	public TipoDocumentoDTO getTipoDocumento() {
		return tipoDocumento;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@PostConstruct
    public void init() {
		nacionalidades = paisService.getPaises();
		reputaciones = reputacionService.getReputaciones();
		tiposDocumento = tipoDocumentoService.getTipos();
		
		refreshGrid();
    }
	
	public void save() {
		System.out.println("Saving ...");
		
		ClienteDTO cliente = new ClienteDTO();
		cliente.setNombres(name);
		cliente.setApellidos(lastName);
		cliente.setNroDocumento(dni);
		cliente.setDireccion(direccion);
		cliente.setNacionalidad(nacionalidad);
		cliente.setTipo(tipoDocumento);
		cliente.setReputacion(reputacion);
		
		try{
			if(id != null && id.length() > 0){
				cliente.setId(id);
				EditFacade editFacade = (EditFacade)FactoryFacade.getFacade(TipoFacade.EDIT);
				editFacade.edit(cliente);
			}else{
				CreateFacade createFacade = (CreateFacade)FactoryFacade.getFacade(TipoFacade.CREATE);
				createFacade.create(cliente);
			}	
				
		}catch (CreateObjectException co){
			
		}catch (EditObjectException eo){
			
		}
		
		id = null;
		name = null;
		lastName = null;
		dni = null;
		nacionalidad = null;
		tipoDocumento = null;
		reputacion = null;
		direccion = null;
		
		refreshGrid();
		
		System.out.println("Saved ...");
	}

	public void editarCliente(){
		name = selectedCliente.getNombres();
		lastName = selectedCliente.getApellidos();
		dni = selectedCliente.getNroDocumento();
		direccion = selectedCliente.getDireccion();
		nacionalidad = selectedCliente.getNacionalidad();
		tipoDocumento = selectedCliente.getTipo();
		reputacion = selectedCliente.getReputacion();
		id = selectedCliente.getId();
		
		//nacionalidades = paisService.getPaises();
		//reputaciones = reputacionService.getReputaciones();
		//tiposDocumento = tipoDocumentoService.getTipos();
		
	}	
	
	public void borrarCliente(){
		RemoveFacade removeFacade = (RemoveFacade)FactoryFacade.getFacade(TipoFacade.REMOVE);
		
		try{
			removeFacade.remove(selectedCliente);
		}catch (RemoveObjectException re){
			
		}
		
		selectedCliente = null;
		refreshGrid();
	}
	
	private void refreshGrid(){
		SearchFacade searchFac = (SearchFacade)FactoryFacade.getFacade(TipoFacade.SEARCH);
		
        try{
			clientes = searchFac.getAll(ClienteDTO.class);
			for (Object object : clientes) {
				System.out.println("Nombre del cliente: "+((ClienteDTO)object).getNombres()+" - Tipo"+((ClienteDTO)object).getTipo().getId());
			}
		}catch (SearchObjectException so){
			
		}
	}	
}
