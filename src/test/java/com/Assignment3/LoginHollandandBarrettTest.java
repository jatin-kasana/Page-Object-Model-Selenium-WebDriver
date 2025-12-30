package com.Assignment3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginHollandandBarrettTest {
	WebDriver driver;
	//Create Constructor
	public LoginHollandandBarrettTest(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(id = "username")
	WebElement email;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(name = "action")
	WebElement loginbtn;
	
	//Create Method 
	public void login_Easy(String uname, String pass) {
		email.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
	}
	
}
