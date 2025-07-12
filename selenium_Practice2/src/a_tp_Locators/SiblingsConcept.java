package a_tp_Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SiblingsConcept 
{
public static void main(String[] args) 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	WebElement electronicsPage= driver.findElement(By.xpath("//div[@aria-label='Electronics']"));

//preceding-sibling=======previous element
	WebElement fashionPage=driver.findElement(By.xpath("//div[@aria-label='Electronics']/preceding-sibling::div"));
//following-sibling======next element
	WebElement homesPage= driver.findElement(By.xpath("//div[@aria-label='Electronics']/following-sibling::div"));

	Actions act= new Actions(driver);
	act.moveToElement(electronicsPage).pause(Duration.ofSeconds(1)).moveToElement(fashionPage).pause(Duration.ofSeconds(1)).moveToElement(homesPage).perform();
	
}
}