package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.locators.RelativeLocator;

public class FindColor 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeOptions options= new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	Thread.sleep(2000);
	WebElement mobile = driver.findElement(By.xpath("//img[@alt='Mobiles']"));
	String mobileIconColor = mobile.getCssValue("color");
	String mobileIconColorHexValue = Color.fromString(mobileIconColor).asHex();
	System.out.println(mobileIconColor+" and hexaValue == "+mobileIconColorHexValue);
	System.out.println("size of element : "+ mobile.getSize());
	
}
}
