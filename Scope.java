import java.util.Iterator;
import java.util.List;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//code for limiting the scope of webdriver
public class Scope
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
//give me the count of list on the web page
		System.setProperty("webdriver.chrome.driver", "C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//give the count of lliks in the footer section of the webpage
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
	
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		
		//give the count of lliks in the particular section of the webpage 
	
		WebElement coloumndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		
		//click on each link in the coloumn and check if the page is opening
		
		for(int i=1;i<(coloumndriver.findElements(By.tagName("a")).size());i++)
	      {
			
			String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(5000);
	      }
			Set <String> links = driver.getWindowHandles();
			Iterator <String> it = links.iterator();
	      
			while(it.hasNext())
			{
				
				driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
			}
			
			
		
		
}}



