package projectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActOn_3_LayerOpt 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		driver.get("https://www.flipkart.com/");
		List<WebElement> allOpts= driver.findElements(By.xpath("//div[@class='_2GaeWJ']/img"));
		
		Actions act= new Actions(driver);
		
		System.out.println(allOpts.size());
		for(WebElement opt: allOpts)
		{
			act.moveToElement(opt).build().perform();
			wait.until(ExpectedConditions.visibilityOf(opt));
			List<WebElement> allSubOpts= driver.findElements(By.xpath("//div[@class='_16rZTH']/object/a"));
			for(WebElement subOpt: allSubOpts)
			{
				act.moveToElement(subOpt).build().perform();
				wait.until(ExpectedConditions.visibilityOf(subOpt));
				List<WebElement> allSbOpt= driver.findElements(By.xpath("//div[@class='_31z7R_']/object/a"));
				for(WebElement sbOpt: allSbOpt)
				{
					wait.until(ExpectedConditions.visibilityOf(sbOpt));
					act.moveToElement(sbOpt).build().perform();
					Thread.sleep(15);
				}
				Thread.sleep(1000);
			}	
		}	
	}
}
