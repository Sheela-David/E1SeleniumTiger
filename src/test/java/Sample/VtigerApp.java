package Sample;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class VtigerApp {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		PropertiesUtility p = new PropertiesUtility();
		String url = p.getDataFromPropertiesFile("url");
		String username = p.getDataFromPropertiesFile("UN");
		driver.get(url);
		
	
	}

}
