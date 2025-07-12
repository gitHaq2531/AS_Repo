package a_tp_Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShadowRoot2 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//button[text()='Quick Start']")).click();
	driver.findElement(By.xpath("//section[text()='Shadow Root Elements']")).click();
	driver.findElement(By.xpath("//section[text()='Shadow Root']")).click();
	Thread.sleep(2000);
	SearchContext shadowHost = driver.findElement(By.xpath("(//form/div)[1]")).getShadowRoot();
	WebElement usernameTextField = shadowHost.findElement(By.cssSelector("input[placeholder='Enter your username']"));
	usernameTextField.sendKeys("afzaul");
}
}
