import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RSAtest 
{
	
	@Test
	
	public void Homepagecheck() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("firefox");
		//caps.setPlatform(Platform.WINDOWS);
		caps.setCapability(CapabilityType.BROWSER_NAME, "firefox");	//another was of calling browser	
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.2:4444") , caps);
		driver.get("http://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
	
		driver.close();
		
	}

}
