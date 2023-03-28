package TestCases;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.ObjectPage;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.ConstantMethod;

public class VerifyFotter extends BaseClass{
	
	@Test
	public void VerifyFottets() throws InterruptedException  {
		
		Logger log = org.apache.logging.log4j.LogManager.getLogger(VerifyFotter.class);
		
		ObjectPage obj=new ObjectPage(driver);
		
	/*	 WebElement fotter=obj.clicklink();
		   
		   System.out.println(fotter.findElements(obj.tag).size());
		   
		  for(int i=0;i<fotter.findElements(obj.tag).size();i++)    {
			  Thread.sleep(5000);
			  String ss=Keys.chord(Keys.CONTROL,Keys.ENTER);
			   fotter.findElements(obj.tag).get(i).sendKeys(ss);
		  }   */
		
		CommonMethod.handlelink(obj.clicklink());
		CommonMethod.verifylinkAssertion((obj.clicklink()),ConstantMethod.assertlink, driver);
		log.info("Pass assert");
		
		CommonMethod.handlelink(obj.clicklink1());
		CommonMethod.verifylinkAssertion((obj.clicklink1()),ConstantMethod.assertlink1, driver);
		log.info("Pass assert1");
		
		CommonMethod.handlelink(obj.clicklink2());
		CommonMethod.verifylinkAssertion((obj.clicklink2()),ConstantMethod.assertlink2, driver);
		log.info("Pass assert2");
		
		CommonMethod.handlelink(obj.clicklink3());
		CommonMethod.verifylinkAssertion((obj.clicklink3()),ConstantMethod.assertlink3, driver);
		log.info("Pass assert3");
	}

}
