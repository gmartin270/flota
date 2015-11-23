package org.web3.flota.presentation.converter;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import org.web3.flota.model.ModeloDTO;
import org.web3.flota.presentation.service.ModeloService;
import org.web3.flota.presentation.service.ModeloTodosService;

@FacesConverter("ModeloConverter")
public class ModeloTodosConverter implements Converter {

	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		if(value != null && value.trim().length() > 0) {
            try {
                ModeloTodosService service = (ModeloTodosService) fc.getExternalContext().getApplicationMap().get("modeloTodosService");
                return service.getModelos().get(Integer.parseInt(value));
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
            return String.valueOf(((ModeloDTO) object).getCodigo());
        }
        else {
            return null;
        }
    }   
}
