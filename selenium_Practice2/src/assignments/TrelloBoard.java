package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloBoard {
	public static void main(String[] args) throws InterruptedException {
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

		driver.findElement(By.cssSelector("div[class='board-tile mod-add']")).click();
		Thread.sleep(2000);

		WebElement createBtn = driver.findElement(By.cssSelector("button[data-testid='create-board-submit-button']"));
		Thread.sleep(2000);
		System.out.println(createBtn.isEnabled());
		driver.findElement(By.cssSelector("input[data-testid='create-board-title-input']")).sendKeys("abcd123");
		Thread.sleep(5000);
		System.out.println(createBtn.isEnabled());
		createBtn.click();
	}
}