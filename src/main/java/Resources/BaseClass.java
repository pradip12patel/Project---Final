package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputFilter.Status;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseClass {
	
   public static  WebDriver driver;
   public Properties pro;
	
	
	
	
	public void InilitizeDriver() throws IOException  {
		
		FileInputStream src=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		
	    pro=new Properties();
		pro.load(src);
		
		String key1=pro.getProperty("browser");
		
		if(key1.equalsIgnoreCase("chrome"))  {
			
			 ChromeOptions op=new ChromeOptions();
		     op.addArguments("--remote-allow-origins=*"); 
	    	  
	    	 driver=new ChromeDriver(op); 
			
		}
		else if(key1.equalsIgnoreCase("firefox"))  {
			
			 driver=new FirefoxDriver();
		}
		else  {
			
			System.out.println("check the browser name");
			
		}	
	}
	
	@BeforeSuite
	public void beforesuite()  {
		
		ExentManager.setup();
		
	  }
	
    @BeforeMethod
	public void openurl() throws IOException {
    	
    	InilitizeDriver();
		
		String key2=pro.getProperty("url");
		
		driver.get(key2);
	
	}
	
 /*	@AfterMethod
	public void closebrowser()  {
		
		driver.manage().window().maximize();
	}
	     */
	
	@AfterMethod
	public void teardown(ITestResult result) throws IOException{
		
		driver.manage().window().maximize();
		
		
		
	}

	
	@AfterSuite
	public void aftersuite()   {
		
		ExentManager.endreport();
	}
	
	
	  public static String getScreenshot(WebDriver driver, String screenshotname) throws IOException {
			
			String dateformate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			
			TakesScreenshot ts= (TakesScreenshot) driver;
			
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			String destination = System.getProperty("user.dir") + "/FailTestStatus/" + screenshotname + dateformate + ".png";
			
			File finalDestination = new File(destination);
			 
			FileUtils.copyFile(source, finalDestination);
			   
			return destination;
		}
	  
	  public static String Getcurrenttime()  {
		  
		  String currentdate=new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(new Date());
		return currentdate;
		  
		  
		  
	  }
	
	
}
