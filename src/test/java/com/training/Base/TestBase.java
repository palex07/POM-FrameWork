package com.training.Base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
  public TestBase()
	{
		
prop= new Properties();
try

{
	FileInputStream fis =new FileInputStream ("./configuration/config.properties");
	prop.load(fis);
	System.out.println(prop.getProperty("username"));
	String password= prop.getProperty("password");
	System.out.println(password);
	String browser=prop.getProperty("browserName");
	System.out.println(browser);

	}
catch(Exception e) {
	System.out.println("Exception is"+e.getMessage());
	
	
	}
finally{
	
	System.out.println("Property is read properly");
}

	}

  public static void test01()
  {
	  System.out.println(" =================calling test menthod===============");
  }
  
  public static void initilization()
  {
	 String  browserName=prop.getProperty("browserName");
	 if (browserName.equals("chrome"))
		 
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\work\\Selenium\\Drivers\\chromedriver.exe");
		 driver =new ChromeDriver();
		 System.out.println("Browser is chrome");
	 }
	 else if(browserName.equals("firefox"))//this needs to be changed to Gekodriver
		 
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\work\\Selenium\\Drivers\\chromedriver.exe");
			driver =new ChromeDriver();
	 }
  
  driver.manage().window().maximize();
  driver.get(prop.getProperty("url"));

} 
}
