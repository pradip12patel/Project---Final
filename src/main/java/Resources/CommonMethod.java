package Resources;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import PageObjectModel.ObjectPage;

public class CommonMethod {
	
	// WebDriver driver=null;
	
	
	public static void handleassertion(String actual,String expected,String message)    {
		
		SoftAssert s=new SoftAssert();
		
		String ac=actual;
		String ep=expected;
		
		s.assertEquals(ac, ep, message);
		
		s.assertAll();
		
	}
	
	
	public static void handlemultivalue(List<WebElement> a,int index)      {
		
		List<WebElement> objt=a;
		
      for(int i=0;i<objt.size();i++)   {
			
			objt.get(index).click();
			break;
		   
		}
		
	}
	
	public static void handleselect(WebElement a, int index)     {
		
		Select s=new Select(a);
		s.selectByIndex(index);
	}
	
	public static void handlemouseover(WebElement a,WebDriver d)    {
		
		Actions aa=new Actions(d);
		
		WebElement b=a;
		aa.moveToElement(b).perform();
	}
	
	public static void handlelink(WebElement a) throws InterruptedException  {
		
		ObjectPage obj=new ObjectPage(BaseClass.driver);
		
		 WebElement fotter=a;
		   
		   System.out.println(fotter.findElements(obj.tag).size());
		   
		  for(int i=0;i<fotter.findElements(obj.tag).size();i++)    {
			  Thread.sleep(5000);
			  String ss=Keys.chord(Keys.CONTROL,Keys.ENTER);
			   fotter.findElements(obj.tag).get(i).sendKeys(ss);
		  }
		
	}
	
	
	public static void verifylinkAssertion(WebElement k, String Message, WebDriver d)   {
		
		ObjectPage obj=new ObjectPage(BaseClass.driver);
		
		WebElement li=k;
		
		for(int i=0;i<li.findElements(obj.tag).size();i++)  {
			
			SoftAssert SA=new SoftAssert();
			
			SA.assertEquals(li.findElements(obj.tag).get(i).getText(), d.getCurrentUrl(), Message);
			
			
			
			
			
		}
		
		
	}


	
	
	
	

}
