import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v101.network.Network;
import org.openqa.selenium.devtools.v101.network.model.ConnectionType;

public class Networkspeed {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		devtools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devtools.send(Network.emulateNetworkConditions(false, 3000, 20000, 10000, Optional.of(ConnectionType.ETHERNET)));
		devtools.addListener(Network.loadingFailed(), loadingFailed->
		{
			System.out.println( loadingFailed.getErrorText());
			
			System.out.println( loadingFailed.getTimestamp());
		});
		long starttime = System.currentTimeMillis();
		 driver .get("http://google.com");
		  driver.findElement(By.name("q")).sendKeys("Netflix",Keys.ENTER);
		  driver.findElements(By.cssSelector(".LC20lb")).get(0).click();
		  Thread.sleep(3000);
		  String title = driver.findElement(By.cssSelector("h1[data-uia='hero-title']")).getText();
		  System.out.println(title);
		//driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		//driver.findElement(By.cssSelector("button[routerlink*=\"library\"]")).click();
		long endtime = System.currentTimeMillis();
		System.out.println(endtime-starttime);
		driver.close();
		
		
	}

}
