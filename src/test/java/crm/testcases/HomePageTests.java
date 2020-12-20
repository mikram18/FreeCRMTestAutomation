/*
 * @author Mohammad Ikram
 */

package crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crm.base.TestBase;
import crm.pages.ContactsPage;
import crm.pages.HomePage;
import crm.pages.LoginPage;
import crm.util.TestUtil;

public class HomePageTests extends TestBase { //command+shift+o to import everything
	HomePage homepage;
	LoginPage loginPage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	
	public HomePageTests() {
		super();
	}

	//test cases should be separated and be independent of each other. This is why before each method we start new browser and after the method we close the browser
	@BeforeMethod
	public void setUp() {
		launchBaseURL();
		loginPage = new LoginPage();
		loginPage.enterUsernameandPassword(prop.getProperty("username")  , prop.getProperty("password"));
		loginPage.clickLoginButton();
		homepage = new HomePage();
		contactsPage = new ContactsPage();
		testUtil = new TestUtil();
	}
	
	@Test(priority =1)
	
	public void verifyHomePageTitleTest() throws InterruptedException {
		String actualTitle = homepage.getHomePageTitle();
		Assert.assertEquals(actualTitle, "CRMPRO", "Home page title is not matched"); //the third string is the error message which will be shown if the actual title and the expected title do not match)
		//Thread.sleep(1000);
	}
	
	@Test(priority =2)
	
	public void verifyUserNameTest() {
		testUtil.switchtoFrame();
		Assert.assertTrue(homepage.correctUserNameisDisplayed());
	}
	
	@Test (priority =3)
	public void verifyContactsLinkTest() {
		testUtil.switchtoFrame();
		contactsPage = homepage.clickonContacts();
		//Assert.assertTrue(contactsPage.contactsLabelIsDisplayed());
		
	}
	
	
	//test 2 and 3 don't work. start watching here https://youtu.be/ea0P7MBQmiM?t=3401
	
	
	
	
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
		
}
