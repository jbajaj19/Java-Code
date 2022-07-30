import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLcheck {

	public static void main(String[] args) 

	{
		ChromeOptions option = new ChromeOptions();//class to set properties of chrome
		option.setAcceptInsecureCerts(true);
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4400");
		option.setCapability(null, proxy);
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}

}
