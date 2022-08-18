package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class forgotpassword
{
public WebDriver driver;

By emailid = By.cssSelector("input[id=\"user_email\"]");
By sendmeinstructions = By.cssSelector("input[type=\"submit\"]");

public forgotpassword(WebDriver driver) 

{
	// TODO Auto-generated constructor stub
	
	this.driver = driver;//this.driver points to the local global variaable of the class landing page and driver points to the returned driver object from homeclass
}

public WebElement getemailid()
{
	return driver.findElement(emailid);
}

public WebElement sendmeinstructions()
{
	return driver.findElement(sendmeinstructions);
}


}
