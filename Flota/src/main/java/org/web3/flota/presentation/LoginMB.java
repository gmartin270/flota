package org.web3.flota.presentation;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.web3.flota.model.LoginDTO;

public class LoginMB implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1397930870979414733L;
	private String usuario;
	private String password;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String login() {
		System.out.println("log in ...");
		System.out.println(usuario);
		System.out.println(password);
		
		LoginDTO lg = new LoginDTO();
		lg.setUsuario(usuario);
		lg.setPassword(password);
		
		//return "menu";
		
		if(lg.getUsuario().equals("guillermo") && lg.getPassword().equals("qwerty")){		
			System.out.println("Login: "+ lg.getUsuario());
			System.out.println("Password: " + lg.getPassword());
			
			System.out.println("logged ...");
			
			return "home";
		}else{
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuario y/o contraseña incorrectos"));
			return "login";
		}		
	}	
}
