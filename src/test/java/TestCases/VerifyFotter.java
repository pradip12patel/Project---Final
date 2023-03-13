package TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.ObjectPage;
import Resources.BaseClass;
import Resources.CommonMethod;

public class VerifyFotter extends BaseClass{
	
	@Test
	public void Verify() throws InterruptedException  {
		
		ObjectPage obj=new ObjectPage(driver);
		
	/*	 WebElement fotter=obj.clicklink();
		   
		   System.out.println(fotter.findElements(obj.tag).size());
		   
		  for(int i=0;i<fotter.findElements(obj.tag).size();i++)    {
			  Thread.sleep(5000);
			  String ss=Keys.chord(Keys.CONTROL,Keys.ENTER);
			   fotter.findElements(obj.tag).get(i).sendKeys(ss);
		  }   */
		
		CommonMethod.handlelink(obj.clicklink());
		CommonMethod.handlelink(obj.clicklink1());
		CommonMethod.handlelink(obj.clicklink2());
		CommonMethod.handlelink(obj.clicklink3());
	}

}
