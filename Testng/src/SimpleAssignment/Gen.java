package SimpleAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Gen 
{
	WebDriver driver;
	@BeforeMethod
	public void openApp() 
	{
		System.setProperty("webdriver.gecko.driver", "./selenium/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeApp() 
	{
		driver.quit();
	}
}
