package crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crm.base.TestBase;
import crm.util.TestUtil;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//td[contains(text(),'User: Demo User')]")
	WebElement nameofUser;
	
	@FindBy(xpath = "//a[contains(text(), 'Contacts')}")
	WebElement contactsLink;
	
	@FindBy(xpath = "//a[contians(text(), 'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath = "//a[contians(text(), 'Tasks')]")
	WebElement tasksLink;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newContactsLink;
	

	
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public ContactsPage clickonContacts() {
		contactsLink.click();
		return new ContactsPage();
	}
	
	public void clickonDeals() {
		dealsLink.click();
	}
	
	public void clickonTasks() {
		tasksLink.click();
	}
	
	public boolean correctUserNameisDisplayed() {
		return nameofUser.isDisplayed();
		
		
	}
	
	public void clickonNewContacts( ) {
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		
		
		
		
		
	}

}
