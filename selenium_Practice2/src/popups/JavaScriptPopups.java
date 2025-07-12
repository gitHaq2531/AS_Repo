package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptPopups 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
	driver.findElement(By.id("alertexamples")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	driver.findElement(By.id("confirmexample")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().dismiss();
	Thread.sleep(1000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	driver.findElement(By.id("promptexample")).click();
	Thread.sleep(2000);
	//System.out.println(driver.switchTo().alert().getText());
	Actions act= new Actions(driver);
}
}
