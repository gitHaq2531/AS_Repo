package projectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/FileUpload1.html");
	WebElement uploadBtn= driver.findElement(By.id("fileToUpload"));
	Thread.sleep(2000);
	uploadBtn.sendKeys("C:\\Users\\afzau\\Downloads\\AFZAUL-HAQUE-FlowCV-Resume-20240527.pdf");
}
}