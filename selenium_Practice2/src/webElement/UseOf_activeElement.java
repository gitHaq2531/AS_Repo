package webElement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOf_activeElement 
{
	public static void main(String[]args) throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.switchTo().activeElement().sendKeys("haque");
	driver.switchTo().activeElement().sendKeys(Keys.TAB);
	driver.switchTo().activeElement().sendKeys("haq123");
	driver.switchTo().activeElement().sendKeys(Keys.TAB);
	Thread.sleep(2000);
	driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
}
}