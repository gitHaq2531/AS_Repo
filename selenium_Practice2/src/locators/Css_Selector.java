package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in"); 
	WebElement searchTF = driver.findElement(By.cssSelector("input[name='field-keywords']"));
	searchTF.sendKeys("mobile");
	Thread.sleep(2000);
	searchTF.sendKeys(Keys.ENTER);
	driver.manage().window().minimize();
	driver.quit();
	
	
}
} 
