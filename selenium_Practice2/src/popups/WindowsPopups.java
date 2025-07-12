package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPopups{

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		String parentw = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='view more']")).click();
		
		Set<String> allwindow = driver.getWindowHandles();
		allwindow.remove(parentw);
		for (String child : allwindow) {
			driver.switchTo().window(child);
			driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
			
		}
		driver.quit();
		

	}

}
