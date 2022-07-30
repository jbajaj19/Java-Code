import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Misllenious {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// to maximizze the size of window
		driver.manage().deleteAllCookies();// to delete all cookies
		driver.manage().deleteCookieNamed("abc");// to delete cookie with particular name

		driver.get("https://google.com/");
		
		 File src = (File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(src, new File("d://screenshot"));
	}
}