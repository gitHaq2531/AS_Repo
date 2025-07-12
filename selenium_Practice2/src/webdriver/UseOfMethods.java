package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfMethods 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	//driver.findElement(By.xpath("//a[contains(@href,\'/mobile\')]")).click();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.flipkart.com");
	Thread.sleep(2000);
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.myntra.com");
	Thread.sleep(2000);
	String myntraTitle = driver.getTitle();
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.facebook.com");
	Thread.sleep(3000);
	Set<String> wid= driver.getWindowHandles();
	for(String id: wid)
	{
		String widTitle=driver.switchTo().window(id).getTitle();
		//String title=driver.getTitle();
		System.out.println(widTitle);
		if(widTitle.equals(myntraTitle))
		{
			driver.switchTo().window(id);
			break;
		}
	}
}
}