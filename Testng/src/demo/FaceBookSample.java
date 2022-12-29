package demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FaceBookSample extends GenricFaceBook
{
@Test
public void test()
{
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("bharathbijili93@aol.com");
	driver.findElement(By.id("pass")).sendKeys("7899064255");
	driver.findElement(By.name("login")).click();
}
}
