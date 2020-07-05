package training;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSetup {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\work\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
//By ID and Name Selectors======================================================
//==============================================================================
		driver.findElement(By.name("firstname")).sendKeys("Prasanth");
		driver.findElement(By.name("lastname")).sendKeys("Alex");
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.id("exp-5")).click();
		driver.findElement(By.id("datepicker")).sendKeys("14/12/2010");
//===================================================================
		
//=====Xpath Selector example -//tagName[@attribute='value']  - xpath syntax=========	
		
		//driver.findElement(By.name("profession")).click();
		
		driver.findElement(By.xpath("//input[@name='profession']")).click();
	//========================================================================	
		driver.findElement(By.id("tool-2")).click();
		
	//====tagName[attribute='value']  -CSS  tagName#id- CSS   tagname.classname- CSS=====
		
		driver.findElement(By.cssSelector("select[id='continents']")).sendKeys("Africa");
	
		//driver.findElement(By.id("continents")).sendKeys("Africa");
		
//=====================================================================================
		driver.findElement(By.id("selenium_commands")).sendKeys("Navigation Commands");
		
//By linktext =====================================
		
		//driver.findElement(By.linkText("Click here to Download File")).click();
				
	
//========================================================================================

      // JavascriptExecutor js = (JavascriptExecutor) driver;
      // js.executeScript(" driver.findElement(By.linkText(\"Click here to Download File\")).click();(By.linkText(\"Click here to Download File\")).click();");
		
		Thread.sleep(50000);
		driver.close();
		
		
		

	}

}
