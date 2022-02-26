package com.facebook1.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSLocator {

	WebDriver driver;
	
	

	public static void main(String[] args) {

		CSSLocator obj = new CSSLocator();
		obj.oppencss();
		obj.username("harun");
		obj.password("rashid");
	}

	public void oppencss() {

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}	

	public void username(String username) {
		driver. findElement(By.cssSelector("#email")).sendKeys(username);
	}

	public void password(String password) {
		driver.findElement(By.cssSelector("#pass")).sendKeys(password);
	}






}
