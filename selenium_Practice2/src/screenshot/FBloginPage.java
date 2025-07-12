package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBloginPage 
{
public static void main(String[] args) throws IOException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	driver.get("https://www.facebook.com/");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File tempss= ts.getScreenshotAs(OutputType.FILE);
	File permss=new File("./fbSS/"+timeStamp+".png");
	FileUtils.copyFile(tempss, permss);
}
}
