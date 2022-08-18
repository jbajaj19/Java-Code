package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//using page object repository
public class RediffloginpagePF 

{
  WebDriver driver;
  
  public RediffloginpagePF(WebDriver driver)
  {
	  
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
  }
  
/* By username =  By.cssSelector("input[id=\"login1\"]");
 By password = By.cssSelector("input[id=\"password\"]");
 By signin = By.cssSelector("input[name = \"proceed\"]");
 By  Home =  By.cssSelector("a[class=\"f12\"]"); 
 */
  
  @FindBy(css= "input[id=\\\"login1\\\"]")
  WebElement username;
  
  
  @FindBy(css= "input[id=\\\"password\\\"")
  WebElement password;
  
  @FindBy(css= "input[name = \\\"proceed\\\"]")
  WebElement signin;
  
  
  @FindBy(css= "a[class=\\\"f12\\\"]")
  WebElement Home;
  
 public WebElement Emailid()
 {
	 
	return  username;
 }

 public WebElement password()
 {
	 
	return  password;
 }
 
 public WebElement signin()
 {
	 
	return signin;
 }

 public WebElement Home()
 {
	 
	return  Home;
 }
}
