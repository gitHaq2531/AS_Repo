package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOf_isEnabled 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://sandbox.ndhm.gov.in/applications/cowin/Home/cowin_signup_form");
	WebElement submitOpt= driver.findElement(By.xpath("//button[text()='Submit']"));
	if(submitOpt.isEnabled())
	{
		submitOpt.click();
		System.out.println("submit option is enable");
	}
	else
	{
		driver.findElement(By.xpath("//button[text()='Accept Terms of Service']")).click();
		Thread.sleep(2000);
		WebElement checkBox = driver.findElement(By.cssSelector("input[type='checkbox']"));
		WebElement closeB= driver.findElement(By.xpath("//button[text()='Close']"));

		if(checkBox.isSelected())
		{
		closeB.click();
		}
		else
		{
			checkBox.click();
			closeB.click();	
		}
	}
	submitOpt.click();
}
}
