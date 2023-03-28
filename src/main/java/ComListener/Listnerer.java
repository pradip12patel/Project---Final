package ComListener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import Resources.BaseClass;
import Resources.ExentManager;

public class Listnerer extends ExentManager implements ITestListener{
	
	
	public void onTestStart(ITestResult result) {
		
	     test=exent.createTest(result.getName());//result getName
	    
	   }
	public void onTestSuccess(ITestResult result) {
		
	if(result.getStatus() == ITestResult.SUCCESS);
	
	     test.log(Status.PASS, "Test case passed is" + result.getName());
	   }
	
	public void onTestFailure(ITestResult result) {
		
	  if (result.getStatus() == ITestResult.FAILURE) {

	       test.log(Status.FAIL, "Test CASE Failed is " + result.getName()); //To add name in extent report

	       test.log(Status.FAIL, "Test CASE Failed is " + result.getThrowable()); //To throw excpetion

	       String screenshotPath = "";  
	    
	        try {
	          screenshotPath = BaseClass.getScreenshot(BaseClass.driver, result.getName());
	          
	        } 
	        catch (Exception e) {
	        	
	          test.addScreenCaptureFromPath(screenshotPath);
	          
	          e.printStackTrace();
	        }
	    }
	  }
	public void onTestSkipped(ITestResult result) {
		
	if (result.getStatus() == ITestResult.SKIP) {
		
	     test.log(Status.SKIP, "test case skipped is" + result.getName());
	   }
    
     }
  }   
	
	
    
