package practice_webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Amazon 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	Thread.sleep(10000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[data-action-type='DISMISS']")).click();
	String pageTitle = driver.getTitle();
	if(pageTitle.equals("Amazon.com. Spend less. Smile more."))
		System.out.println("passed....");
	else 
		System.out.println("failed...");
	WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
	String logoColor= logo.getCssValue("color");
	System.out.println(logoColor);
	String hexColor=Color.fromString(logoColor).asHex();
	System.out.println(hexColor);
	System.out.println(logo.getRect().getX());
}
}
