package com.synergix.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;

@ManagedBean
@SessionScoped
public class UserLoginView {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void checkLogin(ActionEvent event){
//		public void checkLogin( ){
		RequestContext context = RequestContext.getCurrentInstance();
		FacesMessage message = null;
//		boolean loginedIn = false;
		if (username != null && username.equals("admin") && password !=null && password.equals("123")){
//			loginedIn = true;
			message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome " + username,"Login success");
			System.out.println("login susccess!!!");
		} else {
//			loginedIn = false;
			message = new FacesMessage(FacesMessage.SEVERITY_WARN,"Invaid credentials","Login fail");
			System.out.println("login fail!!!");
		}
		
		FacesContext.getCurrentInstance().addMessage(null, message);
//		context.addCallbackParam("loginedIn", loginedIn);
	}

}
