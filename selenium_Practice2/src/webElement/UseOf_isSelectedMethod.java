package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOf_isSelectedMethod 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("firstname")).sendKeys("AFZAUL");
	driver.findElement(By.name("lastname")).sendKeys("HAQUE");
	driver.findElement(By.name("reg_email__")).sendKeys("1234567891");
	driver.findElement(By.id("password_step_input")).sendKeys("haque123");
	driver.findElement(By.name("birthday_day")).click();
	driver.findElement(By.xpath("//option[text()=25]")).click();
	//Thread.sleep(2000);
	driver.findElement(By.id("month")).click();
	driver.findElement(By.xpath("//option[text()='Jul']")).click();
	driver.findElement(By.name("birthday_year")).click();
	driver.findElement(By.xpath("//option[text()=1998]")).click();
	WebElement maleRB = driver.findElement(By.xpath("//span/input[@value=\"2\"]"));
	//Thread.sleep(2000);
	System.out.println(maleRB.isDisplayed());
	if(maleRB.isSelected())
	{
		System.out.println(" male radio button is selected.");
	}
	else
	{
		System.out.println("male radio button was not selected.");
		maleRB.click();
	}
}
}
