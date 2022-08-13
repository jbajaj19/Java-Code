import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// broken url
		// Step-1 is to get all urls ties up to the links by selenium
		// java methods call the urls and gets you the status code
		// if sstatus code>400 then the url is broken- link tied to the url is broken
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List <WebElement> links = driver.findElements(By.cssSelector("li[class=\"gf-li\"] a"));
		SoftAssert a = new SoftAssert();
		
		for(WebElement link : links)//enhenced for loop
		{
			
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

			conn.getRequestMethod();
			conn.connect();
			int responsecode = conn.getResponseCode();
			System.out.println(responsecode);
		
			if(responsecode>400)
			{
				
				a.assertTrue(responsecode<400,"The link text with"+link.getText()+" is broken with code"+"responsecode");
				
		}

		a.assertAll();
	}

}}
