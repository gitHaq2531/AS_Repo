package assignments;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleScreenshot 
{
public MultipleScreenshot(WebElement allImg) {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) throws IOException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	List<WebElement> allImg= driver.findElements(By.xpath("//div[@class='_2GaeWJ']/img"));
	for(WebElement ele: allImg)
	{
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		String title=ele.getText();
		File tempss=  ele.getScreenshotAs(OutputType.FILE);
		File permss= new File("./img2SS/"+timeStamp+"scrnshot.png");
		FileUtils.copyFile(tempss, permss);
	}
	for(int i=1;i<=allImg.size();i++)
	{
		WebElement ele=allImg.get(i);
		String timeStamp=LocalDateTime.now().toString().replace(':', '-');
		String title= ele.getText();
		File tempss=ele.getScreenshotAs(OutputType.FILE);
		File permss= new File("./FKimgSS/"+timeStamp+"ss.png");
		FileUtils.copyFile(tempss, permss);
	}
}
}
