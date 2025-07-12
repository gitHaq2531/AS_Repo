package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class UseOf_getCssValue 
{
public static void main(String[] args) 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement loginButton= driver.findElement(By.name("login"));
	loginButton.sendKeys(Keys.ENTER);
	String loginButtonColor= loginButton.getCssValue("background-color");
	System.out.println(loginButtonColor);
	String loginButtonHex= Color.fromString(loginButtonColor).asHex();
	System.out.println(loginButtonHex);
}
}
