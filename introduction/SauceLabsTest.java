package introduction;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsTest 
{
	public static final String USERNAME = "oauth-jigyasabajaj93-ae71b";
	public static final String ACCESS_KEY = "4cb2656e-11e5-46b1-b6c1-1400077a3bc0";
	public static final String URL = "https://"+"YOUR_USERNAME"+":"+"ACCESS_KEY"+"@ondemand.saucelabs.com:80/wd/hub";
	public static void main(String[] args) throws MalformedURLException
	{
		// TODO Auto-generated method stub
		
		DesiredCapabilities caps = new  DesiredCapabilities();
		caps.setCapability("Browser", "chrome");
		caps.setCapability("platform", "Windows 7");
		caps.setCapability("version", "95");
		caps.setCapability("build", "<your build id>");
		caps.setCapability("name", "<your test name>");

       WebDriver driver = new RemoteWebDriver(new java.net.URL(URL),caps);
       driver.get("http://google.com");
       driver.getTitle();
	}

}
