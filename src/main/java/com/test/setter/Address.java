package com.test.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	String city;
	String state;
	
	public String getCity() {
		return city;
	}
	
	@Value("Chennai")
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	
	@Value("TN")
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
		
}
