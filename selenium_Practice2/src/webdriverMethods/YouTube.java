package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().fullscreen();
	Thread.sleep(2000);
	System.out.println(driver.getCurrentUrl());
	driver.navigate().to("https://www.amazon.in/deals?ref_=nav_cs_gb");
	Thread.sleep(2000);
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());

	driver.navigate().to("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
	driver.navigate().refresh();
	Thread.sleep(2000);
	
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	
}
}
