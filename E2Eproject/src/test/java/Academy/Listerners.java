package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.Base;
import resources.ExtentreporterNG;

public class Listerners extends Base implements  ITestListener
{
	ExtentTest test;
	ExtentReports extent = ExtentreporterNG.getreportobject();
	ThreadLocal <ExtentTest> extenttest = new ThreadLocal <ExtentTest>() ;
	public void onTestStart(ITestResult result) 
	{
		 test = extent.createTest(result.getMethod().getMethodName());
		 extenttest.set(test);
		
	}

	public void onTestSuccess(ITestResult result)
	{
		// TODO Auto-generated method stub
	  extenttest.get().log(Status.PASS, "Test is passed");
		
	}

	public void onTestFailure(ITestResult result)
	{
		// TODO Auto-generated method stub
		//screenshot
		
		extenttest.get().fail(result.getThrowable());
		
		WebDriver driver = null;
		
		String testmethodname = result.getMethod().getMethodName();//to get the name of method which test fails
		
		try 
		{
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} 
		catch (Exception e) 
		{
		}	
		try 
		{
			extenttest.get().addScreenCaptureFromPath(getscreenshot(testmethodname, driver), result.getMethod().getMethodName());
			
		}
		catch (Exception e)
        {
			
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}
	

}
