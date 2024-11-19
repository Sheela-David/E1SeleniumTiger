package objectRepo;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class CreatingNewLeadPage {
		@FindBy(xpath = "//input[@name='firstname']")
		private WebElement firstName;
		
		@FindBy(xpath = "//input[@name='lastname']")
		private WebElement lastName;
		
		@FindBy(xpath = "//input[@name='company']")
		private WebElement company;
		
		@FindBy(xpath = "//input[@id='designation']")
		private WebElement title;
		
		@FindBy(xpath = "//input[@id='phone']")
		private WebElement phone;
		
		@FindBy(xpath = "//input[@id='mobile']")
		private WebElement mobile;
		
		@FindBy(xpath = "//input[@id='email']")
		private WebElement email;
		
		@FindBy(xpath = "//input[@id='noofemployees']")
		private WebElement noOfEmp;
		
		@FindBy(xpath = "//textarea[@name='lane']")
		private WebElement street;
		
		@FindBy(xpath = "//input[@id='pobox']")
		private WebElement poBox;
		
		@FindBy(xpath = "//input[@id='code']")
		private WebElement postalCode;
		
		@FindBy(xpath = "//input[@id='city']")
		private WebElement city;
		
		@FindBy(xpath = "//input[@id='country']")
		private WebElement country;
		
		@FindBy(id ="state")
		private WebElement state;
		
		@FindBy(className = "crmButton")
		private WebElement saveButton;
		
		///constructor where we'll be passing driver as argument in order to get all the methods in driver into initElements()
		public CreatingNewLeadPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

	    //generating getters for all the elements
		public WebElement getFirstName() {
			return firstName;
		}


		public WebElement getLastName() {
			return lastName;
		}


		public WebElement getCompany() {
			return company;
		}


		public WebElement getTitle() {
			return title;
		}


		public WebElement getPhone() {
			return phone;
		}


		public WebElement getMobile() {
			return mobile;
		}


		public WebElement getEmail() {
			return email;
		}


		public WebElement getNoOfEmp() {
			return noOfEmp;
		}


		public WebElement getStreet() {
			return street;
		}


		public WebElement getPoBox() {
			return poBox;
		}


		public WebElement getPostalCode() {
			return postalCode;
		}


		public WebElement getCity() {
			return city;
		}


		public WebElement getCountry() {
			return country;
		}


		public WebElement getState() {
			return state;
		}


		public WebElement getSaveButton() {
			return saveButton;
		}
		
		//business libraries
		
		public void createNewLead(String fName, String lName, String company ) {
			getFirstName().sendKeys(fName);
			getLastName().sendKeys(lName);
			getCompany().sendKeys(company);
			getSaveButton().click();
			}
		
		public void createNewLead(String fName, String lName, String company, String title, String phone, String mobile, String email, String noOfEmp, String street, String poBox, String postalCode, String city, String country, String state) {
			getFirstName().sendKeys(fName);
			getLastName().sendKeys(lName);
			getCompany().sendKeys(company);
			getTitle().sendKeys(title);
			getPhone().sendKeys(phone);
			getMobile().sendKeys(mobile);
			getEmail().sendKeys(email);
			getNoOfEmp().sendKeys(noOfEmp);
			getStreet().sendKeys(street);
			getPoBox().sendKeys(poBox);
			getPostalCode().sendKeys(postalCode);
			getCity().sendKeys(city);
			getCountry().sendKeys(country);
			getState().sendKeys(state);
			getSaveButton().click();
			
		}
		
		public void createNewLead(String fName, String lName, String company, String title, String phone, String mobile, String email, String noOfEmp) {
			getFirstName().sendKeys(fName);
			getLastName().sendKeys(lName);
			getCompany().sendKeys(company);
			getTitle().sendKeys(title);
			getPhone().sendKeys(phone);
			getMobile().sendKeys(mobile);
			getEmail().sendKeys(email);
			getNoOfEmp().sendKeys(noOfEmp);
			getSaveButton().click();
		}
		
		//this is a business library to create a new lead
		public void createNewLead(String fName, String lName, String company, String street, String poBox, String postalCode, String city, String country, String state ) {
			getFirstName().sendKeys(fName);
			getLastName().sendKeys(lName);
			getCompany().sendKeys(company);
			getStreet().sendKeys(street);
			getPoBox().sendKeys(poBox);
			getPostalCode().sendKeys(postalCode);
			getCity().sendKeys(city);
			getCountry().sendKeys(country);
			getState().sendKeys(state);
			getSaveButton().click();
		}
		
	}

	

	
