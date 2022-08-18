import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v102.emulation.Emulation;

public class SetGeoLocation {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		//for madrid,spain latitude is 40 n longitude is 3
	  Map<String,Object> coordinates = new HashMap<String,Object>();
	  
	  coordinates.put("latitude", 40);
	  coordinates.put("longitude", 3);
	  coordinates.put("accuracy", 1);
	  
	  driver.executeCdpCommand("Emulation.setGeolocationOverride" , coordinates);
	  driver .get("http://google.com");
	  driver.findElement(By.name("q")).sendKeys("Netflix",Keys.ENTER);
	  driver.findElements(By.cssSelector(".LC20lb")).get(0);
	  Thread.sleep(3000);
	  String title = driver.findElement(By.cssSelector("h1[data-uia='hero-title']")).getText();
	  System.out.println(title);
	  }

}
