package com.training.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.training.Base.TestBase;

public class Page01 extends TestBase {
	
	// PageFactory
	
	@FindBy(name="firstname")
	WebElement firstname;
	
	@FindBy(name="lastname")
	WebElement lastname;
	
	@FindBy(id="sex-0")
	WebElement gender;
	
	//Initilize the pageobjects
	
	public Page01()
	{
		PageFactory.initElements(driver,this);
	}
	// Write some actions
	
	public String validatePageTitle()
	{
		return driver.getTitle();
		
	}
	//driver.findElement(By.name("firstname")).sendKeys("Prasanth");
	//driver.findElement(By.name("lastname")).sendKeys("Alex");
	//driver.findElement(By.id("sex-0")).click();
	//driver.findElement(By.id("exp-5")).click();
	//driver.findElement(By.id("datepicker")).sendKeys("14/12/2010");

}
