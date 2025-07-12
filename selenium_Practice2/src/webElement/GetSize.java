package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize 
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
    WebElement searchTF = driver.findElement(By.name("q"));
    System.out.println("height is : "+searchTF.getSize().getHeight());
    System.out.println("width is : "+searchTF.getSize().getWidth());

	Dimension searchTFsize=searchTF.getSize();
	System.out.println("===============================");
	System.out.println("size of element : "+searchTFsize);
	Point searchTFlocation = searchTF.getLocation();
	System.out.println("X axis : "+searchTF.getLocation().getX());
	System.out.println("Y axis : "+searchTF.getLocation().getY());

	System.out.println("location of element : "+ searchTFlocation);
	
}
}
