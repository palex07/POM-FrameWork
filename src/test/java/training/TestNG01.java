package training;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNG01
{
	
	@Test
	public void test1()
	{
		int a=200;
		int b =300;
		int c=a+b;
		
		System.out.println(c);
		Assert.assertEquals(a,c,"Assetion failed"); //Assert Example
	
		System.out.println("First Test case");
	}
	@Test
	public void test4()
	{
		
		System.out.println("4th Test case Passed");
	}
	@Test
	public void test2()
	{
		
		System.out.println("2nd Test case Passed");
	}
	@Test
	public void test3()
	{
		
		System.out.println("3rd Test case Passed");
	}
}
