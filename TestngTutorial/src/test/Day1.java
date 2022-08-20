package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Day1 

{   
	@Test(groups={"smoke"})
	public void demo()
{
		System.out.println("hello");
}
	
	@BeforeMethod
	public void beforeevery()
	{
			System.out.println("I will execute before every method in file day1");
	}
		
	@AfterMethod
	public void Afterevery()
	{
			System.out.println("I will execute After every method in file day1");
	}
		
	
	@Test
	public void demo1()
	{
			System.out.println("Second test case");
	}
	
	@AfterSuite
	public void suitetest()
	{
	System.out.println("On the bottom");
	}

	@BeforeTest
	public void demo5()
	{
			System.out.println("I will execute first");
	}
	
	

	@AfterTest
	public void demo6()
	{
			System.out.println("At last of this folder/module");
	}
	}
