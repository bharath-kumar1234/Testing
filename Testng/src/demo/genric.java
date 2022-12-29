package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class genric{
	
	WebDriver driver;
	@BeforeMethod
	public void openApp() {
		System.setProperty("webdriver.gecko.driver", "./selenium/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}
}
