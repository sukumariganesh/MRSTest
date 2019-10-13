package iit.MRS_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
	WebDriver driver;
	
	By username = By.id("username");
	By password = By.id("password");
	By inpatient = By.id("Inpatient Ward");
	By login     = By.id("loginButton");
	By heading  = By.tagName("h4");
	By findpat = By.xpath("//a[@href='/openmrs/coreapps/findpatient/findPatient.page?app=coreapps.findPatient']");
	By pageheading = By.tagName("h2");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public  void login(String user,String pass) {
		
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(inpatient).click();
		driver.findElement(login).click();	
		
	}
	
	public String verifyTitle() {
		
		return driver.getTitle();
	}
	
	public String verifyPageHeading() {
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String pageHeading = driver.findElement(heading).getText();
		return pageHeading;
	}
	
	public String clickFindPatient() {
		
	driver.findElement(findpat).click();
	return driver.findElement(pageheading).getText();
	}
}
