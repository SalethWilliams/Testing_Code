package com.test.selenium;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args) {
		//int[] a =new int[4];
//		  Scanner sc = new Scanner(System.in);
//		  int c =a.length;
//		  for(int i=0;i<a.length;i++) {
//		    a[i]=sc.nextInt();
//		    
//		  }
//		  for(int i=0;i<a.length;i++) {
//			    System.out.println(a[i]);
//			    
//			  }
		  
		  
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");	// must need for the chrome driver exe & path or even other ways using third party repository to integrate chrome driver
		// without set property we need to config the environment variable path of driver(Cannot do in office laptop) or driver manager also can used(third party - Need to check about it)
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://letcode.in/edit");
		
//		driver.get("https://letcode.in/login");
//		driver.findElement(By.xpath("//input[@placeholder='Enter Username']")).sendKeys("mor_2314");
//		driver.findElementByXPath("//input[@placeholder='Enter Username']").sendKeys("mor_2314", Keys.TAB);
//		driver.findElementByXPath("//input[@type='password']").sendKeys("83r5^_");
//		driver.findElementByXPath("//button[.='Login']").click();
//		driver.findElementByClassName("button is-primary").click();

		// To see readonly input field
//		String test = driver.findElementById("dontwrite").getAttribute("readonly");		// it will output True for attribute matches to id or it will show null output...
//		System.out.println("Test "+test);
//		boolean test = driver.findElementById("noEdit").isEnabled();		// It will show only the boolean type true or false
//		System.out.println(test);
//		driver.findElementById("dontwrite").clear();	// we can't clear the readonly text in input fields..
//		System.out.println("Current Url "+driver.getCurrentUrl());		// to get the current URL of the current webpage
//		driver.navigate().to("https://letcode.in/login");				// to navigate for the URL like get URL both are same technically as well
//		Navigation nav = driver.navigate();					// Navigation is interface so we can use like this as well, but same not have any difference purpose only to understand we can access this with navigation interface
//		nav.to("https://letcode.in/login");
//		nav.back();					// to click back button in webpage not in DOM, so we can't locate with Xpath..
//		nav.forward();				// same like above to move to before page with forward button
//		
		
//		Use Submit function
//		driver.get("https://letcode.in/login");
//		driver.findElement(By.xpath("//input[@placeholder='Enter Username']")).sendKeys("mor_2314");
//		driver.findElementByXPath("//input[@type='password']").sendKeys("83r5^_");
//		driver.findElementByXPath("//button[.='Login']").click();		//  submit() -- Also be used only for the forms available HTML web elements & formal method to collect the data from forms & send to backend servers, but click also can be used it will work.
		
		
//		34. Interact with active element without finding elements
		driver.get("https://www.facebook.com/"); 			// Switch to is an active element used before with frames, alerts -
		WebElement activeEle = driver.switchTo().activeElement();			// activeElement() will return the webElement so we are use the interface of it to use. Mostly not used in project for interview(How to interact with element without locating with only default cursor locator in input field) - to got with active element in page with cursor in the field 
		activeEle.sendKeys("TestName",			// Send Keys can accept many parameters
				Keys.TAB,
				"TestPassword",
				Keys.ENTER);
		
		
		
		
		// To quit browser after excution
		driver.quit();
		
		
	}
}
