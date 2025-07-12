package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alt_getAttribute 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	Thread.sleep(2000);
	WebElement groceryAlt= driver.findElement(By.xpath("//img[contains(@src,'https://static-assets-web.flixcart.com/batman-returns/batman-returns/p/images/header_c')]"));
	String groceryAltValue= groceryAlt.getAttribute("alt");
	System.out.println("groceryAltValue is "+ groceryAltValue);
}
}
