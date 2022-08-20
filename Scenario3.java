import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scenario3 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");	
	    WebDriver driver = new ChromeDriver();
	  
        driver.get(" https://in.yahoo.com");
      
        String text = driver.findElement(By.cssSelector("h4[class=\"title d-i fz-s fw-xl s-label\"]")).getText();
      // String text = driver.findElement(By.xpath("//h4[@class=\"title d-i fz-s fw-xl s-label\"]")).getText();
     //  String text = driver.findElement((By.xpath("/html[1]/body[1]/div[2]/div[1]/ol[2]/li[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/h4[1]"))).getText(); 
       Assert.assertEquals(text, "Trending searches");
        
      WebElement trendingsearch =   driver.findElement(By.xpath("(//li[@class='last'])[2]"));
    // WebElement trendingsearch =   driver.findElement(By.xpath("//ol[@class='reg searchBottom']//li[@class='last']"));
    //  WebElement trendingsearch =   driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ol[2]/li[1]"));
      List <WebElement> links = trendingsearch.findElements(By.tagName("a"));
      
      //Get the count of link under trendingsearch
      System.out.println("Total no. of links under Trending search are "+ links.size());
      
      // print all the links from webpage 
      String[] linklist = new String[links.size()];
      System.out.println("List of links Available: ");  
      for(int i=0;i<links.size();i++)
      {
      linklist[i] = links.get(i).getText();
      System.out.println(links.get(i).getText());
      } 
      
      // navigate to each Link on the webpage
      for(int i=0;i<links.size();i++)
      {
    	  trendingsearch =   driver.findElement(By.xpath("(//li[@class='last'])[2]"));
    	  links = trendingsearch.findElements(By.tagName("a"));
    	  linklist[i]= links.get(i).getAttribute("href");
          driver.navigate().to(linklist[i]);
          driver.navigate().back();
      }
      
      driver.findElement(By.cssSelector("a[href*=\"&p=coronavirus\"]")).click();
     // driver.findElement(By.linkText("COVID-19 Updates")).click();
    //driver.findElement(By.className("thmb")).click();
    //  driver.findElement(By.xpath("//a[@aria-label='COVID-19 Updates']")).click();
      driver.findElement(By.cssSelector("span[title=\"Coronavirus Highlights: India Reports 15,754 New Covid Cases, 39 Deaths In 24 Hours\"]")).click();
      //driver.findElement(By.xpath("//span[@title=\"Coronavirus Highlights: India Reports 15,754 New Covid Cases, 39 Deaths In 24 Hours\"]")).click();
    // driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ol[1]/li[2]/div[1]/ul[1]/li[1]/a[1]/div[2]/h4[1]/span[1]")).click();
      Set<String> window =  driver.getWindowHandles();
      Iterator<String> it =  window.iterator();
      String parentid = it.next();
      String childid = it.next();
      driver.switchTo().window(childid);
      System.out.println("All content of cases overview is  " + driver.findElement(By.id("ins_storybody")).getText());
      driver.switchTo().window(parentid);
      driver.quit();	

	}

}
