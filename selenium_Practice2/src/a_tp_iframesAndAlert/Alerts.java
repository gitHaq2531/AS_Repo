package a_tp_iframesAndAlert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeOptions options= new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demowebshop.tricentis.com");
	driver.findElement(By.cssSelector("input[type='submit']")).click();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
	driver.switchTo().newWindow(WindowType.TAB).get("https://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.name("submit")).submit();
	Thread.sleep(1000);
	driver.switchTo().alert().dismiss();
	driver.switchTo().newWindow(WindowType.TAB).get("https://www.easemytrip.com/");
	
}
}
