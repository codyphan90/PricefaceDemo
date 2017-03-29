package com.synergix.bean;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.synergix.training.model.Employee;

@ManagedBean
@SessionScoped
public class ViewEmployeeManagedBean {
	private List<Employee> employees = new ArrayList<Employee>();

	public ViewEmployeeManagedBean() {
		
	}
	
	@PostConstruct
	public void populcateEmployeeList(){
		for (int i = 0; i <= 10; i++) {
			Employee emp = new Employee();
			emp.setEmployeeID(String.valueOf(i));
			emp.setEmployeeName("Nguyen Van "+i);
			this.employees.add(emp);
		}
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	

}
