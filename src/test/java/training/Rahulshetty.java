package training;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rahulshetty {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\work\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");

		driver.manage().window().maximize();

		String tittle = driver.getTitle();
		System.out.println(tittle);

		driver.findElement(By.id("autocomplete")).sendKeys("India");
		driver.findElement(By.name("enter-name")).sendKeys("Prasanth Alex");

		// **Static Dropdown using select class -Selectbyvalue, SelectbyIndex,
		// Selectbyvisibletext**
		Select drop = new Select(driver.findElement(By.id("dropdown-class-example")));
		//drop.selectByValue("option2");
		//drop.selectByIndex(1);
		drop.selectByVisibleText("Option3");
		// *****************************************************

		// checkboxes and Radio button........................
		
		 driver.findElement(By.id("checkBoxOption1")).click(); //checkbox selection
		 
		 
		 List<WebElement>Radiobutton = driver.findElements(By.className("radioButton")); //Radio button
		 Radiobutton.get(2).click();
		 
		
		 
		// .............................................

		// alert window handling........................

		//driver.findElement(By.className("inputs")).sendKeys("Prasanth ++Test here++");
		//driver.findElement(By.id("alertbtn")).click(); 
		 driver.findElement(By.id("confirmbtn")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		//alert.accept(); // click on "OK " button
		alert.dismiss();
	
		//System.out.println("Alert window clicked");
		
		// Alert..........................................

		// window on another tab......................
		
		 driver.findElement(By.id("opentab")).click(); for(String
		  winHandle:driver.getWindowHandles()) 
		 { driver.switchTo().window(winHandle);
		 
		 } System.out.println("window Switched");
		

		// driver.quit();

		/*
		 * driver.findElement(By.id("openwindow")).click(); // String handle=
		 * driver.getWindowHandle(); // driver.switchTo().window(handle); //
		 * System.out.println(driver.getTitle());
		 * 
		 * Set<String>windowids =driver.getWindowHandles(); Iterator<String>
		 * iter=windowids.iterator(); String mainwindow=iter.next(); //Parent window
		 * String childwindow=iter.next(); //child window
		 * driver.switchTo().window(childwindow); //Switched to child page
		 * 
		 * System.out.println(driver.getTitle());
		 */
		 
	}

}
