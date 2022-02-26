package com.facebook1.login;


import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_1{
   EdgeDriver driver;

public static void main(String[] args) {
	
	 Locators_1 obj=new  Locators_1();
	 obj.openLocators_1();
	 obj.username("harun");
	 obj.password("rashid");
	 
	 
	 
}



	public void openLocators_1() {
	
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		

	}
	
	
public void username(String username) {
	driver. findElement(By.cssSelector("#email")).sendKeys(username);
}

public void password(String password) {
	driver. findElement(By.cssSelector("#passContainer")).sendKeys(password);	
}
	}


