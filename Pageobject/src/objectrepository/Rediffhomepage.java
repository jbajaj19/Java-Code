package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rediffhomepage 

{
  WebDriver driver;
  
  public Rediffhomepage(WebDriver driver)
  {
	  
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
  }
/*  
 By username =  By.cssSelector("input[id=\"login1\"]");

 By  Home =  By.cssSelector("a[class=\"f12\"]"); 
 By searchtext = By.id("srchword");
 By searchbutton = By.cssSelector("[value=\"Search\"]");
 */
  
  
  //using object factory
  @FindBy(css= "a[class=\\\"f12\\\"]")
  WebElement Home;
  
  
  @FindBy(id= "srchword")
  WebElement searchtext;  
  
  @FindBy(css = "[value=\\\"Search\\\"]")
  WebElement searchbutton; 
  
 public WebElement Home()
 {
	 
	return  Home;
 }
 
 public WebElement searchtext()
 {
	 
	return  searchtext;
 }
 
 public WebElement searchbutton()
 {
	 
	return  searchbutton;
 }
}
