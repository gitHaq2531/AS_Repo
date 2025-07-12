package x_Path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOf_xpathBy_partialAttrValue 
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement loginButton = driver.findElement(By.xpath("//button[contains(@data-testid,'royal_login')]"));
	loginButton.click();
	driver.manage().window().minimize();
	driver.quit();
}
}
