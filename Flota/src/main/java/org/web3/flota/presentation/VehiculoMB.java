package org.web3.flota.presentation;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
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
import org.web3.flota.model.ModeloDTO;
import org.web3.flota.model.VehiculoDTO;
import org.web3.flota.presentation.service.ModeloService;

@ManagedBean(name="vehiculoMB")
@ApplicationScoped
public class VehiculoMB  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1173778832902984364L;
	private	String id;
	private List<Object> vehiculos;
	private VehiculoDTO selectedVehiculo;
	private String dominio;
	private ModeloDTO modelo; 
    private List<Object> modelos;
     
    @ManagedProperty(value="#{modeloService}", name="modeloService")
    private ModeloService modeloService;
    
    @PostConstruct
    public void init() {
        modelos = modeloService.getModelos();
        refreshGrid();
    }

	public List<Object> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<Object> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public VehiculoDTO getSelectedVehiculo() {
		return selectedVehiculo;
	}

	public void setSelectedVehiculo(VehiculoDTO selectedVehiculo) {
		this.selectedVehiculo = selectedVehiculo;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	public ModeloDTO getModelo() {
		return modelo;
	}

	public void setModelo(ModeloDTO modelo) {
		this.modelo = modelo;
	}

	public List<Object> getModelos() {
		return modelos;
	}

	public void setModelos(List<Object> modelos) {
		this.modelos = modelos;
	}

	public ModeloService getModeloService() {
		return modeloService;
	}

	public void setModeloService(ModeloService modeloService) {
		this.modeloService = modeloService;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void save() {
		System.out.println("Saving ...");
		
		VehiculoDTO vehiculo = new VehiculoDTO();
		vehiculo.setDominio(dominio);
		vehiculo.setModelo(modelo);
		
		try{
			if(id != null && id.length() > 0){
				vehiculo.setId(id);
				EditFacade editFacade = (EditFacade)FactoryFacade.getFacade(TipoFacade.EDIT);
				editFacade.edit(vehiculo);
			}else{
				CreateFacade createFacade = (CreateFacade)FactoryFacade.getFacade(TipoFacade.CREATE);
				createFacade.create(vehiculo);
			}	
				
		}catch (CreateObjectException co){
			
		}catch (EditObjectException eo){
			
		}
		
		id = null;
		dominio = null;
		modelo = null;
		
		refreshGrid();
	}

	public void editarVehiculo(){
		id = selectedVehiculo.getId();
		dominio = selectedVehiculo.getDominio();
		modelo = selectedVehiculo.getModelo();
	}	
	
	public void borrarVehiculo(){
		RemoveFacade removeFacade = (RemoveFacade)FactoryFacade.getFacade(TipoFacade.REMOVE);
		
		try{
			removeFacade.remove(selectedVehiculo);
		}catch (RemoveObjectException re){
			
		}
		
		selectedVehiculo = null;
		refreshGrid();
	}
	
	private void refreshGrid(){
		SearchFacade searchFac = (SearchFacade)FactoryFacade.getFacade(TipoFacade.SEARCH);
		
        try{
			vehiculos = searchFac.getAll(VehiculoDTO.class);
		}catch (SearchObjectException so){
			
		}
	}	
}
