import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles 
{

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver", "C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector("a[class=\"blinkingText\"]")).click();
        Set<String> windows = driver.getWindowHandles();//this line will return the set of ids of all windows
        Iterator <String> it = windows.iterator();
        String parentid = it.next();
        String chilid =  it.next();
        
        driver.switchTo().window(chilid);
       System.out.println(driver.findElement(By.cssSelector("p[class=\"im-para red\"]")).getText());
       String Emailid = driver.findElement(By.cssSelector("p[class=\"im-para red\"]")).getText().split("at")[1].trim().split(" ")[0];
	driver.switchTo().window(parentid);
       driver.findElement(By.id("username")).sendKeys(Emailid);
       
	}
}
