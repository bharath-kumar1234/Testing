package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Redbus 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "./slenium/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.redbus.in/");
	driver.findElement(By.xpath("//input[@tabindex='1']")).sendKeys("Bengalore");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys("Shivamogga");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[.='Date']")).click();
	driver.findElement(By.xpath("//td[.='17']")).click();
Thread.sleep(1000);
	driver.findElement(By.xpath("//button[.='Search Buses']")).click();
	}}
