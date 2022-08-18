import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v102.emulation.Emulation;

public class MobileEmulatorTest 
{
public static void main (String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");	
	
	ChromeDriver driver = new ChromeDriver();
	DevTools devtools = driver.getDevTools();
	devtools.createSession();
	//send commands to  CDP methods -> CDP metthod will invoke and get access to chrome dev tools
	devtools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, Optional.empty(),Optional.empty(), Optional.empty(),Optional.empty(), Optional.empty(),  Optional.empty(),  Optional.empty(),  Optional.empty(),  Optional.empty()));

  driver.get("https://rahulshettyacademy.com/angularAppdemo/");
  driver.findElement(By.cssSelector("span[class=\"navbar-toggler-icon\"]")).click();
  Thread.sleep(3000);
  driver.findElement(By.linkText("Library")).click();

}
}
