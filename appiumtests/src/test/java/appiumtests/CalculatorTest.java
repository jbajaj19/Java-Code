package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) 
	
	{
		try {
			openCalculator();
		} catch (MalformedURLException e)
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	public static void openCalculator() throws MalformedURLException 
	{
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "LLD-AL10");
		caps.setCapability("udid", "P8B4C18317000807");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "8.0.0");
		
		caps.setCapability("appPackage", "com.android.calculator2");
		caps.setCapability("appActivity", "com.android.calculator2.Calculator");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url,caps);
		System.out.println("application started");
		
		MobileElement two = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
		MobileElement plus = driver.findElement(By.id("com.android.calculator2:id/op_add"));
		MobileElement three = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
		MobileElement equals = driver.findElement(By.id("com.android.calculator2:id/eq"));
		MobileElement result = driver.findElement(By.className("android.widget.EditText"));
		two.click();
		plus.click();
		three.click();
		equals.click();
		String res = result.getText();
		System.out.println("\n result is :"+ res);
		System.out.println("complted..");
	}
}
