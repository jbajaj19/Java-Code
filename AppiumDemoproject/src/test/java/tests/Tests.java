package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Tests extends Baseclass 

{
  @Test	
  public void testone()
  {
	  
	  driver.get("https://google.com");
	  driver.findElement(By.name("q")).sendKeys("automation");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  System.out.println("complted test one...");
  }
  
  @Test
  public void testone1()
  {
	// creates a toggle for the given test, adds all log events under it    
      ExtentTest test1 = extent.createTest("TestOne", "Sample test for demo");

      // log(Status, details)
      test1.log(Status.INFO, "Test one started"); 
      
	  driver.get("https://google.com");
	    test1.log(Status.PASS, "Navigate to google.com"); 
	  
	  driver.findElement(By.name("q")).sendKeys("automation");
	  test1.log(Status.PASS, "Enter automation in google search box"); 
	  
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  test1.log(Status.PASS, "Hit the keyboard enter key"); 
	  
	  System.out.println("complted test one...");
	  test1.log(Status.INFO, "Test one completed"); 
  }
  
  @Test
  public void logintest()throws Exception 
  {
	  driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	    driver.findElement(By.xpath("//div[@id='view_container']/div/div/div[2]/div/div/div/form/span/section/div/div/div/div/ul/li/div/div/div/div[2]/div")).click();
	    driver.get("https://accounts.google.com/signin/v2/challenge/pwd?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&navigationDirection=forward&TL=AKqFyY9cZkkfhbv0vPO-6bLj7IioYKrEkDJ1BBt1LmvSvVbtzPqkOuZCt71iYBvZ");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("Khandwa450001");
	    driver.findElement(By.xpath("//div[@id='passwordNext']/div/button/div[3]")).click();
	    driver.get("https://mail.google.com/mail/u/0/");
	    driver.findElement(By.xpath("//img[contains(@src,'https://lh3.googleusercontent.com/ogw/AOh-ky3PsWScWcJhSXoCe-YgG-TpX8FND1yjd7A0Zgu0=s32-c-mo')]")).click();
	    driver.get("https://accounts.google.com/Logout?hl=en&continue=https://mail.google.com&service=mail&timeStmp=1661539845&secTok=.AG5fkS-MQXPjFsIL4YvsGjyEECwt8XUjvg&ec=GAdAFw");
	    driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=1209600&osid=1&continue=https://mail.google.com/mail/u/0/&followup=https://mail.google.com/mail/u/0/&emr=1");
	    driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
  }
}

