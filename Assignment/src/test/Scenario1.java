package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Scenario1 
{
	@Test
  public void Scenrio1()
 {
	 System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");	
     WebDriver driver = (WebDriver) new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http://qatechhub.com");
     System.out.println(driver.getTitle());
     System.out.println(driver.getCurrentUrl());
     driver.navigate().to("https://www.facebook.com");
     driver.navigate().back();
     System.out.println(driver.getCurrentUrl());
     driver.navigate().forward();
     driver.navigate().refresh();
    driver.close();
}}
