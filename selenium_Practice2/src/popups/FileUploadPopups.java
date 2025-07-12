package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FileUploadPopups {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		driver.findElement(By.id("fullName")).sendKeys("raju");
		driver.findElement(By.id("emailId")).sendKeys("raju123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("raju@123");
		driver.findElement(By.id("mobile")).sendKeys("8795847331");
		WebElement singles = driver.findElement(By.id("city"));
		Select sel = new Select(singles);
		sel.selectByVisibleText("Mumbai");
		driver.findElement(By.id("resume")).sendKeys("C:\\Users\\afzau\\OneDrive\\Desktop\\Interview Doc\\JavascriptExecutor.txt");
	    	
		

	}

}
