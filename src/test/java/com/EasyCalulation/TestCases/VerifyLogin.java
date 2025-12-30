package com.EasyCalulation.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Easycalcul.Pages.LoginEasyCalTest;
import com.Utilities.Helper;

import library.Reusability;

public class VerifyLogin {
	public WebDriver driver;
	
	@Test
	public void CheckValidUser() {
		WebDriver driver = Helper.startBrowser("Chrome", "https://www.login.hiox.com/login?referrer=easycalculation.com");
		
		Reusability.capturedScreenShot(driver, "Step 1. Login To EasyCalculation Application");
		LoginEasyCalTest loginPageEasyCal = PageFactory.initElements(driver, LoginEasyCalTest.class);
		loginPageEasyCal.login_Easy("9740673180", "raghubn@123");
		
		Reusability.capturedScreenShot(driver, "Step 2. Logout of the EasyCalculation Application");
	}
	
}
