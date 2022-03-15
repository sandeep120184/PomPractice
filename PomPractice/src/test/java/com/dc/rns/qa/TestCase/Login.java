package com.dc.rns.qa.TestCase;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import ObjectRepo.HomePageObj;
import ObjectRepo.LoginPageObj;


public class Login extends BaseTest {

	
public static 	HomePageObj HP ;
public static	LoginPageObj lp;
//	public static ExtentReports report;
//	public static ExtentTest test;
	
	
	
	@Test
	public void fnLogin() throws IOException
	{	
	
		HP = new HomePageObj(driver);
		lp = new LoginPageObj(driver);
		
		HP.fnLogin1();
		
//		HP.fnLogin();
//		lp.fnSignIn();
//		Assert.assertEquals("Login", "Login");
//		
//		test=report.createTest("Test1");
//       test.log(Status.PASS, "Test Case 1st Pass");	
	}
}
