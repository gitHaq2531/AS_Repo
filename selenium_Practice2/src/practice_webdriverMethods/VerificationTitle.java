package practice_webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationTitle 
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String pageTitle= driver.getTitle();
	//System.out.println(pageTitle);
	if(pageTitle.equals("Facebook – log in or sign up"))
		System.out.println("passed: page title verified");
	else
		System.out.println("failed");
}
}
