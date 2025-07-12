package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOf_getRect_instagram 
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	WebElement usernameTF = driver.findElement(By.xpath("//input[@name='username']/../.."));
	System.out.println(usernameTF.getRect().getX());
	System.out.println(usernameTF.getRect().getY());
	System.out.println(usernameTF.getRect().getWidth());
	System.out.println(usernameTF.getRect().getHeight());

	int usernameTFX= usernameTF.getRect().getX();
	int usernameTFwidth = usernameTF.getRect().getWidth();
	int usernameTFrightAllign =usernameTFX+usernameTFwidth;
	System.out.println("==========================");
	WebElement passwordTF = driver.findElement(By.xpath("//input[@name='password']/../.."));
	System.out.println(passwordTF.getRect().getX());
	System.out.println(passwordTF.getRect().getY());
	System.out.println(passwordTF.getRect().getWidth());
	System.out.println(passwordTF.getRect().getHeight());
	System.out.println("========================");
	int passwordTFX = passwordTF.getRect().getX();
	int passwordTFWidth = passwordTF.getRect().getWidth();
	int passwordTFrightAllignment = passwordTFX+passwordTFWidth;
	System.out.println("username text field right allignment : "+usernameTFrightAllign);
	System.out.println("password text field right allignment : "+ passwordTFrightAllignment);
	if(usernameTFrightAllign==passwordTFrightAllignment)
		System.out.println("passed: the right allignment of username text field and password text field is verified and found correct");
	else
		System.out.println("failed: the right allignment of username text field and password text field is verified and found incorrect");


}
}
