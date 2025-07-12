package assignments;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_selectBY_methods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup/");
		WebElement dateDD= driver.findElement(By.id("day"));
		Select dateSelect=new Select(dateDD);
		List<WebElement> allDateOpt=  dateSelect.getOptions();
		for(WebElement allopt:allDateOpt) 
		{
			String opt= allopt.getText();
			System.out.println(opt);
			if(opt.equals("25"))
				dateSelect.selectByVisibleText(opt);
		}
		//dateSelect.selectByIndex(24);
		Thread.sleep(2000);
		WebElement monthDD= driver.findElement(By.id("month"));
		Select monthSelect = new Select(monthDD);
		monthSelect.selectByValue("7");
		WebElement yearDD=driver.findElement(By.id("year"));
		Select yearSelect = new Select(yearDD);
		yearSelect.selectByVisibleText("1998");
}
}