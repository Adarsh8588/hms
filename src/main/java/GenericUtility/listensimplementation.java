package GenericUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.protobuf.Method;


public class listensimplementation implements ITestListener {

	public void onTestStart(ITestResult result) {
String	Methodname=result.getMethod().getMethodName();
Reporter.log(Methodname+"test script execution started");
		
	}

	public void onTestSuccess(ITestResult result) {
		String	Methodname=result.getMethod().getMethodName();
		Reporter.log(Methodname+"test script execution started");

	}

	public void onTestFailure(ITestResult result) {
		String	Methodname=result.getMethod().getMethodName();
		Reporter.log(Methodname+"test script execution started");
 EventFiringWebDriver driver = new EventFiringWebDriver(BaseClass.sdriver);
      File src=driver.getScreenshotAs(OutputType.FILE);
      File dstFile=new File(Methodname+".png");
      try {
		FileUtils.copyFile(src, src);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  
	}

	public void onTestSkipped(ITestResult result) {
		String	Methodname=result.getMethod().getMethodName();
		
	}



}
