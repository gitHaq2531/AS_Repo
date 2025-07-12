package x_Path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_partialText 
{
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	WebElement forgotPass = driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
	forgotPass.click();
	driver.manage().window().minimize();
	driver.quit();
}
}
