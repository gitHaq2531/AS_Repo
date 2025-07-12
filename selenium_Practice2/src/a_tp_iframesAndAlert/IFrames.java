package a_tp_iframesAndAlert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames 
{
public static void main(String[] args) 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("C:\\SeleniumFiles\\Iframes.html");
//frame by index
	driver.switchTo().frame(0);
	driver.findElement(By.id("small-searchterms")).sendKeys("hello");
//immediate parent frame
	driver.switchTo().parentFrame();
//frame by name
	driver.switchTo().frame("frame2");
	driver.findElement(By.name("username")).sendKeys("afzaul");
	driver.switchTo().parentFrame();
//frame by webElement
	driver.switchTo().frame(driver.findElement(By.id("FR1")));
	driver.findElement(By.id("small-searchterms")).sendKeys("byby");

//to switch  our driver control to super frame
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[text()='google']"));
}
}
