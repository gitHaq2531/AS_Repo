package webElement_AllMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Amazon_explore 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@data-action-type='DISMISS']")).click();
	//driver.findElement(By.cssSelector("input[data-action-type='DISMISS']")).click();
	WebElement logo = driver.findElement(By.cssSelector("a[id='nav-logo-sprites']"));
	String logoColor= logo.getCssValue("color");
	System.out.println(logoColor);
	String hexLogoColor =Color.fromString(logoColor).asHex();
	System.out.println(hexLogoColor);
	WebElement searchDropDown= driver.findElement(By.id("searchDropdownBox"));
	String tootTip = searchDropDown.getAttribute("title");
	System.out.println("TOOLTIP IS : "+tootTip);
	WebElement searchTF = driver.findElement(By.id("twotabsearchtextbox"));
	String searchTFvalue = searchTF.getAttribute("value");
	if(searchTFvalue.isEmpty())
	{
	System.out.println("yes searchTF is empty");
	searchTF.sendKeys(Keys.chord("sparx shoe"));
	searchTF.sendKeys(Keys.ENTER);
	}
	else
	{
		searchTF.clear();
		searchTF.sendKeys("sparx shoe");
		searchTF.sendKeys(Keys.ENTER);
	}
}
}
