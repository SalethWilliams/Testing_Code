package com.test.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String employeeName;
	private int empId;
	private String depart;
	
	// Employee depends on Address
	Address address;
	
	public Address getAddress() {
		return address;
	}
	
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	
	@Value("Raju")
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	    
	public int getEmpId() {
		return empId;
	}
	
	@Value("15")     // Spring converts itself for int even mentioned in "" like string
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDepart() {
		return depart;
	}
	
	@Value("CSE")
	public void setDepart(String depart) {
		this.depart = depart;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", empId=" + empId + ", depart=" + depart + ", address="
				+ address + "]";
	}
	 

}
