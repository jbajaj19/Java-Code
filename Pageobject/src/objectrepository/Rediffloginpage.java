package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rediffloginpage 

{
  WebDriver driver;
  
  public Rediffloginpage(WebDriver driver)
  {
	  
	  this.driver = driver;
  }
  
 By username =  By.cssSelector("input[id=\"login1\"]");
 By password = By.cssSelector("input[id=\"password\"]");
 By signin = By.cssSelector("input[name = \"proceed\"]");
 By  Home =  By.cssSelector("a[class=\"f12\"]"); 
 public WebElement Emailid()
 {
	 
	return  driver.findElement(username);
 }

 public WebElement password()
 {
	 
	return  driver.findElement(password);
 }
 
 public WebElement signin()
 {
	 
	return  driver.findElement(signin);
 }

 public WebElement Home()
 {
	 
	return  driver.findElement(Home);
 }
}
