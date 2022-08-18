package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3

{   @Parameters({"URL","APIkeys/username"})
	@Test(groups={"smoke"})
public void WebloginCarloan(String urlname, String key)
{
System.out.println("login to web appln of car loan");
System.out.println(urlname);
System.out.println(key);
}
	
	@Test(dataProvider="getdata")
	public void MobileloginCarloan(String username, String password)
	{
	System.out.println("login to moblie appln of car loan");
	System.out.println(username);
	System.out.println(password);
	}
	
	@Test
	public void APIloginCarloan()
	{
	System.out.println("API login appln of car loan");
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		
		//1st combination- username password->of user who hass good credit history
		//2nd combination- username password->of user who no credit history
		//3rd combination- username password->of user who has fraudlent credit history
		
		Object[][]  data = new Object[3][2];
		//1st set
		data[0][0] = "firstsetusername";
		data[0][1] = "password1";
		//coloumns in the row are nothng but the values for the particular combination(row)
		
		//2nd set
		
		data[1][0] = "secondsetusername";
		data[1][1] = "password2";
		
		//3rd set
		data[2][0] = "thirdsetusername";
		data[2][1] = "password3";
		return data;
		
		
	}
	
	
	
}
