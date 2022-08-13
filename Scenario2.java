import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scenario2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");	
	    WebDriver driver = new ChromeDriver();
        driver.get(" https://in.yahoo.com");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String text = driver.findElement(By.cssSelector("h4[class=\"title d-i fz-s fw-xl s-label\"]")).getText();
        Assert.assertEquals(text, "Trending searches");
        //int count = driver.findElements(By.tagName("a")).size();
        //System.out.println(count);
      WebElement trendingsearch =   driver.findElement(By.xpath("(//li[@class='last'])[2]"));
      List <WebElement> links = trendingsearch.findElements(By.tagName("a"));
      System.out.println(links.size());
     // Iterator<WebElement> it = links.iterator();
     
    
     for(int i=0; i<links.size() ; i++)
    
      {
    	 if(!(links.get(i).getText().isEmpty()))
         {
    	 links.get(i).click();
    	 driver.navigate().back(); 
    	 
    	 js.executeScript("window.scrollBy (0,500)");
    	 links = trendingsearch.findElements(By.tagName("a"));
    	 
    	// it.next();
    	 //System.out.println(links.get(i).getText());
    	  
    	  //trendingsearch.findElements(By.tagName("a")).iget(i).click();
    	
         	  
      }
      //driver.findElement(By.cssSelector("a[href*=\"&p=coronavirus\"]")).click();
      //System.out.println(driver.findElement(By.cssSelector("div[id=\"doc\"]")).getText());
      
      }
	}

}
