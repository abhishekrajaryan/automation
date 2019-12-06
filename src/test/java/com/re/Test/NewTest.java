package com.re.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class NewTest {

	static ExtentTest test;
	static ExtentReports report;
	static WebDriver driver;

	@BeforeClass
	public static void startTest() {
		report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
		test = report.startTest("ExtentDemo");

	}

	@Test()
	@Parameters("browsername")
	public void extentReportDemo(@Optional("chrome")String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome"))	
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\UX014123\\Music\\chromedriver.exe");	
			 driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.fireFox.driver", "IEDriverServer.exe");
			   driver=new InternetExplorerDriver();
		}
		else {
			

		   driver=new FirefoxDriver();
		}
		
		
		driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
//		WebDriverWait wait=new WebDriverWait(driver,5);
//		WebElement ele=driver.findElement(By.xpath("//a[text()=\"Demo Site\"]"));
//		wait.until(ExpectedConditions.visibilityOf(ele));
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.ScrollBy(0,10000)");

	}

	@AfterClass

	public static void endTest()

	{

		report.endTest(test);

		report.flush();

	}
}
