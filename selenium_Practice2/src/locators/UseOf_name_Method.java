package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOf_name_Method 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement firtNamePage = driver.findElement(By.name("firstname"));
	firtNamePage.sendKeys("Afzaul");
	WebElement surNamePage = driver.findElement(By.name("lastname"));
	surNamePage.sendKeys("haque");
	WebElement moNo = driver.findElement(By.name("reg_email__"));
	moNo.sendKeys("6206861440");
	WebElement passWord=driver.findElement(By.name("reg_passwd__"));
	passWord.sendKeys("haque1234");
}
}
