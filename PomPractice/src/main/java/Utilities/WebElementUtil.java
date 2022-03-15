package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WebElementUtil
{
	public  WebDriverWait wait;

	//text field	
	public void txtfld(WebDriver driver, By elem, long timeout, String value){
		System.out.println("1");
		wait = new WebDriverWait(driver, timeout);
		System.out.println("2");
		int a =driver.findElements(elem).size();
		System.out.println(a);
		//if (driver.findElements(elem).size()!= 0) {
		if (driver.findElement(elem).isDisplayed()) {	
			System.out.println("3");
			try {
				//wait.until(ExpectedConditions.visibilityOfElementLocated(elem));
				wait.until(ExpectedConditions.elementToBeClickable(elem));
				driver.findElement(elem).sendKeys(value);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}

		else
		{
			System.out.println("4");
			driver.quit();
		}
	}

	//buttons
	public  void btn(WebDriver driver, By elem, long timeout){
		System.out.println("5");		
		wait = new WebDriverWait(driver, timeout);
		System.out.println("6");
		if (driver.findElements(elem).size() != 0) {
			try {
				System.out.println("7");
				wait.until(ExpectedConditions.visibilityOfElementLocated(elem));
				System.out.println("8");
				wait.until(ExpectedConditions.elementToBeClickable(elem));
				System.out.println("9");
				driver.findElement(elem).click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("10");
			driver.quit();
		}
	}
}



//	public String TextBox_Value(WebDriver driver,String Locator, String refrence, String Value) throws IOException {
//    	
//        this.driver = driver;
//        
//         JavascriptExecutor js = (JavascriptExecutor) driver;
//        PageLoad_Wait = new Page_Load_utilitie();
//        if (driver.findElements(By.xpath(Locator)).size() != 0) {
//            try {
//                waitMethod(driver).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator)));
//                waitMethod(driver).until(ExpectedConditions.elementToBeClickable(By.xpath(Locator)));
//                js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(Locator)));
//                driver.findElement(By.xpath(Locator)).clear();
//                driver.findElement(By.xpath(Locator)).sendKeys(Value);
//                Result = "Pass";
//            } catch (WebDriverException e) {
//                Result = "Fail";
///*                test.log(Status.FAIL, refrence + " is not visible in the application");
//                String Screen = Take_Screenshot.take_screenshot(driver);
//                test.addScreenCaptureFromPath(Screen);
//                reports.flush();
//*/
//                
//   //             driver.quit();
//
//            }
//
//
//        } else {
//            Result = "Fail";
///*            test.log(Status.FAIL, refrence + " not present in DOM");
//            String Screen = Take_Screenshot.take_screenshot(driver);
//            test.addScreenCaptureFromPath(Screen);
//            reports.flush();
//*/
//           
// //          driver.quit();
//        }
//        return Result;
//
//    }
//
//
//	

//	public void textfield()
//	{
//	
//		driver.findElement(null)
//	}



