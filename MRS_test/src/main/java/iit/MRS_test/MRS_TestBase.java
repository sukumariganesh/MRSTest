package iit.MRS_test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MRS_TestBase {

	
	public static WebDriver driver;
	
	public static void initialization() throws Exception{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");	
			driver = new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://demo.openmrs.org/openmrs/login.htm");
		
		}
	
}
