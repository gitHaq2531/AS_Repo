package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use_Locators_for_Flipkart 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	WebElement searchBox =driver.findElement(By.cssSelector("input[title='Search for Products, Brands and More']"));
	searchBox.click();
	searchBox.sendKeys("t-shirt for boys");
	WebElement searchIcon =driver.findElement(By.cssSelector("svg[width=\"24\"]"));
	searchIcon.click();
}
}