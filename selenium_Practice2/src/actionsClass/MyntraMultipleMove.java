package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraMultipleMove 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.myntra.com");
	WebElement menOpt= driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Men']"));
	Actions act = new Actions(driver);
	act.moveToElement(menOpt, 0, 0).pause(1000).moveToElement(menOpt, 73, 0).pause(1000).perform();
	act.moveToElement(menOpt, 0, 0).pause(1000).moveToElement(menOpt, 146, 0).pause(1000).perform();
	act.moveToElement(menOpt, 0, 0).pause(1000).moveToElement(menOpt, 244, 0).pause(1000).perform();
	act.moveToElement(menOpt, 0, 0).pause(1000).moveToElement(menOpt, 352, 0).pause(1000).perform();
	act.moveToElement(menOpt, 0, 0).pause(1000).moveToElement(menOpt, 439, 0).pause(1000).perform();
}
}
