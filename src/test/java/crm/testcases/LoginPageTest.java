package crm.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crm.base.TestBase;
import crm.pages.HomePage;
import crm.pages.LoginPage;
import crm.util.TestUtil;

public class LoginPageTest extends TestBase {
	LoginPage loginPage; //creating global variable of LoginPage
	//HomePage homePage();
	
	public LoginPageTest() {
		super();  //the super keyword calls on the the constructor of the superclass (aka constructor of the TestBase in order to intilizative the properties) 
	}
	
	
	@BeforeMethod
	public void setUp() {
		launchBaseURL();
		loginPage = new LoginPage();
	}
		
	@Test(priority=1) 
	public void verifyTitle() {
		
		String expectedTitle=loginPage.getLoginPageTitle();
		AssertJUnit.assertEquals(expectedTitle, "CRMPRO - CRM software for customer relationship management, sales, and support.");
		
		
		
	}
	
	@Test (priority=2) 
	public void verifyCRMLogo() {
		boolean flagisDisplayed = loginPage.CRMImageisDisplayed();
		AssertJUnit.assertTrue(flagisDisplayed);
		
		
	}
	@Test(priority=3) 
	
	public void loginTest() {
		
		System.out.println("Login Worked");
	}
		

	
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	

}
