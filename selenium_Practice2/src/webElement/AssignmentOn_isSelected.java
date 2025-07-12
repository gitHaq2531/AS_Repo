package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOn_isSelected 
{
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://services.ecourts.gov.in/ecourtindia_v6/?p=casestatus/index&app_token=be7ae9536445312fde9c54631d01e013c09cefdf5a99d5a41a5456e3732684d2");
	driver.findElement(By.xpath("//div[@id='validateError']//button[@type='button']")).click();
	WebElement pendingCB = driver.findElement(By.id("radP"));
	if(pendingCB.isSelected())
	{
		System.out.println("pending check box is enabled.");
	}
	else
	{
		System.out.println("not enabled");
	}
	WebElement disposedCB = driver.findElement(By.id("validateError"));
	if(disposedCB.isSelected())
	{
		System.out.println("disposed check box is enabled.");
	}
	else
	{
		System.out.println("disposed check box not enabled");
	}
	WebElement bothCB = driver.findElement(By.id("radB"));
	if(bothCB.isSelected())
	{
		System.out.println("both check box is enabled.");
	}
	else
	{
		System.out.println("both check box not enabled");
	}
}
}