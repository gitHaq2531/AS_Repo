package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloBoard2 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.trello.com/");
	driver.findElement(By.cssSelector("a[data-uuid='MJFtCCgVhXrVl7v9HA7EH_login']")).click();
	wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
	
	driver.findElement(By.id("username")).sendKeys("karthik.qspiders@gmail.com");
	driver.findElement(By.xpath("//span[text()='Continue']")).click();
	driver.findElement(By.id("password")).sendKeys("Qspy@123");
	driver.findElement(By.id("login-submit")).submit();
	WebElement board=driver.findElement(By.cssSelector("div[title='test']"));

	wait.until(ExpectedConditions.visibilityOf(board));
	board.click();
	driver.findElement(By.cssSelector("button[aria-label='Show menu']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Close board')]")).click();
	driver.findElement(By.cssSelector("input[data-testid='close-board-confirm-button']")).click();
	driver.findElement(By.xpath("//button[text()='Permanently delete board']")).click();
	//driver.findElement(By.xpath("//button[text()='Delete']")).click();
}
}