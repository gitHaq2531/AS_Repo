package a_tp_Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpath 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//fluent wait
	FluentWait fwait= new FluentWait(driver);
	fwait.pollingEvery(Duration.ofSeconds(1));
	fwait.withTimeout(Duration.ofSeconds(10));
	
	driver.get("https://www.flipkart.com/");
	WebElement searchTextField=driver.findElement(By.name("q"));
	searchTextField.sendKeys("mobiles");
	Actions actions= new Actions(driver);
	actions.sendKeys(searchTextField, Keys.ENTER).perform();
	
	WebElement menOpt=driver.findElement(By.xpath("//span[text()='Men']"));
	Actions act= new Actions(driver);
	act.moveToElement(menOpt).build().perform();
//using toLeftOf and toRightOf methds
	Thread.sleep(1000);
	WebElement womenOpt=driver.findElement(RelativeLocator.with(By.xpath("//span[@class='TSD49J']")).toRightOf(menOpt));
	act.moveToElement(womenOpt).perform();

	WebElement tvApplianceOpt= driver.findElement(RelativeLocator.with(By.tagName("span")).toLeftOf(womenOpt));
	Thread.sleep(1000);

	act.moveToElement(tvApplianceOpt).perform();
	Thread.sleep(1000);
	WebElement clothingOpt= driver.findElement(RelativeLocator.with(By.tagName("a")).below(menOpt));
	act.moveToElement(clothingOpt).click().perform();
}
}