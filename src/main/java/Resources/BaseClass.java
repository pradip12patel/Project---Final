package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	protected WebDriver driver;
	Properties pro;
	
	
	public void InilitizeDriver() throws IOException  {
		
		FileInputStream src=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		
	    pro=new Properties();
		pro.load(src);
		
		String key1=pro.getProperty("browser");
		
		if(key1.equalsIgnoreCase("chrome"))  {
			
			 driver=new ChromeDriver();
		}
		else if(key1.equalsIgnoreCase("firefox"))  {
			
			 driver=new FirefoxDriver();
		}
		else  {
			
			System.out.println("check the browser name");
			
		}	
	}
	
    @BeforeMethod
	public void openurl() throws IOException {
    	
    	InilitizeDriver();
		
		String key2=pro.getProperty("url");
		
		driver.get(key2);
	
	}
	
	@AfterMethod
	public void closebrowser()  {
		
		driver.manage().window().maximize();
	}
	
	
}
