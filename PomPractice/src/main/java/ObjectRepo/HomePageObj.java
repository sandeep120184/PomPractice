package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.WebElementUtil;


public class HomePageObj {

	WebDriver driver;
	long timeout = 1;
	WebElementUtil elem;

	//Login button 
	By loginbtn  = By.id("btn-1581481968157");

	//setting login btn
//	public void setLoginbtn()
//	{
//		elem.btn(driver, loginbtn, timeout);
//	}

//	//login functionality
	public void fnLogin1() {
	elem.btn(driver, loginbtn, timeout);
	}

	//initializing constructor
	public HomePageObj(WebDriver driver)
	{
		this.driver = driver;
		elem = new WebElementUtil();
	}

}
