package genericUtility;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SeleniumUtility {
	
	public void implicitWait(WebDriver driver, int maxTime) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
		
	}
	
	public void selectOptionByIndex(WebElement dropdownElement, int index) {
		Select sel = new Select(dropdownElement);
		sel.selectByIndex(index);

	}
	
	public void selectOptionByValue(WebElement dropdownElement, String value) {
		Select sel = new Select(dropdownElement);
		sel.selectByValue(value);
	}
	
	public void selectOptionByVisibleText(WebElement dropdownElement, String text) {
		Select sel = new Select(dropdownElement);
		sel.selectByVisibleText(text);
	}
	
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void cancelAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public String getAlertMessage(WebDriver driver) {
		String value = driver.switchTo().alert().getText();
		return value;
	}
	
	public void sendAlertMessage(WebDriver driver, 	String value){
		driver.switchTo().alert().sendKeys(value);
	}
	
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	
	public void switchToFrame(WebDriver driver, String nameOrIdAttribute) {
		driver.switchTo().frame(nameOrIdAttribute);
	}


	public void switchToFrame(WebDriver driver, WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}
	
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void navigateToUrl(WebDriver driver, String uRL) {
		driver.get(uRL);
	}
	
	public String captureSreenshot(WebDriver driver, String screenshotName) throws Exception{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshot\\"+screenshotName+".png");
		Files.copy(src, dest);
		return dest.getAbsolutePath();
	}
	
}
	
