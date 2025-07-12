package webdriverMethods;
  
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnNavigateMethods 
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//===USING REFRESH METHOD=====.
		driver.navigate().refresh();
		//===USING TO(STRING URL) METHOD===.
		driver.navigate().to("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
		Thread.sleep(2000);
		//===USING TO(URL url) METHOD===.
		URL mainURL=new URL("https:www.amazon.in/");
		URL dealsPage=new URL(mainURL, "deals?ref_=nav_cs_gb");
		driver.navigate().to(dealsPage);
		Thread.sleep(2000);
		//===USING BACK() METHOD===.
		driver.navigate().back();
		Thread.sleep(2000);
		//===USING FORWARD() METHOD===.
		driver.navigate().forward();
	}
}
