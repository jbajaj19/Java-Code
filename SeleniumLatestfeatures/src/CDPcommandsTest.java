import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class CDPcommandsTest {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		Map devicemetrics = new HashMap();
		devicemetrics.put("width", 600);
		devicemetrics.put("height", 1000);
		devicemetrics.put("deviceScaleFactor", 50);
		devicemetrics.put("mobile", true);
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", devicemetrics);
		
		 driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		  driver.findElement(By.cssSelector("span[class=\"navbar-toggler-icon\"]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.linkText("Library")).click();
	}

}
