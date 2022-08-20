import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scenario4 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");		// TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver();
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
	//driver.findElement(By.cssSelector("div[class=\"common-checkboxIndicator\"]")).click();
	//driver.findElement(By.xpath("//body/div[@id='mountRoot']/div[1]/div[1]/main[1]/div[3]/div[1]/section[1]/div[1]/div[3]/ul[1]/li[1]/label[1]/div[1]")).click();
	//driver.findElement(By.cssSelector("div[class=\"common-radioIndicator\"]")).click();
	}

}
