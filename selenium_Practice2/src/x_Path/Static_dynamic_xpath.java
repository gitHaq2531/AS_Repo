package x_Path;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_dynamic_xpath 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	WebElement searchTF = driver.findElement(By.name("q"));
	searchTF.sendKeys("mobiles");
	searchTF.sendKeys(Keys.ENTER);
	 WebElement mobile = driver.findElement(By.xpath("//div[contains(text(),'OPPO Reno 12 5G (Sunset Peach, 256 GB)')]/../..//div[@class='Nx9bqj _4b5DiR']"));
	 System.out.println(mobile.getText());
}
}
