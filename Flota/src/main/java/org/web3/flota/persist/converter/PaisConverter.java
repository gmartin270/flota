package org.web3.flota.persist.converter;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import org.web3.flota.model.PaisDTO;
import org.web3.flota.persist.converter.service.PaisService;


@FacesConverter("paisConverter")
public class PaisConverter implements Converter {

	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if(value != null && value.trim().length() > 0) {
            try {
                PaisService service = (PaisService) fc.getExternalContext().getApplicationMap().get("paisService");
                return service.getPaises().get(Integer.parseInt(value));
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
            return String.valueOf(((PaisDTO) object).getId());
        }
        else {
            return null;
        }
    }   
}
