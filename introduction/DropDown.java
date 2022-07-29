package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 ////a[@value="MAA"]
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		 driver.findElement(By.xpath("//a[@value='BLR']")).click();
		 ////a[@value="BLR"]
		 Thread.sleep(2000);
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
         driver.findElement(By.xpath("//div [@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	
       //div [@id="ctl00_mainContent_ddl_destinationStation1_CTNR"] //a[@value="MAA"]
        
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click(); 
	}

}
