import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fileupload {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		// TODO Auto-generated method stub
		String downloadpath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32/chromedriver.exe");
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

        chromePrefs.put("profile.default_content_settings.popups", 0);

        chromePrefs.put("download.default_directory", downloadpath);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		
		driver.findElement(By.cssSelector("a[id=\"pickfiles\"]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\LENOVO\\Documents\\fileupload.exe");
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[id=\"processTask\"]")));
		driver.findElement(By.cssSelector("button[id=\"processTask\"]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[id=\"pickfiles\"]")));
		driver.findElement(By.cssSelector("a[id=\"pickfiles\"]")).click();
		File f = new File(downloadpath+"/ilovepdf_pages-to-jpg.zip");
		if(f.exists())
		{
			
			System.out.println("file found");
		}
	}

}
