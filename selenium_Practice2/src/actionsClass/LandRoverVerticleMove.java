package actionsClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LandRoverVerticleMove 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	Actions act= new Actions(driver);
	driver.get("https://www.google.com/");
	driver.switchTo().activeElement().sendKeys("land rover");
	driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//h3[text()='Land Rover | Explore Luxury SUVs and 4x4 Vehicles']")).click();
	driver.findElement(By.cssSelector("a[aria-label='DEFENDER']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("a[aria-label='EXPLORE VEHICLES']")).click();
	List<WebElement> allCarOpt= driver.findElements(By.xpath("//div[@class='dxnav-vehicle-menu__sidebar']//div[@class='dxnav-vehicle-nav__details']"));
	for(WebElement carOpt: allCarOpt)
	{
		act.moveToElement(carOpt).perform();
		Thread.sleep(1000);
	}
}
}
