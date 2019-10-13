package iit.MRS_test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginPageTest extends MRS_TestBase {
	
	SoftAssert sa = new SoftAssert();
	String user,pass;
	LoginPage loginPage = new LoginPage(driver);
	
	@BeforeClass
	public void setup() throws Exception {
		
		initialization();
	}
	
	@Test (priority=1)
	
	public void verifyTitleTest() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("Admin","Admin123");
		String expected_title ="Home";
		String actual_title = loginPage.verifyTitle();
		System.out.println("Executing first test case");
		sa.assertEquals(actual_title,expected_title,"The Title doesnot match");		
	}

	
	@Test(priority=2)
	public void verifyPageHeadingTest()
	{
	LoginPage loginPage = new LoginPage(driver);
	String expected_heading = "Logged in as Super User () at Inpatient Ward.";
	String actual_heading = loginPage.verifyPageHeading();
	System.out.println("Executing second test case");
	sa.assertEquals(actual_heading, expected_heading,"The page heading doesnot match");
	}
	
	@Test(priority=3)
	public void verifyFindPat()
	{
		LoginPage loginPage = new LoginPage(driver);
		String expected_heading = " Find Patient Record ";
		String actual_heading = loginPage.clickFindPatient();
		System.out.println("Executing third test case");
		sa.assertEquals(actual_heading, expected_heading,"The page heading doesnot match");
		
		
	}
}
