package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Baseclass extends Extendreportdemo
{
	static AppiumDriver<MobileElement> driver;
    @BeforeTest
	public void setup() 
	{
    	try 
    	{
		DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setCapability("platformName", "ANDROID");// all these three lines means same
		caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
		//caps.setCapability(MobileCapabilityType.PLATFORM, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"LLD-AL10");
		caps.setCapability(MobileCapabilityType.UDID,"P8B4C18317000807"	);
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"60");
		//caps.setCapability(MobileCapabilityType.APP,"");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME,"CHROME");
		
		
			URL url = new URL("http://127.0.0.1:5555/wd/hub");
			driver = new AppiumDriver<MobileElement>(url,caps);
			
			//driver = new AndroidDriver<MobileElement>(url,caps);
		//driver = new IOSDriver<MobileElement>(url,caps);
		} 
    	catch (MalformedURLException e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		
		}
	}
	
    @Test
    public void sampletest()
    {
    	System.out.println("I am inside sampletest");
    }
    @AfterTest
	public void teardown() 
	{
		driver.close();
		driver.quit();
		
	}
}


