package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Base
{

public WebDriver driver;
public Properties prop;

	public WebDriver initializedriver() throws IOException {

		 prop = new Properties();
		 //system.getproperty("user.dir"), to get the path till the system of any machine
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\\\src\\\\main\\\\java\\\\resources\\\\data.properties");
				
		prop.load(fis);// to load the property file
		//mvn test -Dbrowser=chrome, is a maven command used  to run a test in desired browser
		//String browsername = System.getProperty("browser");
		String browsername = prop.getProperty("browser");
		//System.out.println(browsername);

		if (browsername.contains("chrome")) // to compare value from property file with object,equals method is used
		{
            //execute chrome browser	
			
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			
				if(browsername.contains("headless"))
				{
			options.addArguments("headless");//to run chrome in headles mode
			}
			driver = new ChromeDriver(options);
		} 
		else if (browsername.equals("firefox") )
		{
			// execute firefox browser
			// System.setProperty("webdriver.gecko.driver","C:/Users/LENOVO/Downloads/geckodriver-v0.31.0-win64/geckodriver.exe");
			// WebDriver driver = new FirefoxDriver();
		}

		else if (browsername.equals("edge"))
		{
			// execute edge browser

			// System.setProperty("webdriver.edge.driver","C:/Users/LENOVO/Downloads/edgedriver_win64/msedgedriver.exe");
			// WebDriver driver = new EdgeDriver();

		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public String getscreenshot(String testcasename, WebDriver  driver) throws IOException
	{		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationfile = System.getProperty("user.dir")+"\\reports\\"+testcasename+ ".png";
		FileUtils.copyFile(source,new File(destinationfile));
		return destinationfile;
	}
}
