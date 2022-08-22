package test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario2 
 {
   @Test
   public void Scenario()
   {
	System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");	
    WebDriver driver = (WebDriver) new ChromeDriver();
    driver.get(" https://in.yahoo.com");
    String text = driver.findElement(By.cssSelector("h4[class=\"title d-i fz-s fw-xl s-label\"]")).getText();
    Assert.assertEquals(text, "Trending searches");
    
  WebElement trendingsearch =   driver.findElement(By.xpath("(//li[@class='last'])[2]"));
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
      //driver.navigate().refresh();
      //Thread.sleep(3000);
  }
  
  driver.findElement(By.cssSelector("a[href*=\"&p=coronavirus\"]")).click();
  driver.findElement(By.cssSelector("span[title=\"Coronavirus Highlights: India Reports 15,754 New Covid Cases, 39 Deaths In 24 Hours\"]")).click();
  Set<String> window =  driver.getWindowHandles();
  Iterator<String> it =  window.iterator();
  String parentid = it.next();
  String childid = it.next();
  driver.switchTo().window(childid);
  System.out.println("All content of cases overview is  " + driver.findElement(By.id("ins_storybody")).getText());
  driver.switchTo().window(parentid);
  driver.quit();
}}
