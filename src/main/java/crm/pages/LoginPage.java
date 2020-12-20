package crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crm.base.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage() { //inititalizing page object here via constructor here
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name ="username")
	WebElement usernameField;
	
	@FindBy(name="password")
	WebElement passwordField;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginButton;
	
	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement signupButton;
	
	@FindBy(xpath = "//body/div[2]/div[1]/div[1]/a[1]/img[1]")
	WebElement crmLogo;
	
	//Different functions
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean CRMImageisDisplayed() {
		return crmLogo.isDisplayed();
	}
	
	public void enterUsernameandPassword (String username, String password) {
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
	
	 
	
	
	
	
	
	
	
}
