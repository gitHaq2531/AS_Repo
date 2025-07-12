package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_dropDown 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup/");
	Thread.sleep(2000);
	driver.findElement(By.name("birthday_day")).click();
	driver.findElement(By.xpath("//option[text()='29']")).click();
	driver.findElement(By.name("birthday_month")).click();
	driver.findElement(By.xpath("//option[text()='May']")).click();
	driver.findElement(By.name("birthday_year")).click();
	driver.findElement(By.xpath("//option[text()='2010']")).click();
	
}
}
