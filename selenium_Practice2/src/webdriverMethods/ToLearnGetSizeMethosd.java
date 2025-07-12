package webdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSizeMethosd 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.amazon.in/");
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
	
	Dimension size=new Dimension(500, 600);
	driver.manage().window().setSize(size);
	Thread.sleep(2000);
	
	Point point=new Point(200, 300);
	driver.manage().window().setPosition(point);
	
	int widHeight=driver.manage().window().getSize().getHeight();
	System.out.println("height of window ==>> "+widHeight);
	
	int widWidth=driver.manage().window().getSize().getWidth();
	System.out.println("width of window ==>> "+widWidth);
	
	int widXPosition=driver.manage().window().getPosition().getX();
	System.out.println("x position ==>"+widXPosition);
	
	int widYPosition=driver.manage().window().getPosition().getY();
	System.out.println("y position ==>"+widYPosition);
	Thread.sleep(2000);
	
	
	
	
	
}
}
