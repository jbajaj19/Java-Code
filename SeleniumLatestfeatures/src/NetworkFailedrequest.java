import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v102.fetch.model.RequestPattern;
import org.openqa.selenium.devtools.v102.network.model.ErrorReason;
import org.openqa.selenium.devtools.v102.fetch.Fetch;


public class NetworkFailedrequest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
	Optional<List<RequestPattern>>	patterns = Optional.of(Arrays.asList( new RequestPattern(Optional.of("*GetBook*"), Optional.empty(), Optional.empty())));
		devtools.send(Fetch.enable(patterns, Optional.empty()));
        devtools.addListener(Fetch.requestPaused(), request ->
        {
        	devtools.send(Fetch.failRequest(request.getRequestId(),ErrorReason.FAILED));
        });
        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("button[routerlink*=\"library\"]")).click();
		
        }
}
