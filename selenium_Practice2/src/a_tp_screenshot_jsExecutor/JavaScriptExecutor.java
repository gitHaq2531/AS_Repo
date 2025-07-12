package a_tp_screenshot_jsExecutor;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor 
{
public static void main(String[] args) 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com");
	List<WebElement> tabs = driver.findElements(By.cssSelector("div[class='_1ch8e_']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[2].click", tabs);
}
}
