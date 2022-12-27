package Selenium;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resize
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./slenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		Dimension d= new Dimension(700,1000);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		driver.quit();
	}
}
