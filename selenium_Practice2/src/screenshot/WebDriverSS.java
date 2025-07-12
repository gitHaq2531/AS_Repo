package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSS 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement searchTF= driver.findElement(By.id("twotabsearchtextbox"));
		searchTF.sendKeys("oneplus ce2 lite 5g");
		searchTF.sendKeys(Keys.ENTER);
		WebElement oneplusMobile = driver.findElement(By.cssSelector("img[alt='Oneplus Nord CE 3 5G (Grey Shimmer, 8GB RAM, 128GB Storage)']"));
		oneplusMobile.click();
		File temp= oneplusMobile.getScreenshotAs(OutputType.FILE);
		File perm = new File("./defAMz/mobile.png");
		FileUtils.copyFile(temp, perm);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		
//		TakesScreenshot ts= (TakesScreenshot)driver;
//		File tempSS=ts.getScreenshotAs(OutputType.FILE);
//		File permSS = new File("./defectSS/searchTF.png");
//		FileUtils.copyFile(tempSS, permSS);	
	}
}
