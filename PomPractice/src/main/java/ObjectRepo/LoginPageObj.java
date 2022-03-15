package ObjectRepo;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.ExcelUtil;
import Utilities.WebElementUtil;


public class LoginPageObj {

	WebDriver driver;
	long timeout = 1;
	WebElementUtil elem;
	ExcelUtil exl;
	HashMap<String,String> map;
	int row =0;
	//username txtfld 
	By username  = By.name("username");

	//password txtfld 
	By password  = By.name("password");

	//SignIn btn
	By SignIn = By.name("signin");

	//SignIn functionality
	public void fnSignIn() throws IOException {
		row =exl.ExcelRowNum("D:\\POMPracticeTestData.xlsx", "TestData","Login");
		map =exl.ReadExcelData("D:\\POMPracticeTestData.xlsx", "TestData", row);
		
		elem.txtfld(driver, username, timeout, map.get("username"));
		elem.txtfld(driver, password, timeout, map.get("password"));
		elem.btn(driver, SignIn, timeout);
		}		
	
	//initializing constructor
	public LoginPageObj(WebDriver driver)
	{
		this.driver = driver;
		elem = new WebElementUtil();	
		exl = new ExcelUtil();
	}

}