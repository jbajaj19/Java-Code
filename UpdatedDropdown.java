import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException 
	
	
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		 Assert.assertFalse(driver.findElement(By.cssSelector("input[id *=\"SeniorCitizenDiscount\"]")).isSelected());

		 driver.findElement(By.cssSelector("input[id *=\"SeniorCitizenDiscount\"]")).click();
		// driver.findElement(By.cssSelector("input[id *=\"SeniorCitizenDiscount\"]")).isSelected();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id *=\"SeniorCitizenDiscount\"]")).isSelected());
		 
		 //count the number of checkboxes
		 System.out.println(driver.findElements(By.cssSelector("input[type=\"checkbox\"]")).size());
		 
		 
		 
		 
		driver.findElement(By.id("divpaxinfo")).click();
	    
	    Thread.sleep(2000);
	    System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); 
	    int i=1;
	     while(i<5)
	  
	     {
	    	 driver.findElement(By.id("hrefIncAdt")).click();
	    	 i++;
	     }
	    
	     driver.findElement(By.id("btnclosepaxoption")).click();
	     System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		    
	     
	     System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();	    
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));	
    if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
    {
    	System.out.println("Its enabled");
    	Assert.assertTrue(true);

    }
    else
    {
    	
    	Assert.assertTrue(false);
    }
	
	
	
	}

}
