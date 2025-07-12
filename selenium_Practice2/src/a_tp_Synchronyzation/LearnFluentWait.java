package a_tp_Synchronyzation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class LearnFluentWait 
{
public static void main(String[] args) 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	FluentWait fwait= new FluentWait(driver);
	fwait.pollingEvery(Duration.ofSeconds(1));
	fwait.withTimeout(Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com");
	WebElement  loginButton= driver.findElement(By.xpath("//a[@href='/account/login?ret=/']"));
	fwait.until(ExpectedConditions.visibilityOf(loginButton));
	loginButton.click();
}
}
