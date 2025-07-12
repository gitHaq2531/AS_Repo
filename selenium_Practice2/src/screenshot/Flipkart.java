package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.cssSelector("div[class='H6-NpN _3N4_BX']"));
	TakesScreenshot flipkartHP = (TakesScreenshot)driver;
	File temps= flipkartHP.getScreenshotAs(OutputType.FILE);
	File perms=new File("./flipSS/flipkartLB.png");
	FileUtils.copyFile(temps, perms);
}
}
