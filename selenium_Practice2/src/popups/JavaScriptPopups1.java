package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopups1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=1");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[position()=1]")).click();
		driver.findElement(By.id("deleteButton")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("nice");
		alert.accept();
		System.out.println("done");
		
		
		
		

	}

}
