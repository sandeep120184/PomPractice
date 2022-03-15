package com.dc.rns.qa.TestCase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import ObjectRepo.HomePageObj;
import ObjectRepo.LoginPageObj;

public class LoginNegative extends BaseTest{


        HomePageObj HP ;
		LoginPageObj lp;
		
		@Test
		public void fnLogin()
		{	
			HP = new HomePageObj(driver);
			lp = new LoginPageObj(driver);
			HP.fnLogin1();
				}

	
	}