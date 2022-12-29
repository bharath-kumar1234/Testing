package tester;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Grni
{
WebDriver driver;
@BeforeMethod
public void openapp() throws InterruptedException
{
	driver= new FirefoxDriver();
	System.setProperty("webdriver.gecko.driver", "./selenium/geckodriver.exe");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
}
@AfterMethod
public void closeapp()
{
	driver.close();
}
}
