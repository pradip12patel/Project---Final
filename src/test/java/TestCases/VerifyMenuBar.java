package TestCases;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjectModel.ObjectPage;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.ConstantMethod;

public class VerifyMenuBar extends BaseClass{
	
	@Test
	public void Menubar() throws InterruptedException, AWTException, IOException  {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		
		ObjectPage obj=new ObjectPage(driver);
		
		//Desktop
  		Actions a=new Actions(driver);
		
		WebElement b=obj.clickdesktop();
		a.moveToElement(b).perform();           
		CommonMethod.handlemouseover(obj.clickdesktop(),driver);
		obj.clickshowall().click();
		Thread.sleep(5000);     
	/*    WebElement c=obj.clickshorts();
		Select s=new Select(c);
		s.selectByIndex(1);  */
		CommonMethod.handleselect(obj.clickshorts(), 1);
	
	/*	WebElement cc=obj.clickview();
		Select ss=new Select(cc);
		ss.selectByIndex(3);   */
		CommonMethod.handleselect(obj.clickview(), 3);
		
		String aa=obj.grabprice().getText();
		System.out.println(aa);
		String aaa[]=aa.split(" ");
		System.out.println(aaa[0]);
		String bb=aaa[0].replaceFirst("[^a-zA-Z]","");
		System.out.println(bb);
		
		obj.clickaddcarts().click();
		
		CommonMethod.handlemultivalue(obj.pickradio(), 2);
		CommonMethod.handlemultivalue(obj.pickcheckbox(), 1);
		
	/*	WebElement v=obj.selectones();
		Select sss=new Select(v);
		sss.selectByIndex(3);   */
  		CommonMethod.handleselect(obj.selectones(), 3);
		
		obj.textarea().sendKeys(ConstantMethod.text);
		obj.pickdate().clear();
		obj.pickdate().sendKeys(ConstantMethod.date);
		obj.pickdate1().clear();
		obj.pickdate1().sendKeys(ConstantMethod.date1);
		
		obj.clickfile().click();
		
	/*	Robot rb=new Robot();
		rb.delay(5000);
		//put the path of file in a clipboard
		StringSelection ss=new StringSelection("C:\\Users\\LENOVO\\OneDrive\\Pictures\\Screenshots\\Test.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		//ctrl+V
		rb.keyPress(KeyEvent.VK_CONTROL);   //press on ctrl key
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(5000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);
		//Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.delay(2500);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(5000);     */
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\AutoIt3\\fileupload.exe");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		obj.clickaddcart2().click(); 
	
		obj.clickcartsum().click();
		
		String az=obj.verifytotal().getText();
		System.out.println(az);
		String aaz=az.replaceFirst("[^a-zA-Z]","");
		System.out.println(aaz);   
		obj.clickcancel().click();
		
		//Tablet
		 obj.clicktablet().click();
		 String n=obj.handleprice().getText();
		 System.out.println(n);
		 String m[]=n.split(" ");
		 System.out.println(m[0]);
		 String bw=m[0].replaceFirst("[^a-zA-Z]", "");
		 String total=bw.replace("Ex", "");
		 double dd=Double.parseDouble(total);
    	 System.out.println(dd);
		 obj.clickaddtocart().click();
		 Thread.sleep(5000);
		 obj.clickcartadd().click();
		 String bt=obj.verifytotals().getText();
		 System.out.println(bt);
		 String total1=bt.replaceFirst("[^a-zA-Z]", "");
		 double dd1=Double.parseDouble(total1);
		 System.out.println(dd1);
		 
		 if(dd==dd1)    {
			 
			 System.out.println("Total Is Matching");
		 }
		 else {
			 System.out.println("Total Is Not Matching");
		 }     
	}
	
	

}
