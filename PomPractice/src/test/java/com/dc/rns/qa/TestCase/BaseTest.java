package com.dc.rns.qa.TestCase;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest {

	public WebDriver driver;

	@Parameters({"strbrowser","url"})
	@BeforeClass
	public void setBrowser(String strbrowser,String url)
	{

		if (strbrowser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else
			if(strbrowser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
				//driver = new geckoDriver();
			}
		//navigating to url
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

	}
//
//	@AfterTest(alwaysRun=true)
//	public void teardown()
//	{
//		driver.quit();
//	}
}
