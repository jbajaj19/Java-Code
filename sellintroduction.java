import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class sellintroduction {

	public static void main(String[] args) {
		

	//Invoking Browser
	//Chrome - ChromeDriver ->Methods close get
    //Firefox- FirefoxDriver ->Methods close get
	//Safari - SafariDriver ->Methods  close get
	//	WebDriver close get 
	//  WebDriver methods + class methods
		
	//  chromedriver.exe-> Chrome browser 	
	//System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");	
	//webdriver.chrome.driver->value of path	
	//WebDriver driver = new ChromeDriver();
	
	//Firefox Launch
	//geckodriver
	
	//System.setProperty("webdriver.gecko.driver","C:/Users/LENOVO/Downloads/geckodriver-v0.31.0-win64/geckodriver.exe");
	//WebDriver driver = new FirefoxDriver();
	
	
	//Microsoft edge launch
	//edgedriver
	
	System.setProperty("webdriver.edge.driver","C:/Users/LENOVO/Downloads/edgedriver_win64/msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	
	
	
	driver.get("https://rahulshettyacademy.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.close();
	//driver.quit();
	}

}
