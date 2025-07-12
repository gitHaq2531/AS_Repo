package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.myntra.com/");
	WebElement menOpt= driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Men']"));
	WebElement womenOpt= driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Women']"));
	WebElement kidOpt= driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Kids']"));
	WebElement homeOpt= driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Home & Living']"));
	WebElement beautyOpt= driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Beauty']"));
	Actions act = new Actions(driver);
	
	act.moveToElement(menOpt).pause(1000).moveToElement(menOpt, 73, 0).pause(1000).moveToElement(womenOpt, 74, 0).pause(1000).perform();
	act.moveToElement(kidOpt, 97, 0).pause(1000).moveToElement(homeOpt, 107, 0).pause(1000).moveToElement(beautyOpt, 87, 0).perform();
}
}
