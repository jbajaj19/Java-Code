package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage
{
public WebDriver driver;

By emailid = By.cssSelector("input[id=\"user_email\"]");
By password = By.cssSelector("input[id=\"user_password\"]");
By submit = By.cssSelector("[type='submit']");
By forgotpassword = By.cssSelector("a[class=\"link-below-button\"]");
public Loginpage(WebDriver driver) 

{
	// TODO Auto-generated constructor stub
	
	this.driver = driver;//this.driver points to the local global variaable of the class landing page and driver points to the returned driver object from homeclass
}

public WebElement getemailid()
{
	return driver.findElement(emailid);
}

public WebElement getpassword()
{
	return driver.findElement(password);
}
public WebElement getlogin()
{
	return driver.findElement(submit);
}
public forgotpassword forgotpassword()
{
	driver.findElement(forgotpassword).click();
	return new forgotpassword(driver);
	
}



}
