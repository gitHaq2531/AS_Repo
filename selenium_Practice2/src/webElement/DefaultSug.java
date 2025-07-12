package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefaultSug 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.switchTo().activeElement().click();
	List<WebElement> allEle = driver.findElements(By.xpath("//div[@role='presentation']/ul/li"));
	Thread.sleep(2000);
	for(WebElement ele : allEle)
	{
		String sugEle = ele.getText();
		System.out.println(sugEle);
		if(sugEle.contains("air hostess gold"))
		{
			ele.click();
		}
	}
}
}
