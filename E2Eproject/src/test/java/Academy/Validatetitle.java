package Academy;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageobjects.Landingpage;
import pageobjects.Loginpage;
import resources.Base;

public class Validatetitle extends Base

{
	 Landingpage l ;
	
	public WebDriver driver;
	public  static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	 
	public void initialize() throws IOException
	{
		driver = initializedriver(); 
		log.info("driver is initialized");
		
		 driver.get("https://qaclickacademy.com");
		 log.info("navigated to home page");
	}
	
  @Test
  public void basepagenavigation() throws IOException
  {
	  
	  //there are two ways to access methods of another class
	  //one is inheritance
	  //other is creating object of that class and invoke methods of it
	  
      l = new Landingpage(driver);
	  
	  //compare the text from the browser to the actual text
	  Assert.assertEquals( l.gettitle().getText(), "FEATURED123 COURSES");
	  log.info("successfully validated text msg");
	 
	  
	  
  }
  
  @Test
  public void validateHeader() throws IOException
	{
	  Assert.assertEquals( l.getheader().getText(), "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
	}
  
 @AfterTest
  
  public void teardown()
  {
	  driver.close();	  
	  
  }
}
