package rahulshettyacademy.ExtentReports;



import org.testng.annotations.Test;


public class ExtentReportDemo()
{

   
	public void InitializeDemo()
	{
		
		System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
	}
}
