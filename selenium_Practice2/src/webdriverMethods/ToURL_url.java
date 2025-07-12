package webdriverMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToURL_url 
{
	public static void main(String[] args) throws MalformedURLException, FileNotFoundException 
	{		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		URL mainURL=new URL("https://www.amazon.in/");
		URL dealsPageURL=new URL(mainURL, "deals?");
		driver.navigate().to(dealsPageURL);
		driver.manage().window().fullscreen();
		URL bestSellersPage=new URL(mainURL, "bestsellers/");
		driver.navigate().to(bestSellersPage);
		driver.manage().window().maximize();
		Dimension size=new Dimension(300, 600);
		driver.manage().window().setSize(size);
	}
}
