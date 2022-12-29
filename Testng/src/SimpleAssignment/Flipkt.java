package SimpleAssignment;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

public class Flipkt extends Gen
{
@Test
public void max() throws InterruptedException, AWTException
{
	driver.get("https://www.amazon.com");
	Thread.sleep(2000);
	Dimension dimension = new Dimension(400,500);
	driver.manage().window().setSize(dimension);
	Point pt = new Point(300,400);
	driver.manage().window().setPosition(pt);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_SPACE);
	r.keyRelease(KeyEvent.VK_ALT);
	r.keyRelease(KeyEvent.VK_SPACE);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_N);
	r.keyRelease(KeyEvent.VK_N);
}

}
