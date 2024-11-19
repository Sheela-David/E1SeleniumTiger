package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganizationPage {
	
	@FindBy(xpath = "//input[@name=\"accountname\"]")
    private WebElement organizationName;
	
	@FindBy(xpath = "//input[@style='width:74%;']")
	private WebElement webSite;
	
	@FindBy(xpath = "//input[@id='employees']")
	private WebElement employees;
	
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phone;
	
	@FindBy(xpath = "//input[@id='otherphone']")
	private WebElement otherPhone;
	
	@FindBy(xpath = "//input[@id='email1']")
	private WebElement email;
	
	@FindBy(xpath = "//textarea[@name=\"bill_street\"]")
	private WebElement billingAddress;
	
	@FindBy(xpath = "//input[@id='bill_city']")
	private WebElement billingCity;
	
	@FindBy(xpath = "//input[@id='bill_state']")
	private WebElement billingState;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public CreateNewOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getorganizationName() {
		return organizationName;
	}

	public WebElement getWebSite() {
		return webSite;
	}

	public WebElement getEmployees() {
		return employees;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getOtherPhone() {
		return otherPhone;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getBillingCity() {
		return billingCity;
	}

	public WebElement getBillingState() {
		return billingState;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	/**
	 * This is a business library to create ORG_01
	 * @param organizationName
	 * @param webSite
	 * @param employees
	 */
	public void createNewOrganization(String organizationName, String webSite, String employees) {
		getorganizationName().sendKeys(organizationName);
		getWebSite().sendKeys(webSite);	
		getEmployees().sendKeys(employees);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create ORG_02
	 * @param organizationName
	 * @param webSite
	 * @param employees
	 * @param phone
	 * @param otherPhone
	 * @param email
	 */
	public void createNewOrganization(String organizationName, String webSite, String employees, String phone, String otherPhone, String email) {
		getorganizationName().sendKeys(organizationName);
		getWebSite().sendKeys(webSite);	
		getEmployees().sendKeys(employees);
		getPhone().sendKeys(phone);
		getOtherPhone().sendKeys(otherPhone);
		getEmail().sendKeys(email);
		getSaveButton().click();
		
	}
	
	/**
	 * This is a business library to create ORG_03
	 * @param organizationName
	 * @param webSite
	 * @param billingAddress
	 * @param billingCity
	 * @param billingState
	 * @throws InterruptedException 
	 */
	public void createNewOrganization(String organizationName, String webSite, String billingAddress, String billingCity, String billingState ) throws InterruptedException {
		getorganizationName().sendKeys(organizationName);
		getWebSite().sendKeys(webSite);	
		getBillingAddress().sendKeys(billingAddress);
		getBillingCity().sendKeys(billingCity);
		getBillingState().sendKeys(billingState);
		Thread.sleep(10000);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create ORG_04
	 * @param organizationName
	 * @param webSite
	 * @param employees
	 * @param phone
	 * @param otherPhone
	 * @param email
	 * @param billingAddress
	 * @param billingCity
	 * @param billingState
	 */
	public void createNewOrganization(String organizationName, String webSite, String employees, String phone, String otherPhone, String email, String billingAddress, String billingCity, String billingState ) {
		getorganizationName().sendKeys(organizationName);
		getWebSite().sendKeys(webSite);	
		getEmployees().sendKeys(employees);
		getPhone().sendKeys(phone);
		getOtherPhone().sendKeys(otherPhone);
		getEmail().sendKeys(email);
		getBillingAddress().sendKeys(billingAddress);
		getBillingCity().sendKeys(billingCity);
		getBillingState().sendKeys(billingState);
		getSaveButton().click();
		
	}
	
	

}
