package com.test.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEmp {

	public static void main(String[] args) {
		// create the IoC containers
		ApplicationContext context = new AnnotationConfigApplicationContext("com.test.setter");
		//Above line will check the package & create the object for our Annnotation clas... that objects called as spring beans
		
		String beans [] = context.getBeanDefinitionNames();       // to access the created object of spring bean we are using context.getBean("") & context.getBeandefinitionName()... it will add the list of @Componenet class & default objects to run the java app
		for (String bean:beans) {								//
			System.out.println(bean);
		}
		
		Address employee = (Address)context.getBean("address");  // "employee" mentioned like camal case...   & (Employee) we are downcasting like floor & ceiling methods in java
		System.out.println(employee);
		
		
	}

}
