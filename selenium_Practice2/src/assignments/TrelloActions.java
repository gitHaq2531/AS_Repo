package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloActions 
{
public static void main(String[] args) throws InterruptedException 
{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
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
		System.out.println(createBtn.isEnabled());
		driver.findElement(By.cssSelector("input[data-testid='create-board-title-input']")).sendKeys("HaqueBoard");
		createBtn.click();
		WebElement addTF=driver.findElement(By.cssSelector("textarea[data-testid='list-name-textarea']"));
		wait.until(ExpectedConditions.visibilityOf(addTF));
		driver.switchTo().activeElement().sendKeys("SQL");
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.switchTo().activeElement().sendKeys("JAVA");
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.switchTo().activeElement().sendKeys("MANUAL");
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement sqlListAdd=driver.findElement(By.xpath("//h2[text()='SQL']/../../..//button[text()='Add a card']"));
		wait.until(ExpectedConditions.visibilityOf(sqlListAdd));
		Thread.sleep(2000);
		sqlListAdd.click();
		driver.switchTo().activeElement().sendKeys("sub-query");
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.switchTo().activeElement().sendKeys("Polymorphism");
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.switchTo().activeElement().sendKeys("smoke Testing");
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.switchTo().activeElement().sendKeys("functional Testing");
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.switchTo().activeElement().sendKeys("Integration");
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.switchTo().activeElement().sendKeys("System");
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.switchTo().activeElement().sendKeys("Inheritence");
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.switchTo().activeElement().sendKeys("Abstraction");
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		
		Actions act = new Actions(driver);
		
		WebElement polyEle=driver.findElement(By.xpath("//a[text()='Polymorphism']"));
		wait.until(ExpectedConditions.visibilityOf(polyEle));	
		WebElement javaListAdd=driver.findElement(By.xpath("//h2[text()='JAVA']/../../..//button[text()='Add a card']"));
		act.dragAndDrop(polyEle, javaListAdd).perform();
		
		WebElement smokeTest=driver.findElement(By.xpath("//a[text()='smoke Testing']"));
		WebElement manualListAdd=driver.findElement(By.xpath("//h2[text()='MANUAL']/../../..//button[text()='Add a card']"));
		act.dragAndDrop(smokeTest, manualListAdd).perform();
		
		WebElement intgrTest=driver.findElement(By.xpath("//a[text()='Integration']"));
		WebElement sysTest=driver.findElement(By.xpath("//a[text()='System']"));
		WebElement inhTest=driver.findElement(By.xpath("//a[text()='Inheritence']"));
		WebElement abstrTest=driver.findElement(By.xpath("//a[text()='Abstraction']"));
		
		act.dragAndDrop(intgrTest, manualListAdd).perform();
		act.dragAndDrop(sysTest, manualListAdd).perform();
		act.dragAndDrop(inhTest, javaListAdd).perform();
		act.dragAndDrop(abstrTest, javaListAdd).perform();
}
}
