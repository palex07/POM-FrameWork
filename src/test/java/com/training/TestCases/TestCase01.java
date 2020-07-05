package com.training.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.Base.TestBase;
import com.training.Pages.Page01;

public class TestCase01 extends TestBase 
{
	Page01 webpage01;
	
	public TestCase01()
	{
		super();
	}
	
@BeforeMethod
	public void setup()
	{
		initilization();
	webpage01 =new Page01();
	
	}
// testcase for tittle validation
@Test

public void tittlevalidation() throws Exception
{
	String tittle=webpage01.validatePageTitle();
	System.out.println(tittle);
	Thread.sleep(2000);

Assert.assertEquals(tittle, "Google");
//Rediff.com: News | Rediffmail | Stock Quotes | Shopping","Tittle validation passed
	}

@AfterMethod
public void teardown()
{
	driver.close();
	
	}
}
