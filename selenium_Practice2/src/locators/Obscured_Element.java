package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Obscured_Element 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	Thread.sleep(10000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@data-action-type='DISMISS']")).click();
	driver.findElement(By.linkText("Customer Service")).click();
}}
