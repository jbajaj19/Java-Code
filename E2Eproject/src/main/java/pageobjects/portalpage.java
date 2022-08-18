package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class portalpage
{
public WebDriver driver;

By searchbox = By.name("query");

public portalpage(WebDriver driver) 

{
	// TODO Auto-generated constructor stub
	
	this.driver = driver;
}

public WebElement getsearchbox()
{
	return driver.findElement(searchbox);
}



}
