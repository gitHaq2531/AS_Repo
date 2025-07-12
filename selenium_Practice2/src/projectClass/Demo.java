package projectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
public static void main(String[] args) 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement loginBtn= driver.findElement(By.cssSelector("button[data-testid='royal_login_button']"));
	System.out.println(loginBtn.isDisplayed());
	if(loginBtn.isDisplayed()==true)
	{
		System.out.println("Passed: login button is displayed");
	}
	String loginBnText=loginBtn.getText();
	System.out.println(loginBnText);
	if(loginBnText.equals("Log in"))
	{
		System.out.println("Passed: tag text is correct");
	}
}
}
