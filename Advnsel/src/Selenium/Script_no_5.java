package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_no_5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./slenium/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.close();
	}

}
