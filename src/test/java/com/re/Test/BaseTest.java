package com.re.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest {
	
	static WebDriver driver; 
	public static final String CHROME="chrome";
	public static final String FIREFOX="firefox";
	public static final String IE="internet explorer";
	
	@BeforeClass
	@Parameters("browsername")
	public void extentReportDemo(@Optional String browsername)
	{
		String browserType=browsername;
		
		switch(browserType) 
		{
		  case CHROME:
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\UX014123\\Music\\chromedriver.exe");	
			  driver = new ChromeDriver();
			  driver.manage().window().maximize();
		      break;
		      
		      
		  case FIREFOX:
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  break;
		 
		  
		  
		  case IE:
		  System.setProperty("webdriver.fireFox.driver", "IEDriverServer.exe");
	      driver=new InternetExplorerDriver();
	      driver.manage().window().maximize();
	      
		}
		
	}
	
	
	//@Test
	//public void Popup() 
	//{
/*		driver.get("http://demo.guru99.com/test/delete_customer.php");*/
		/*driver.findElement(By.name("cusid")).clear();
		driver.findElement(By.name("cusid")).sendKeys("hello");
		driver.findElement(By.name("submit")).click();
		
		//switching to alert
		Alert  alert1=driver.switchTo().alert();
		alert1.accept();
		
		
		driver.quit();
		
		
	}*/
	
	@Test
	public void scroll()
	{
		
		driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
		WebDriverWait wait=new WebDriverWait(driver,5);
		WebElement ele=driver.findElement(By.xpath("//a[text()=\"Demo Site\"]"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.ScrollBy(0,2000)");
		
		//driver.close();
		
		}
}
