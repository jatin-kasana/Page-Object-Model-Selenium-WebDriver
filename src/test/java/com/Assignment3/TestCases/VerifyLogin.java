package com.Assignment3.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Assignment3.LoginHollandandBarrettTest;
import com.Utilities.Helper;

import library.Reusability;

public class VerifyLogin {
	public WebDriver driver;
	
	@Test
	public void CheckValidUser() {
		WebDriver driver = Helper.startBrowser("Chrome", "https://auth.hollandandbarrett.com/u/login?");
		
		Reusability.capturedScreenShot(driver, "Step 1. Login To EasyCalculation Application");
		LoginHollandandBarrettTest loginPageEasyCal = PageFactory.initElements(driver, LoginHollandandBarrettTest.class);
		loginPageEasyCal.login_Easy("9740673180", "raghubn@123");
		
		Reusability.capturedScreenShot(driver, "Step 2. Logout of the EasyCalculation Application");
	}
	
}
