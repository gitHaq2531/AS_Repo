package a_tp_screenshot_jsExecutor;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
public static void main(String[] args) throws IOException 
{
	WebDriver driver= new ChromeDriver();
	String timeStamp= LocalDateTime.now().toString().replace(':', '-');
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File tempSS= ts.getScreenshotAs(OutputType.FILE);
	File permSS= new File("./screenshots/"+timeStamp+"flipkart.png");
	FileUtils.copyFile(tempSS, permSS);
	WebElement searchTF= driver.findElement(By.cssSelector("div[aria-label='Beauty, Toys & More']"));
	File elementTempSS= searchTF.getScreenshotAs(OutputType.FILE);
	File elementPermSS= new File("./screenshots/"+timeStamp+"beautyProducts.png");
	FileHandler.copy(elementTempSS, elementPermSS);
	
}
}
