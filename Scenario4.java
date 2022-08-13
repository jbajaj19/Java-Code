import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario4 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");		// TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.myntra.com/");
         driver.findElement(By.xpath("(//div[@class='desktop-navContent'])[2]")).click();
         driver.findElement(By.linkText("Kurtas & Suits")).click();
	}

}
