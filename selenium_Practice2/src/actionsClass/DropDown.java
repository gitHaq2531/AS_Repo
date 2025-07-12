package actionsClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement dayDD= driver.findElement(By.id("day"));
	Select daySelect = new Select(dayDD);
	List<WebElement> allDay=daySelect.getOptions();

	WebElement monthDD= driver.findElement(By.id("month"));
	Select monthSelect = new Select(monthDD);
	List<WebElement> allMonth=monthSelect.getOptions();
	for(WebElement month: allMonth)
	{
		String timeStamp= LocalDateTime.now().toString().replace(':', '-');
		String monthText= month.getText();
		monthSelect.selectByVisibleText(monthText);
		for(WebElement day: allDay)
		{
			String dayText=day.getText();
			daySelect.selectByVisibleText(dayText);
		}
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tempss=ts.getScreenshotAs(OutputType.FILE);
		File permss=new File("./fbSignUp/"+timeStamp+"pageSS.png");
		FileUtils.copyFile(tempss, permss);
	}
}
}