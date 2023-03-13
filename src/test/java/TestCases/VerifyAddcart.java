package TestCases;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModel.ObjectPage;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.ConstantMethod;

public class VerifyAddcart extends BaseClass {

	@Test
	public void verifytoall() throws InterruptedException {

		ObjectPage obj = new ObjectPage(driver);

		obj.verifysearch().sendKeys(ConstantMethod.name);

		obj.clickon().click();
		String sum=obj.clickprice().getText();
		System.out.println(sum);
		String a[]=sum.split(" ");
		System.out.println(a[0]);
		String b=a[0].replaceFirst("[^a-zA-Z]","");
		System.out.println(b);
		String addition=b.replace("Ex","");
		double d=Double.parseDouble(addition);
        System.out.println(d);
		obj.clickaddcart().click();

		obj.verifysearch().clear();

		obj.verifysearch().sendKeys(ConstantMethod.name1);
		obj.clickon().click();
		String sum1 = obj.clickprice1().getText();
		String aa[] = sum1.split(" ");
		System.out.println(aa[0]);
		String bb=aa[0].replaceFirst("[^a-zA-Z]","");
		System.out.println(bb);
		String cc=bb.replace("Ex", "");
		double dd = Double.parseDouble(cc);
		System.out.println(dd);
		obj.clickaddcart1().click();

		Thread.sleep(5000);
		obj.clickcrtadd().click();
		String addcart = obj.verifysum().getText();
        System.out.println(addcart);
		String afterremove = addcart.replaceFirst("[^a-zA-Z]","");
		Double addition1 = Double.parseDouble(afterremove);
		System.out.println(addition1);

		if(d+dd == addition1) {
			System.out.println("Match The Total");
		}	
		 else {
			System.out.println("Not Tatch The Total");
		}   

	}

}