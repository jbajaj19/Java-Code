import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Scenario4 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");		// TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.myntra.com/");
         Actions a = new Actions(driver);
         a.moveToElement(driver.findElement(By.xpath("//a[@href=\"/shop/women\"]"))).build().perform();
       a.moveToElement(driver.findElement(By.linkText("Kurtas & Suits"))).click().build().perform(); 
	a.moveToElement(driver.findElement(By.cssSelector("div[class=\"sort-sortBy\"]"))).build().perform();
	a.moveToElement(driver.findElement(By.xpath("//div[@class='horizontal-filters-sortContainer']//li[2]//label[1]"))).click().build().perform();
	driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/main[1]/div[3]/div[1]/section[1]/div[1]/div[2]/ul[1]/li[1]/label[1]/div[1]")).click();
	driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/main[1]/div[3]/div[1]/section[1]/div[1]/div[3]/ul[1]/li[1]/label[1]/div[1]")).click();
	driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/main[1]/div[3]/div[1]/section[1]/div[1]/div[3]/ul[1]/li[2]/label[1]/div[1]")).click();
	driver.findElement(By.xpath("(//label[normalize-space()='50% and above'])[1]")).click();
	driver.findElement(By.xpath("(//img[@title='7Threads Women Magenta & dark purple Yoke Design Kurta'])[1]")).click();
	 Set<String> window =  driver.getWindowHandles();
     Iterator<String> it =  window.iterator();
     String parentid = it.next();
     String childid = it.next();
     driver.switchTo().window(childid);
	driver.findElement(By.cssSelector("button[class=\"size-buttons-size-button size-buttons-size-button-default\"]")).click();
	driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[4]/div[1]/div[1]")).click();
	driver.findElement(By.cssSelector("span[class=\"myntraweb-sprite pdp-whiteRightArrow sprites-whiteRightArrow\"]")).click();
	String text = driver.findElement(By.xpath("//a[contains(text(),'Women Magenta & dark purple Yoke Design Kurta')]")).getText();
	Assert.assertEquals(text, "Women Magenta & dark purple Yoke Design Kurta");
	driver.findElement(By.cssSelector("button[class=\"inlinebuttonV2-base-actionButton bulkActionStrip-desktopBulkWishlist\"]")).click();
	driver.findElement(By.cssSelector("button[class=\"inlinebuttonV2-base-actionButton bulkActionStrip-waterMelon\"]")).click();
	
	/*driver.findElement(By.cssSelector("input[type =\"tel\"]")).click();
	driver.findElement(By.cssSelector("input[type =\"tel\"]")).sendKeys("8104866781");
	driver.findElement(By.className("submitBottomOption")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Password')]")).click();
	driver.findElement(By.cssSelector("input[type=\"password\"]")).click();*/
	}
}
