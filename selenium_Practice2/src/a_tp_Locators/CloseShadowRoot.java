package a_tp_Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CloseShadowRoot 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");
	driver.findElement(By.xpath("//h1[text()='Login']")).click();
	Actions act= new Actions(driver);
	act.sendKeys(Keys.TAB).sendKeys("haque").perform();
}
}
