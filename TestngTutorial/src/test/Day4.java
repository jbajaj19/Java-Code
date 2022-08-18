package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day4
{
	@Test(groups={"smoke"})
	public void Webloginhomeloan()
	{
	System.out.println("login to web appln of home loan");
	}
	
	@BeforeSuite
	public void suitetest()
	{
	System.out.println("On the top");
	}
		
		@Test
		public void Mobileloginhomeloan()
		{
		System.out.println("login to moblie appln of home loan");
		}
		
		@Test
		public void APIloginhomeloan()
		{
		System.out.println("API login appln of home loan");
		}
}
