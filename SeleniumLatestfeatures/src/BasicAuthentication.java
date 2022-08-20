import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.URI;
import java.util.function.Predicate;

public class BasicAuthentication {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		
	Predicate<URI>	uripredicate = uri -> uri.getHost().contains("httpbin.org");
	((HasAuthentication)driver).register(uripredicate,UsernameAndPassword.of("foo", "bar"));
	}

}
