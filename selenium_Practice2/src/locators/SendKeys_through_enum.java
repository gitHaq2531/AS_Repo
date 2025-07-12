package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;

public class SendKeys_through_enum 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	WebElement username=driver.findElement(By.id("username"));
	username.sendKeys(Keys.CONTROL+"a");
	Thread.sleep(2000);
	username.clear();
	Thread.sleep(2000);
	username.sendKeys(Keys.chord("haque"));
}
}
