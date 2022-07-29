import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	

	public static void main(String[] args) throws InterruptedException

	{
		// TODO Auto-generated method stub
     
		System.setProperty("webdriver.chrome.driver", "C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		String[] vegetables = { "Brocolli", "Cucumber", "Beetroot", "carrot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addvegetable(driver,vegetables);
		driver.findElement(By.cssSelector("img[alt=\"Cart\"]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input.promocode")));
		
				driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.cssSelector("button.promoBtn")).click();
	   
	    w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By.cssSelector("span.promoInfo"))));
	    System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	
	}

	
	public static void addvegetable(WebDriver driver , String []vegetables)
	{
		
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String newformat = name[0].trim();
			// aftr getting text from above line we hv to format the text to match the text
			// in our
			// arraylist
			// check whether the name you extracted is present in array or not
			// convert array to an arraylist for our easy search

			List<String> veggie = Arrays.asList(vegetables);

			if (veggie.contains(newformat)) {
				j++;
				// click on add to cart

				driver.findElements(By.xpath("//div[@class=\"product-action\"]/button")).get(i).click();

				if (j == vegetables.length) {
					break;
				}
			}
		}

	}

}
