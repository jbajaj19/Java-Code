import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class Relativelocator 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/angularpractice/");
		 WebElement namebox = driver.findElement(By.cssSelector("input[name=\"name\"]"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(namebox)).getText());
		 WebElement date = driver.findElement(By.cssSelector("label[for=\"dateofBirth\"]"));
		 driver.findElement(with(By.tagName("input")).below(date)).click();//here below element is of flex type so it could not be 
		//handled with below() so the script will go for next below  element which is submit button and will click on it 
       
		 WebElement checkbox = driver.findElement(By.xpath("//label[text()=\"Check me out if you Love IceCreams!\"]"));
		 
		 driver.findElement(with(By.tagName("input")).toLeftOf(checkbox)).click();
		 WebElement radiobutton =  driver.findElement(By.id("inlineRadio1"));
		 
		 System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radiobutton)).getText());
		 }
}