package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementSS 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement searchTF= driver.findElement(By.id("twotabsearchtextbox"));
		File tempSS=searchTF.getScreenshotAs(OutputType.FILE);
		File permSS = new File("./bugsSS/searchTF.png");
		FileUtils.copyFile(tempSS, permSS);
		
	}
}
