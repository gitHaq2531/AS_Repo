package fileRead;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class FileFromJava 
{
public static WebDriver driver;
public static void main(String[] args) throws IOException
{
	//access the file by giving path.
	FileInputStream file= new FileInputStream("./src/test/resource/fbCommonData.properties");
	//creating object of Properties class.
	Properties pobj = new Properties();
	//load the data
	pobj.load(file);
	//read the data====getProperties()
	String browserName = pobj.getProperty("browser");
	System.out.println(browserName);
}
}
