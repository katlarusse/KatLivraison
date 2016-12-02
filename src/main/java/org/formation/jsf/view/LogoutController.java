package org.formation.jsf.view;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

public class LogoutController {
	
	public String doLogout() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		session.invalidate();
		return "login";
	}

}
