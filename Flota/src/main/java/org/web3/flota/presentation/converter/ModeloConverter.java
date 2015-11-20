package org.web3.flota.presentation.converter;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import org.web3.flota.model.ModeloDTO;
import org.web3.flota.presentation.service.ModeloService;

@FacesConverter("ModeloConverter")
public class ModeloConverter implements Converter {

	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		Object item = null;
		
        if(value != null && value.trim().length() > 0) {
            try {
                ModeloService service = (ModeloService) fc.getExternalContext().getApplicationMap().get("modeloService");
                
                for(int i=0; i<service.getModelos().size(); i++){
                	if(((ModeloDTO)service.getModelos().get(i)).getId().equals(value)){
                		item = service.getModelos().get(i);
                		break;
                	}
                }
                
                return item;
            } catch(NumberFormatException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid country."));
            }
        }
        else {
            return null;
        }
    }
 
    public String getAsString(FacesContext fc, UIComponent uic, Object object) {
        if(object != null) {
            return String.valueOf(((ModeloDTO) object).getId());
        }
        else {
            return null;
        }
    }   
}
