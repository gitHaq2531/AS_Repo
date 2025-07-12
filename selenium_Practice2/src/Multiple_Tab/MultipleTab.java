package Multiple_Tab;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.myntra.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demowebshop.tricentis.com/login");
		
		Set<String> allwindowId = driver.getWindowHandles();
		for (String handle : allwindowId) {
			driver.switchTo().window(handle);
			String currentUrl = driver.getCurrentUrl();
			if(currentUrl.contains("myntra")) {
				System.out.println("Title of 2nd tab"+driver.getTitle());
				break;
			}
			System.out.println(driver.getTitle());
			
		}
		

	}

}
