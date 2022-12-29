import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample11
{
@Test
public void test() throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "./selenium/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://localhost/login.do");
	Pom p= new Pom(driver);
	p.Button();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	p.Button();
	driver.quit();
}
}
