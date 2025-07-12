package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect 
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement usernameTF = driver.findElement(By.id("email"));
	System.out.println(usernameTF.getRect().getX());
	System.out.println(usernameTF.getRect().getY());
	System.out.println(usernameTF.getRect().getHeight());
	System.out.println(usernameTF.getRect().getWidth());


	System.out.println("====================================");
	int usernameTFX = usernameTF.getRect().getX();
	System.out.println(usernameTFX);
	int usernameTFwidth = usernameTF.getRect().getWidth();
	System.out.println(usernameTFwidth);
	int usernameTextFieldRightAllignment = usernameTFX+usernameTFwidth;
	
	WebElement passwordTF = driver.findElement(By.id("passContainer"));
	System.out.println("=========================");
	System.out.println(passwordTF.getRect().getX());
	System.out.println(passwordTF.getRect().getY());
	System.out.println(passwordTF.getRect().getHeight());
	System.out.println(passwordTF.getRect().getWidth());

	int passwordTextFieldXaxis = passwordTF.getRect().getX();
	System.out.println(passwordTextFieldXaxis);
	int passwordTextFieldWidth = passwordTF.getRect().getWidth();
	System.out.println(passwordTextFieldWidth);
	int passwordTextFieldRightAllignment = passwordTextFieldXaxis+passwordTextFieldWidth;
	
	if(usernameTextFieldRightAllignment==passwordTextFieldRightAllignment)
		System.out.println("passed: the right allignment of username text field and password text field is verified and found correct");
	else
		System.out.println("failed: the right allignment of username text field and password text field is verified and found incorrect");

}
}
