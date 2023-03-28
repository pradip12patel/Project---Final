package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExentManager {
	
	public static ExtentReports exent;   //Responsible for entires
	public static ExtentTest test;       //Responsible for test status pass or fail
	public static ExtentSparkReporter htmlreporter;    //Responsible for look and Feel
	
	
     public static void setup()  {
		
		htmlreporter =new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/ExtentReport/" +"Myreport_"+BaseClass.Getcurrenttime()+".html");
		htmlreporter.config().setDocumentTitle("Automation Report");
		htmlreporter.config().setReportName("functional Report");
		htmlreporter.config().setTheme(Theme.DARK);
		
		exent = new ExtentReports();
		exent.createTest("e commarce", "my second report");
		exent.attachReporter(htmlreporter);
		exent.setSystemInfo("host name", "Localhost");
		exent.setSystemInfo("os", "Window10");
		exent.setSystemInfo("testername", "test");
		
	  }
     
     
     public static void endreport()   {
 		
 		exent.flush();
 	}

}
