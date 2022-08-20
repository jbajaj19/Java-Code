package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.Rediffhomepage;
import objectrepository.Rediffloginpage;


//Login page class implemented in normal page object pattern style

//Home page class implemented in page object factory style
public class Loginapplication

{
@Test

public void login()
{
System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");	
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	Rediffloginpage rb = new Rediffloginpage(driver);
	rb.Emailid().sendKeys("hello");
	rb.password().sendKeys("jigyasa19");
	rb.signin().click();
	
	
	Rediffhomepage rh = new Rediffhomepage(driver);
	rh.Home().click();
	rh.searchtext().sendKeys("rediff");
	rh.searchbutton().click();
}
}
