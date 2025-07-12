package a_tp_WebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindRowValue 
{
public static void main(String[] args) 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("file:///C:/SeleniumFiles/webTable.html");

	WebElement addOf3rd= driver.findElement(By.xpath("//tbody[2]/tr[3]/td[3]"));
	System.out.println("address of 3rd row in 1st table is : "+ addOf3rd.getText());
	  List<WebElement> lastEle = driver.findElements(By.xpath("//table[1]/tbody/tr[last()]/td[last()]"));
	  for(WebElement ele: lastEle) {
	 System.out.println("last element is : "+ele.getText());
}
	System.out.println("=================table1 all data====================");
	 List<WebElement> table1AllEle = driver.findElements(By.xpath("//table[1]//tr[*]"));
	 for(WebElement element: table1AllEle)
	 {
		 System.out.println(element.getText());
	 }
	 System.out.println("=================table2  data====================");
	 List<WebElement> table2AllEle = driver.findElements(By.xpath("//table[2]//tr[position()>1 and position()<5]"));
	 for(WebElement element: table2AllEle)
	 {
		 System.out.println(element.getText());
	 }
}
}
