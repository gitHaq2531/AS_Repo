package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOf_getTagName_getText 
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement forgotPwd= driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/recover/initiate/?')]"));
	String forgotPwdTagText=forgotPwd.getText();
	System.out.println("tag text of forgot password link is : "+forgotPwdTagText);
	WebElement loginButton= driver.findElement(By.name("login"));
	String loginButtonTagName = loginButton.getText();
	System.out.println("login button is made up with tag : "+loginButtonTagName);
}
}
