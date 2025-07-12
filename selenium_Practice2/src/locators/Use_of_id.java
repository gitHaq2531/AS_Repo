package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use_of_id 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement usernameTextfield = driver.findElement(By.id("email"));
	usernameTextfield.click();
	usernameTextfield.sendKeys("afzaul123");
	Thread.sleep(2000);
	WebElement passwordTextfield = driver.findElement(By.id("pass"));
	passwordTextfield.sendKeys("abcd");
}
}
