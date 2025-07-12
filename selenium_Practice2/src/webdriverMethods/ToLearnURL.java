package webdriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnURL 
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		URL mainUrl=new URL("https://www.amazon.in/");
		URL spacePage=new URL(mainUrl, "deals?ref_=nav_cs_gb");
		driver.navigate().to(spacePage);
		Thread.sleep(2000);
		URL groupPage=new URL(mainUrl, "mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
		driver.navigate().to(groupPage);
		Thread.sleep(2000);
		
	}
}
