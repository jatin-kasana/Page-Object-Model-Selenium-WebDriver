package com.Easycalcul.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginEasyCalTest {
	WebDriver driver;
	//Create Constructor
	public LoginEasyCalTest(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(id = "log_email")
	WebElement email;
	
	@FindBy(id = "log_password")
	WebElement password;
	
	@FindBy(id = "//input[contains(@name, 'log_submit')]")
	WebElement loginbtn;
	
	//Create Method 
	public void login_Easy(String uname, String pass) {
		email.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
	}
	
}
