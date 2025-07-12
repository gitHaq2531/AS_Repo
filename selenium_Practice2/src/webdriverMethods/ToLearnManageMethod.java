package webdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManageMethod 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https:/www.amazon.in/");
	driver.manage().window().maximize();
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https:/www.amazon.in/");
	System.out.println(driver.manage().window().getSize());
	Dimension size=new Dimension(400, 600);
	driver.manage().window().setSize(size);
	Thread.sleep(2000);
	Point point=new Point(100, 50);
	driver.manage().window().setPosition(point);
	driver.manage().window().minimize();
	Thread.sleep(2000);
	driver.manage().window().minimize();


}
}
