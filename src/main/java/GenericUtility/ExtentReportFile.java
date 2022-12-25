package GenericUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportFile implements ExtentReporter {
	// execution will start here
	ExtentReports report;
public void onstart(ITestContext context) {
	ExtentSparkReporter htmlReport=new ExtentSparkReporter(".\\ExtentReports\\Report.html");
	htmlReport.config().setDocumentTitle("SDET-41 hms report");
	htmlReport.config().setTheme(Theme.DARK);
	htmlReport.config().setReportName("selenium execution report");
//	htmlReport.config().setReportName("selenium execution report");
	
	report=new ExtentReports();
	report.attachReporter(htmlReport);
	report.setSystemInfo("Base-Browser", "chrome");
	report.setSystemInfo("OS", "windows");
	report.setSystemInfo("reporter Name", "Adarsh");
}

public void OnFinish(ITestContext context) {
	report.flush();
}
public class ListenerImplementationClass implements ITestListener{
	ExtentReports reports;
	ExtentTest test;
}
 
public void OnTestStart(ITestResult result) {
	String methodName=result.getMethod().getMethodName();
	ExtentTest test=report.createTest(methodName);
	Reporter.log("TestScript Execution Started");
}
}
