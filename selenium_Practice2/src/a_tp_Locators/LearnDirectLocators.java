// id,,name,,linkText,,,partialLinkText,,,tagName,,className,,

package a_tp_Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDirectLocators 
{
public static void main(String[] args) 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	WebElement searchTextField = driver.findElement(By.name("q"));
	Actions act= new Actions(driver);
	act.sendKeys(searchTextField, "mobiles").perform();
	act.sendKeys(searchTextField, Keys.ENTER).perform();
	
}
}
