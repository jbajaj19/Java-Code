import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Scenario5 {

	public static void main(String[] args)
	{
		//System.setProperty("webdriver.gecko.driver","C:/Users/LENOVO/Downloads/geckodriver-v0.31.0-win64/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.edge.driver","C:/Users/LENOVO/Downloads/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");		// TODO Auto-generated method stub
        //WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
         WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
         driver.get("https://www.myntra.com/");
         Actions a = new Actions(driver);
         a.moveToElement(driver.findElement(By.xpath("//a[@href=\"/shop/women\"]"))).build().perform();
         //driver.findElement(By.xpath("(//div[@class='desktop-navContent'])[2]")).click();
       a.moveToElement(driver.findElement(By.linkText("Kurtas & Suits"))).click().build().perform();
       w.until(ExpectedConditions.alertIsPresent());
       driver.switchTo().alert().accept();
	a.moveToElement(driver.findElement(By.cssSelector("div[class=\"sort-sortBy\"]"))).build().perform();
	a.moveToElement(driver.findElement(By.cssSelector("//ul[@class=\"sort-list\"][2]"))).click().build().perform();
	driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[1]")).click();
	driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[3]")).click();
	driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[10]")).click();
	driver.findElement(By.xpath("//div[@class=\"common-radioIndicator\"][1]")).click();
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
