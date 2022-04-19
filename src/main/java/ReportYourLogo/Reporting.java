package ReportYourLogo;


import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting {
	public ExtentReports extentReport;
	public ExtentTest test;
	@Test
	public static void Report_Extend()
	{
		
		
		ExtentSparkReporter htmlreporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/YourLogo/test-output/myreport.html");
		
		htmlreporter.config().setDocumentTitle("Automation report");
		htmlreporter.config().setReportName("Funcational report");
		  htmlreporter.config().setTheme(Theme.STANDARD);
		ExtentReports extentReport=new ExtentReports();
		extentReport.attachReporter(htmlreporter);
		
		ExtentTest test=extentReport.createTest("Woment_Tab");
		
		if(5==5)
		{
			System.out.println("This test is passed");
		}
		
		
	 extentReport.flush();
	}

}
