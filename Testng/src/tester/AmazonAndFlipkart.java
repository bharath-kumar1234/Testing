package tester;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AmazonAndFlipkart
{
	@Test
	public void Amazom() throws InterruptedException
	{
	
	System.setProperty("webdriver.gecko.driver","./slenium/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//Button[.='✕']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone13");
	driver.findElement(By.xpath("(//div[@class='nav-right'])[1]")).click();
	driver.findElement(By.xpath("(//span[.='Apple iPhone 13 (128GB) - (Product) RED'])[1]")).click();
	Set<String> id = driver.getWindowHandles();
	ArrayList<String> t = new ArrayList<String>(id);
	String tab = t.get(1);
	Thread.sleep(2000);
	driver.switchTo().window(tab);
	WebElement ele = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
	String text = ele.getText();
	System.out.println(text);
	driver.close();
}
	@Test
	public void Flipkart() throws InterruptedException
	{
		{
			WebDriver driver;
		System.setProperty("webdriver.gecko.driver","./slenium/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.flipkart.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//Button[.='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone14");
		driver.findElement(By.xpath("(//div[@class='nav-right'])[1]")).click();
		driver.findElement(By.xpath("(//span[.='Apple iPhone 14 128GB (Product) RED'])[1]")).click();
		Set<String> id = driver.getWindowHandles();
		ArrayList<String> t = new ArrayList<String>(id);
		String tab = t.get(1);
		Thread.sleep(2000);
		driver.switchTo().window(tab);
		WebElement ele = driver.findElement(By.xpath("//div[@id='dealBadgeSupportContent_feature_div']/following-sibling::div[2]"));
		String text = ele.getText();
		System.out.println(text);
		driver.close();
		}}
}