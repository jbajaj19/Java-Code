package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage
{
public WebDriver driver;

private By signin = By.cssSelector("a[href*='sign_in']");
private By title = By.cssSelector("div[class=\"text-center\"]");
private By navbar = By.cssSelector("ul[class=\"nav navbar-nav navbar-right\"]");
private By header = By.cssSelector("div[class*=\"video-banner\"] h3");
By popup = By.xpath("//button[text()=\"NO THANKS\"]");


public Landingpage(WebDriver driver) 

{
	// TODO Auto-generated constructor stub
	
	this.driver = driver;//this.driver points to the local global variaable of the class landing page and driver points to the returned driver object from homeclass
}

public WebElement getlogin()
{
	return  driver.findElement(signin);
	
	 
}

public WebElement gettitle()
{
	return driver.findElement(title);
}
public WebElement getnavigationbar()
{
	return driver.findElement(navbar);
}

public List<WebElement> getpopupsize()
{
	return driver.findElements(popup);
}
public WebElement getpopup()
{
	return driver.findElement(popup);
}
public WebElement getheader()
{
	return driver.findElement(header);
}
}
