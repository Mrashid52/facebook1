package com.facebook1.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin {


	WebDriver driver;


	public static void main(String[] args) {

		TestLogin obj = new TestLogin();
	obj.openapplication();
		obj.userName();
		obj.password();
	}

	public void openapplication() {
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();

	}

public void userName() {
openapplication();
 driver.findElement(By.xpath("//input[@id=('email')]")).sendKeys("harun");
}



public void password() {
openapplication();
driver.findElement(By.xpath("//input[@name=('pass')]")).sendKeys("rashid");
}

}
