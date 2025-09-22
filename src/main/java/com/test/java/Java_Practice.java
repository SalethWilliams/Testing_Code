package com.test.java;

public class Java_Practice extends Axis {		// when using the class we use extends keywords & when interface needed implements
	@Override		
	public void interestFree() {
		this.axisValue=11;			// Parent abstract class can be access with keyword (this.ParentVariableName) only.
		System.out.println("Interest free loans in AXIS bank from Java Practice "+this.axisValue);
	}
	

}
