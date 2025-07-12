package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PromptPP 
{
public static void main(String[] args) 
{
	System.out.println("handling prompt poput");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	WebElement dd = driver.findElement(By.name("birthday_day"));
	Select sel=new Select(dd);
	System.out.println(sel.hashCode());
}
}
