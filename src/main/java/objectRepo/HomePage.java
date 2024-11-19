package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//td[@class='tabUnSelected' and .='Leads']")
	private WebElement leads;
	
	@FindBy(xpath = "//td[@class='tabUnSelected']/a[.='Organizations']")
	private WebElement Organisations;
	
	@FindBy(xpath = "//a[.='Contacts']")
	private WebElement Contacts;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement Accounts;
	
	@FindBy(xpath = "//a[.='Sign Out']")
	private WebElement SignOut;
	
	public WebElement getLeads() {
		return leads;
	}

	public WebElement getOrganisations() {
		return Organisations;
	}

	public WebElement getContacts() {
		return Contacts;
	}

	public WebElement getAccounts() {
		return Accounts;
	}

	public WebElement getSignOut() {
		return SignOut;
	}

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnLeadsMenu() {
		getLeads().click();
	}
	
	public void clickOnOrganisationsMenu() {
		getOrganisations().click();
	}
	
	public void clickOnContactsMenu() {
		getContacts().click();
	}
	
	//business library to perform signout operation
	public void signOutOperation(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(getAccounts()).perform();
		getSignOut().click();
	}
	
}



