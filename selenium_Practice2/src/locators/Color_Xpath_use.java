package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Color_Xpath_use 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	WebElement loginButton = driver.findElement(By.name("login"));
	//loginButton.click();
	String loginBcolor = loginButton.getCssValue("background-color");
	System.out.println(loginBcolor);
	String loginBcolorHash = Color.fromString(loginBcolor).asHex();
	System.out.println(loginBcolorHash);
}
}
