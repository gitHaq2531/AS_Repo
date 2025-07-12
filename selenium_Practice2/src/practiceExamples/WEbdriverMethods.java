package practiceExamples;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class WEbdriverMethods 
{
public static void main(String[] args) throws InterruptedException, MalformedURLException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.switchTo().newWindow(WindowType.WINDOW);
	URL mainUrl=new URL("https://www.amazon.in/");
	URL bestSellerPage=new URL(mainUrl, "gp/bestsellers/?ref_=nav_cs_bestsellers");
	driver.navigate().to(bestSellerPage);
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.navigate().to("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.navigate().to("https://www.amazon.in/deals?ref_=nav_cs_gb");
	Set<String> allWid= driver.getWindowHandles();
	System.out.println(allWid);
	for(String wid: allWid)
	{
		String widTitle= driver.switchTo().window(wid).getTitle();
		System.out.println(widTitle);
	}
}
}