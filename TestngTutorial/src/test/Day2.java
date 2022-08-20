package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 
{
	@Test(groups={"smoke"})
	public void demo2()
	{
			System.out.println("third test case");
	}

	@Test(enabled=false)
	public void demo3()
	{
			System.out.println("third1 test case");
	}
	
	@Parameters({"URL"})
	@Test
	public void vdemo (String urlname)
	{
			System.out.println("third2 test case");
			System.out.println(urlname);
	}
	@Test(dependsOnMethods="vdemo")
	public void ademo5()
	{
			System.out.println("third3 test case");
	}

}
