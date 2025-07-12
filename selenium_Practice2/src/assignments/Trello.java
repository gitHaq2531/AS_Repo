package assignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trello 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.trello.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

	driver.findElement(By.cssSelector("a[data-uuid='MJFtCCgVhXrVl7v9HA7EH_login']")).click();
	wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
	
	driver.findElement(By.id("username")).sendKeys("karthik.qspiders@gmail.com");
	driver.findElement(By.xpath("//span[text()='Continue']")).click();
	driver.findElement(By.id("password")).sendKeys("Qspy@123");
	driver.findElement(By.id("login-submit")).submit();
	
	wait.until(ExpectedConditions.titleIs("Boards | Trello"));
	
	driver.findElement(By.xpath("//div[@data-testid='header-member-menu-avatar']")).click();
	driver.findElement(By.xpath("//span[text()='Log out']")).click();
	
	wait.until(ExpectedConditions.titleIs("Log out of your Atlassian account - Log in with Atlassian account"));
	driver.findElement(By.xpath("//span[text()='Log out']")).click();
}
}