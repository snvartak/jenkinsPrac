package util;

import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReportListener {

	
	public static ExtentReports report;
	public 	static ExtentTest test;
	
	
	public static void startTest()
	{
		report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResult.html");
		test = report.startTest("JenMaven");
	}
}
