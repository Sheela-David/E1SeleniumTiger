package Sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeProgram {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		
		WebElement element = driver.findElement(By.className("Pke_EE"));
		element.sendKeys("iphone 11");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		element.sendKeys("fastrack watch");

	}

}
