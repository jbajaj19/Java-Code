package stepDefinations;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Landingpage;
import pageobjects.Loginpage;
import pageobjects.portalpage;
import resources.Base;

public class stepDefination extends Base
{
	@Given("Initialize the browser with chrome") 
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = initializedriver(); 
	}

	@Given("Navigate to {string} site")
	public void navigate_to_site(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.get(string);
	}
	
	@Given("Click on Login link in home page to land on Secure sign in page")
	public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() {
	    // Write code here that turns the phrase above into concrete actions
		 Landingpage l = new Landingpage(driver);
		 if(l.getpopupsize().size()>0)
		 {
			 l.getpopup().click();
		 }
		  l.getlogin().click();
	   
	}
	
	
	
	@When("User enters jigyasabajaj93@gmail.com and Khandwa450001 and logs in")
	public void user_enters_jigyasabajaj93_gmail_com_and_khandwa450001_and_logs_in(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		Loginpage  lp = new Loginpage(driver);
		 
		 
		  lp.getemailid().sendKeys(string);
		  lp.getpassword().sendKeys(string2);
		  //System.out.println(text);
		 
		  lp.getlogin().click();
	}

	@When("User enters jigyasabajaj@gmail.com and Khandwa450002 and logs in")
	public void user_enters_jigyasabajaj_gmail_com_and_khandwa450002_and_logs_in(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		Loginpage  lp = new Loginpage(driver);
		 
		 
		  lp.getemailid().sendKeys(string );
		  lp.getpassword().sendKeys(string2);
		  //System.out.println(text);
		 
		  lp.getlogin().click();
	}
	
	@Then("Verify that user is successfully logged in")
	public void verify_that_user_is_successfully_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		portalpage p = new portalpage(driver);
		Assert.assertTrue(p.getsearchbox().isDisplayed());
	   
	}

}