package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EcourtIndia 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement seacrtTf= driver.switchTo().activeElement();
	seacrtTf.sendKeys("ecourt india");
	seacrtTf.sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//a[text()='Case Status']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("img[alt='Case Status']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@role='document']//button[@class='btn-close']")).click();
	WebElement stateDD= driver.findElement(By.id("sess_state_code"));
	Select stateSelect= new Select(stateDD);
	stateSelect.selectByVisibleText("Karnataka");
	Thread.sleep(2000);
	WebElement distDD= driver.findElement(By.id("sess_dist_code"));
	Select distSelect= new Select(distDD);
	distSelect.selectByVisibleText("TUMAKURU");
	Thread.sleep(2000);
	WebElement courtDD= driver.findElement(By.id("court_complex_code"));
	Select courtSelect= new Select(courtDD);
	courtSelect.selectByVisibleText("District Court Complex-Tumakuru");
	WebElement courtEst = driver.findElement(By.cssSelector("select[id='court_est_code']"));
		if(courtEst.isDisplayed())
			{
				System.out.println("yes displayed");
			}
		else
			System.out.println("not displayed");
}
}
