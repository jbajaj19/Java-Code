package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.Landingpage;
import pageobjects.Loginpage;
import pageobjects.forgotpassword;
import resources.Base;

public class Homepage extends Base

{
	public WebDriver driver;
	public  static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	 
	public void initialize() throws IOException
	{
		driver = initializedriver(); 
		
	}
	
  @Test(dataProvider= "getdata")
  public void basepagenavigation(String emailid, String password,String text) throws IOException
  {
	 
	  //there are two ways to access methods of another class
	  //one is inheritance
	  //other is creating object of that class and invoke methods of it
	  
	 
	  driver.get("https://qaclickacademy.com");
	  Landingpage l = new Landingpage(driver);
	  l.getlogin().click();
	  Loginpage  lp= new Loginpage(driver);
	 
	 
	  lp.getemailid().sendKeys(emailid);
	  lp.getpassword().sendKeys(password);
	  //System.out.println(text);
	  log.info(text);
	  lp.getlogin().click();
	  forgotpassword fp =lp.forgotpassword();
	  fp.getemailid();
	  fp.sendmeinstructions().click();
	  
  }
  
  @DataProvider
  
  public Object[][] getdata()
  {
	  
	  //rows stands for how many different typpes of data should run
	  //column stands for how many values per test
	  
	  Object[][] data = new Object[2][3];
	  //0th row
	 data[0][0] = "nonrestricteduser@qa.com";
	  data[0][1] = "12345";
	  data[0][2] = "Non Restricted user"	;
	
	  //1st row
	  
	  data[1][0] = "restricteduser@qa.com";
	  data[1][1] = "123456";
	  data[1][2] = "Restricted user"	;
	  return data;
	  	  
  }
  
 @AfterTest
  
  public void teardown()
  {
	  driver.close();	  
	  
  }
}
