package com.test.java;

public class MainClass {

	public static void main(String[] args) {
		
		Java_Practice myAxis = new Java_Practice();
//		myAxis.aadharMandatory();
//		myAxis.panMandatory();
//		myAxis.interestFree();
//		System.out.println("My Axis Bank with min bal " +Axis.minLimit);
		
		//RBI myRBI = new Axis(); 	// we can call interface & create object with reference of Axis class because RBI class cannot create object
		myAxis.aadharMandatory(); 	// cannot call the axis class methods like interestFree() methods only can access RBI class variable & methods
		myAxis.houseLoan();			//	we can access the houseLoan of interface default method with Axis class object & it can be overrided in that Axis class()
		RBI.bikeLoan();			// Static method of interface should be called by it interface name Only with dot(.) of the respective method name & params
		
		System.out.println();
		System.out.println("Axis value of abstract class "+myAxis.axisValue);
		myAxis.interestFree();
		
		
		
		
		
		
		
	}

}
