package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip_getAttribute 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	Thread.sleep(2000);
	WebElement toolTip= driver.findElement(By.xpath("//img[contains(@src,'https://static-assets-web.flixcart.com/batman-returns/batman-returns/p/images/fkh')]"));
	String toolTipTitle = toolTip.getAttribute("title");
	if(toolTipTitle.isEmpty())
		System.out.println("no tooltip");
	else
	System.out.println(" yes tooltip is : "+toolTipTitle);
	
}
}
