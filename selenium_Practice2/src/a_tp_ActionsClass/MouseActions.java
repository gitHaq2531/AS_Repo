package a_tp_ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	 

	
//	js.executeScript("confirm('what are you doing here?');");
//	Thread.sleep(2000);
//	driver.switchTo().alert().accept();
//	js.executeScript("alert('what are you doing here?');");
//	Thread.sleep(2000);
//	driver.switchTo().alert().accept();
//	js.executeScript("prompt('what are you doing here?');");
//	Thread.sleep(2000);
//	driver.switchTo().alert().accept();
	//WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
//	Actions act=new Actions(driver);
//	WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
//	WebElement element2 = driver.findElement(By.id("nav-search-submit-button"));
//	
//	js.executeScript("document.getElementById('twotabsearchtextbox').value='new phone'");
//	js.executeScript("arguments[0].click();",element2);



	
	
//	WebElement computersOpt= driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Computers')]"));
//	Actions act= new Actions(driver);
//	act.moveToElement(computersOpt).perform();
	
	
}
}
