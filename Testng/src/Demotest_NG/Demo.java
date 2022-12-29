package Demotest_NG;

import org.testng.annotations.Test;

public class Demo 
{
@Test(dependsOnMethods = "login")
public void compose()
{
	System.err.println("compossed");
}
@Test()
public void login()
{
	System.err.println("logged in");
	}
@Test(dependsOnMethods = "compose")
public void sentItems()
{
	System.err.println("sentitems");
	}
@Test(dependsOnMethods = "sentItems")
public void logout()
{
	System.err.println("logged out");
}
}
