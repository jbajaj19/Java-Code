import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newwindow {

	public static void main(String[] args) throws IOException
	
	
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/angularpractice/");
		 //switching to new window or tab
		 driver.switchTo().newWindow(WindowType.WINDOW);//open a new window,
		 //driver.switchTo().newWindow(WindowType.TAB);//open a new tab
		 Set <String> handleids =  driver.getWindowHandles();
		Iterator <String> it = handleids.iterator();
		String parentwindowid = it.next();
		String childwindowid = it.next();
		driver.switchTo().window(childwindowid);
		driver.get("https://rahulshettyacademy.com/");
		String coursename =driver.findElements(By.cssSelector("a[href*=\"https://courses.rahulshettyacademy.com/p\"]")).get(1).getText();
		 driver.switchTo().window(parentwindowid);
		WebElement name = driver.findElement(By.cssSelector("input[name='name']"));
	    name.sendKeys(coursename);
		//driver.quit();
	  //for taking the screeshot of a webelement
	    File file =  name.getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(file, new File("Logo.png"));
	   
	   //get height & width of webelement
	   System.out.println(name.getRect().getDimension().getHeight());
	   System.out.println(name.getRect().getDimension().getWidth());

		 
		 
	}

}
