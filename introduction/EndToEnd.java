package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EndToEnd 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		 driver.findElement(By.xpath("//a[@value='DEL']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div [@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
         driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		 
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		    {
		    	System.out.println("Its enabled");
		    	Assert.assertTrue(true);

		    }
		    else
		    {
		    	
		    	Assert.assertTrue(false);
		    }
			
		 driver.findElement(By.cssSelector("input[id *=\"friendsandfamily\"]")).click();
		 driver.findElement(By.id("divpaxinfo")).click();
		    
		    Thread.sleep(2000);
		 
		 int i=1;
	     while(i<5)
	  
	     {
	    	 driver.findElement(By.id("hrefIncAdt")).click();
	    	 i++;
	     }
	    
	     driver.findElement(By.id("btnclosepaxoption")).click();
	     System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        driver.findElement(By.cssSelector("#ctl00$mainContent$btn_FindFlights")).click();
        
	}
	
	

}
