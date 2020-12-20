package crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crm.base.TestBase;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath = "//td[contacts(text(), 'Contacts')]")
	WebElement contactsLabel;
	
	@FindBy(xpath= "//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]")
	WebElement nameField;
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean contactsLabelIsDisplayed() {
		return contactsLabel.isDisplayed();
	}
	
	public boolean nameFieldIsDisplayed() {
		return nameField.isDisplayed();
	}
	

}
