import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Livedemo {

	public static void main(String[] args) 
	
	
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	 
	 
	 //click on coloumn
	 driver.findElement(By.xpath("//tr//th[1]")).click();	 
	 
	 //capture all the webelements into a list
	 List<WebElement> elementlist = driver.findElements(By.xpath("//tr//td[1]"));
	 
	 //capture the text of all webelements into a new list
	List <String> originallist =  elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
	
	//sort the original list on step num 3-> sorted list
	List <String> sortedlist = originallist.stream().sorted().collect(Collectors.toList());
	
	//compare original vs sorted list
	 
    Assert.assertTrue(originallist.equals(sortedlist));
    
    
    //scan the name coloumn with gettext & when you get RICE, print the price of rice
    List <String> price ;
    do 
    {
    	 List<WebElement> elementlist1 = driver.findElements(By.xpath("//tr//td[1]"));
     price = elementlist1.stream().filter(s->s.getText().contains("Rice")).map(s->getveggieprice(s)).collect(Collectors.toList());
	price.forEach(a->System.out.println(a));
	
	if(price.size()<1)
		
	{
		driver.findElement(By.cssSelector("a[aria-label=\"Next\"]")).click();
		
	}
    }while(price.size()<1)	;
		
		
	}

	private static String getveggieprice(WebElement s)
	{
		// TODO Auto-generated method stub
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

	}

