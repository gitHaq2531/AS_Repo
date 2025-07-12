package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use_Of_css_selector 
{
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	WebElement womenLINK = driver.findElement(By.cssSelector("a[style='border-bottom-color:#fb56c1;']"));
	womenLINK.click();
}
}
