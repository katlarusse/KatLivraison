package org.formation.jsf.validator;

import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator
public class EmailValidator implements Validator {

	public String email;

	

	@Override
	public void validate(FacesContext facesContext, UIComponent arg1, Object arg2) throws ValidatorException {
		
			
	}

}
