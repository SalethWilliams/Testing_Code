package com.test.java;

public abstract class Axis implements RBI {		// when inheiting the RBI interface need 100% implementation of the interface methods
	// Once changed the class into abstract class then it needs the RBI methods but can also create methods in the class & we can extends the abstract class to other class without 100% implementations of methods like interface

	int axisValue=10;			// Can be acessed in the extends class of child class
	
	@Override
	public void aadharMandatory() {
		// TODO Auto-generated method stub
		System.out.println("aadharMandatory in AXIS bank");

	}
	@Override		// cannot mention this override in same class.. this is interface method so we are overriding it..
	public void panMandatory() {
		// TODO Auto-generated method stub
		System.out.println("panMandatory in AXIS bank");

	}
	
	public void interestFree() {
		System.out.println("Interest free loans in AXIS bank");
	}
	
	@Override
	public void houseLoan() {			// must be have a body for this function using default keyword before method type. This feature available above java 1.8 JRE version only. To overcome body in interface.
		System.out.println("Testing houseLoan of interface in Axis class");		// The default method will be overrided by other class which implements this method
	}
	
	
	
	

}
