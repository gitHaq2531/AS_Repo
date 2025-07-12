package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDateTimeSS 
{
public static void main(String[] args) throws IOException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	driver.get("https://www.amazon.in/");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File perm = new File("./amazon/"+timeStamp+"pageSS.png");
	FileUtils.copyFile(temp, perm);
}
}
