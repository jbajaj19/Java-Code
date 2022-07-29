import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PractiseProg2 
{

	public static void main(String[] args) 
	
	{
		
		System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");	

		WebDriver driver = new ChromeDriver();

		 driver.get("https://rahulshettyacademy.com/angularpractice/");
		 driver.findElement(By.name("name")).sendKeys("Jigyasa Bajaj");
		 driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("Jigyasabajaj93@gmail.com");
		 driver.findElement(By.id("exampleInputPassword1")).sendKeys("Jigyasa19");
		 driver.findElement(By.xpath("//input[@id=\"exampleCheck1\"]")).click();
		 Assert.assertTrue(driver.findElement(By.xpath("//input[@id=\"exampleCheck1\"]")).isSelected());
		WebElement dropdown = driver.findElement(By.cssSelector("select[class=\"form-control\"]"));
	Select dropdown1 = new Select(dropdown);
	dropdown1.selectByIndex(1);
	driver.findElement(By.id("inlineRadio1")).click();
	driver.findElement(By.cssSelector("input[type=\"date\"]")).sendKeys("19-09-1993");
	driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
	System.out.println(driver.findElement(By.cssSelector(".alert-dismissible")).getText());
	
		

	}

}
