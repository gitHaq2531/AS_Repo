package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ecourt2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		
		WebElement seacrtTf= driver.switchTo().activeElement();
		seacrtTf.sendKeys("ecourt india");
		seacrtTf.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='Case Status']")).click();
		
		driver.findElement(By.cssSelector("img[alt='Case Status']")).click();
		//driver.findElement(By.xpath("//div[@class='modal-header text-center align-items-start']/button[@aria-label='Close']")).click();
		WebElement stateDD= driver.findElement(By.id("sess_state_code"));
		Select stateSelect= new Select(stateDD);
		List<WebElement> allState= stateSelect.getOptions();
		for(WebElement state : allState)
		{
			String stateText=state.getText();
			stateSelect.selectByVisibleText(stateText);	
			Thread.sleep(15);
			WebElement distDD= driver.findElement(By.id("sess_dist_code"));
			Select distSelect= new Select(distDD);
			List<WebElement> allDist=distSelect.getOptions();
			for(WebElement dist: allDist)
			{
				String distText = dist.getText();
				distSelect.selectByVisibleText(distText);
				Thread.sleep(15);
				WebElement courtDD= driver.findElement(By.id("court_complex_code"));
				Select courtSelect= new Select(courtDD);
				List<WebElement> allCourt = courtSelect.getOptions();
				for(WebElement court : allCourt)
				{
					Thread.sleep(15);
					String courtText = court.getText();				
					courtSelect.selectByVisibleText(courtText);
					WebElement courtEst = driver.findElement(By.cssSelector("select[id='court_est_code']"));
					if(courtEst.isDisplayed())
					{
						System.out.println("yes displayed for :"+courtText+" dist: "+distText+" state "+stateText);
					}
					else
						System.out.println("not displayed for :"+courtText+" dist: "+distText+" state "+stateText);
					
				}
			}
		}
}
}