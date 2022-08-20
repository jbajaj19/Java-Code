package rahulshettyacademy.ExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentreportDemo 

{
	ExtentReports extent;
	@BeforeTest
	
	public void config()
	{
		// to create extend reports we need 2 classes 
		//ExtentReports and ExtentSparkReporter
		
		String path= System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Jigyasa bajaj");
	}
	@Test
	public void InitialDemo()
	{
		
		ExtentTest test = extent.createTest("Initial demo");
	System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");	
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com");
	System.out.println(driver.getTitle());
	//test.fail("result not match");
	extent.flush();
    }
}
