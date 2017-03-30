package com.synergix.training.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


public class Employee {
	private String employeeID;
	private String employeeName;
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	

}
