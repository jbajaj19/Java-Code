package Academy;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.Landingpage;
import pageobjects.Loginpage;
import resources.Base;

public class ValidatetitleNavigationbr extends Base
{
	public WebDriver driver;
	public  static Logger log = LogManager.getLogger(Base.class.getName());
@BeforeTest
 
public void initialize() throws IOException
{
	driver = initializedriver(); 
	 driver.get("https://qaclickacademy.com");
}


  @Test
  public void basepagenavigation() throws IOException
  {
	  
	 //driver.get(prop.getProperty("url"));
	  //there are two ways to access methods of another class
	  //one is inheritance
	  //other is creating object of that class and invoke methods of it
	  
	  Landingpage l = new Landingpage(driver);
	  
	  //compare the navigation bar is present or not
	  
	  Assert.assertTrue(l.getnavigationbar().isDisplayed());
	  log.info("successfully displayed navigationbar");
	 
	  
	  
  }
  
  @AfterTest
  
  public void teardown()
  {
	  driver.close();	  
	  
  }
  
  
}
