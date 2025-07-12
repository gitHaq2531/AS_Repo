package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PromptPopup 
{
public static void main(String[] args) throws InterruptedException {
	System.out.println("handling prompt poput");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=1");
	driver.findElement(By.cssSelector("input[type='checkbox']")).click();
	driver.findElement(By.id("deleteButton")).click();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
}
}
