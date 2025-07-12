package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelectedOpt 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup/");
	
	WebElement dateDD = driver.findElement(By.id("day"));
	Select selectDate = new Select(dateDD);
	String defaultDate=selectDate.getFirstSelectedOption().getText();
	System.out.println("defaultDate: "+defaultDate);
	selectDate.selectByVisibleText("25");
	WebElement monthDD = driver.findElement(By.id("month"));
	Select selectMonth = new Select(monthDD);
	String defaultMonth= selectMonth.getFirstSelectedOption().getText();
	System.out.println("defaultMonth: "+defaultMonth);
	selectMonth.selectByValue("7");
	WebElement yearDD=driver.findElement(By.id("year"));
	Select selectYear= new Select(yearDD);
	String defaultYear= selectYear.getFirstSelectedOption().getText();
	System.out.println("defaultYear: "+defaultYear);
	selectYear.selectByIndex(2024-1998);
	
}
}
