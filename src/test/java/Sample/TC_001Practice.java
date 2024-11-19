package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;

public class TC_001Practice {
	
	SeleniumUtility sUtil = new SeleniumUtility();
	PropertiesUtility pUtil = new PropertiesUtility();
	@Test
	public void TC_01() throws Exception {
		WebDriver driver = new ChromeDriver();
		sUtil.implicitWait(driver, 15);
		sUtil.maximizeWindow(driver);
		String url = pUtil.getDataFromPropertiesFile("url");
		driver.get(url);
		String UN = pUtil.getDataFromPropertiesFile("username");
		
	}

}
