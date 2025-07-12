package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetMethod {
public static void main(String[] args)
{
	//OOAD--object oriented analysis design.
	// CONSTRUCTOR OVERLOADING
	WebDriver driver= new ChromeDriver();
	
	// TRIGGER THE MAIN URL
	driver.get("https://www.amazon.in/");
	String title=driver.getTitle();
	String currentUrl=driver.getCurrentUrl();
	System.out.println(title);
	System.out.println(currentUrl);
	
	
}
}
