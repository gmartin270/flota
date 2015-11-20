package org.web3.flota.presentation.converter;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import org.web3.flota.model.ReputacionDTO;
import org.web3.flota.presentation.service.ReputacionService;

@FacesConverter("ReputacionConverter")
public class ReputacionConverter implements Converter {

	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		Object item = null;
		
        if(value != null && value.trim().length() > 0) {
            try {
                ReputacionService service = (ReputacionService) fc.getExternalContext().getApplicationMap().get("reputacionService");
                
                for(int i=0; i<service.getReputaciones().size(); i++){
                	if(((ReputacionDTO)service.getReputaciones().get(i)).getId().equals(value)){
                		item = service.getReputaciones().get(i);
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
            return String.valueOf(((ReputacionDTO) object).getId());
        }
        else {
            return null;
        }
    }   
}
