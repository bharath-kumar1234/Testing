

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


@SuppressWarnings("deprecation")
public class VerificationHardAsrtClass //hardAssertClass
{
	@Test
	public void test()
	{
		 System.setProperty("webdriver.gecko.driver", "./selenium/geckodriver.exe");
		 WebDriver	driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("https://www.facebook.com");
		 String title = driver.getTitle();
		 System.out.println(title);
		 org.testng.Assert.assertEquals(title,"Facebook – log in or sign up");
		 driver.findElement(By.id("email")).sendKeys("abhvsdkj");
	}
}
