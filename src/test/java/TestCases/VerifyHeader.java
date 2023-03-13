package TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.ObjectPage;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.ConstantMethod;

public class VerifyHeader extends BaseClass{
	
	@Test
	public void verify() throws InterruptedException  {
		
		ObjectPage obj=new ObjectPage(driver);
		
		//String a= obj.verifynb().getText();
		// System.out.println(a);
	  CommonMethod.handleassertion(obj.verifynb().getText(), "123456789", "number is not matching");

	  WebElement ele=obj.clickaccount();
	  JavascriptExecutor ja=(JavascriptExecutor) driver;
	  ja.executeScript("arguments[0].click()",ele);
	
    	obj.clickregister().click();
	    obj.enterfirst().sendKeys(ConstantMethod.firstname);
	    obj.enterlast().sendKeys(ConstantMethod.lastname);
	    obj.enteremail().sendKeys(ConstantMethod.email);
	    obj.entertelp().sendKeys(ConstantMethod.mobile);
	    obj.enterpassword().sendKeys(ConstantMethod.password);
	    obj.enterpasswordagain().sendKeys(ConstantMethod.password1);
	    
	    CommonMethod.handlemultivalue(obj.clickradiobtn(),1);       
	    obj.clickpolicy().click();
	    obj.clickcontinue().click();
	    Thread.sleep(5000);
	    obj.clickcontinue1().click();
	 // obj.clickaccount().clear();
	    
	   WebElement elem=obj.clickwish();
	   JavascriptExecutor js=(JavascriptExecutor) driver;
	   js.executeScript("arguments[0].click()",elem);
	    obj.passemail1().sendKeys(ConstantMethod.email);
	    obj.enterpass().sendKeys(ConstantMethod.password);
	    obj.clicklogin().click();
	    obj.clickcontie().click();
	    
	    WebElement elemnt=obj.clickshooping();
		JavascriptExecutor jsc=(JavascriptExecutor) driver;
		jsc.executeScript("arguments[0].click()",elemnt);
	    obj.Clickcontinue().click();
	    
	    WebElement element=obj.Clickcheckout();
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()",element);
	    
	}

}
