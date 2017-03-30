package com.synergix.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
 
@ManagedBean
@SessionScoped
public class UserView {
     
    private String firstname;
    private String lastname;
    private String email;
 
    public String username() {
        return firstname;
    }
 
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
 
    public String getLastname() {
        return lastname;
    }
 
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
 
    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void save() {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Welcome " + firstname + " " + lastname));
    }
}