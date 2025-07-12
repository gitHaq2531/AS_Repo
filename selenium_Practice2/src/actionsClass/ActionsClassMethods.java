package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassMethods 
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Actions act=new Actions(driver);
	WebElement loginLink = driver.findElement(By.xpath("//span[text()='Login']"));
	WebElement searchTextField = driver.findElement(By.name("q"));
	act.click(searchTextField).sendKeys("mobiles").perform();
	act.keyDown(searchTextField, Keys.SHIFT).sendKeys(Keys.chord("MOBILE")).keyUp(Keys.SHIFT).perform();
	//act.scrollToElement(driver.findElement(By.xpath("(//span[text()='Sign in'])[3]"))).perform();
}
}
