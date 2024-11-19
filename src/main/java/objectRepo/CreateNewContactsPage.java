/**
 * 
 */
package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 */
public class CreateNewContactsPage {
	

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@id='title']")
	private WebElement title;
	
	@FindBy(xpath = "//input[@value='  Save  ']")
	private WebElement saveButton;
	
	public CreateNewContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void createNewContacts(String firstName, String lastName, String title) {
		getFirstName().sendKeys(firstName);
		getLastName().sendKeys(lastName);
		getTitle().sendKeys(title);
		getSaveButton().click();
		
	}

}
