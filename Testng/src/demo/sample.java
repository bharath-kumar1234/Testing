package demo;

import org.testng.annotations.Test;

public class sample extends genric{

	@Test
	public void test1() {
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test2() {
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void test3() {
		driver.get("https://www.flipkart.com/");
	}
}
