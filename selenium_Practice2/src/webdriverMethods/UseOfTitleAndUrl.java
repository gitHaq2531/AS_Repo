package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfTitleAndUrl {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	String instaLoginPageTitle = driver.getTitle();
	System.out.println("INSTAGRAM LOGIN PAGE TITLE IS ===> "+ instaLoginPageTitle);
	String instaLoginPageUrl = driver.getCurrentUrl();
	System.out.println("INSTAGRAM LOGIN PAGE URL IS ==> "+instaLoginPageUrl);
	
}
}
