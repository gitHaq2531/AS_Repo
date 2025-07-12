package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingWikipedia 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	//driver.switchTo().activeElement().sendKeys("india");
	//driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,5000)");
	jse.executeScript("window.scrollBy(0,-2000)");
	long scrlHeight=(long)jse.executeScript("return document.body.scrollHeight");
	System.out.println(scrlHeight);
}
}
