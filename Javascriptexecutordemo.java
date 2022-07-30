import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class Javascriptexecutordemo {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//to scroll down on the page	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(3000);
	//to sroll down inside a table
	js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
	
	List<WebElement>values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
	int sum=0;
	for(int i=0;i<values.size();i++)
	{
		
		System.out.println(Integer.parseInt(values.get(i).getText()));
		sum=sum+Integer.parseInt(values.get(i).getText());
	}
	System.out.println(sum);
	
	int total= Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
	
	Assertion a = new Assertion();
	a.assertEquals(total,sum);
	}

}
