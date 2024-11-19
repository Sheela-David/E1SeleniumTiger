package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import objectRepo.HomePage;
import objectRepo.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver sdriver;  //only for listeners
	public SeleniumUtility sUtil = new SeleniumUtility();
	public PropertiesUtility pUtil = new PropertiesUtility();
	public ExcelUtility eUtil = new ExcelUtility();
	
	@BeforeSuite(alwaysRun = true)
	public void dbConnection() {
		System.out.println("DB connection created");
	}
	
	
//	@Parameters("Browser")
//	@BeforeClass(alwaysRun = true)
//	public void launchBrowser(String Browser) throws Exception {
//		
//		if(Browser.equals("Chrome")) {
//			driver = new ChromeDriver();
//		}
//		else if(Browser.equals("Edge")) {
//			driver = new EdgeDriver();
//		}
//		else {
//			driver = new ChromeDriver();
//		}
		
		@Parameters("Browser")
		@BeforeClass(alwaysRun = true)
		public void launchBrowser(@Optional("Chrome") String Browser) throws Exception {
			
			if(Browser.equals("Chrome")) {
				driver = new ChromeDriver();
			}
			else if(Browser.equals("Edge")) {
				driver = new EdgeDriver();
			}
			else {
				driver = new ChromeDriver();
			}
		
			sdriver = driver;   //this sdriver is initialised and will be used in listeners
		sUtil.implicitWait(driver, 15);
		sUtil.maximizeWindow(driver);
		String URL = pUtil.getDataFromPropertiesFile("url");
		sUtil.navigateToUrl(driver,URL);
		System.out.println("Browser launched successfully");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loginOperation() throws Exception {
		String UN  = pUtil.getDataFromPropertiesFile("UN");
		String PWD = pUtil.getDataFromPropertiesFile("PWD");
		LoginPage lp = new LoginPage(driver);
		lp.LoginToApplication(UN, PWD);
		System.out.println("login done successfully");
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void logoutOperation() {
		HomePage hp = new HomePage(driver);
		hp.signOutOperation(driver);
		System.out.println("signout done successfully");
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
		System.out.println("browser quit successfully");
	}
	
	@AfterSuite(alwaysRun = true)
	public void closeDBConnection() {
		System.out.println("DB connection closed");
	}
	
	public void navigateToUrl(WebDriver driver, String url) {
		driver.get(url);
	}
	
	

 
}
