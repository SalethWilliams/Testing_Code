package com.test.java;

public interface RBI {			// Does not need a object like class to access the vaiables or methods
	// Abstract methods with only have the variables(Final variable - cannot be changed or modified) & method calling without body..
	
	int minLimit = 1000;
	
	public void aadharMandatory(); 
	
	public void panMandatory(); 
	
	default void houseLoan() {			// must be have a body for this function using default keyword before method type. This feature available above java 1.8 JRE version only. To overcome body in interface.
		System.out.println("Testing houseLoan class in interface");		// The default method will be overrided by other class which implements this method
	}
	
	static void bikeLoan() {		// 
		System.out.println("Testing BikeLoan class in interface");		
	}
	
	

}
