package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAllDatesMonth 
{
public static void main(String[] args) throws InterruptedException 
{
	int a=0;
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/r.php");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//Thread.sleep(2000);
	WebElement monthDD= driver.findElement(By.id("month"));
	Select selectMonth= new Select(monthDD);
	List<WebElement> allMonth= selectMonth.getOptions();
	WebElement dateDD= driver.findElement(By.id("day"));
	Select selectDate=new Select(dateDD);
	List<WebElement> allDate= selectDate.getOptions();
	int m=0;
	for(WebElement month : allMonth)
	{
		m++;
		String monthText=month.getText();
		selectMonth.selectByVisibleText(monthText);
		int d=0;
		for(WebElement date: allDate)
		{
			String dateText = date.getText();
			d++;
			if(m==2 && d<=28 )
			{
				selectDate.selectByVisibleText(dateText);
			}
			else if(d<=30 && ((m!=2 && m%2==0 && m<8) || (m>=8 && m%2==1)))
			{
				selectDate.selectByVisibleText(dateText);
			}
			else if(d<=31 && ((m%2==1 && m<8) || (m%2==0 && m>=8)))
			{
				selectDate.selectByVisibleText(dateText);
			}
		}
		Thread.sleep(400);
	}
		if(a==31*12) 
		{
			System.out.println("passed: all dates are selectable");
		    System.out.println("total selected: "+a+" which is equals to 12 months multiply 31 days");
		}	
}
}