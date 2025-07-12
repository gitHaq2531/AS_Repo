package webdriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandles 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getWindowHandle());
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
		System.out.println(driver.getWindowHandle());
		
		driver.switchTo().newWindow(WindowType.WINDOW);		
		driver.get("https://www.amazon.in/deals?ref_=nav_cs_gb");
		
		driver.switchTo().newWindow(WindowType.WINDOW);		
		driver.get("https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.in/b/32702023031?node=32702023031&ld=AZINSOANavDesktop_T3&ref_=nav_cs_sell_T3");
		
		Set<String> allWid  = driver.getWindowHandles();
		System.out.println(allWid);
		
		for(String wid:allWid)
		{
			String widTitle=driver.switchTo().window(wid).getTitle();
			//System.out.println(widTitle);
			if(widTitle.equals("Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in"))
			{
				System.out.println(widTitle);
				driver.switchTo().window(wid);
			}
		}
	 }
}
