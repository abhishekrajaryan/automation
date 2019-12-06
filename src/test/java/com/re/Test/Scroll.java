package com.re.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\UX014123\\Music\\chromedriver.exe");	
		driver=new ChromeDriver();
		//JavascriptExecutor js = (JavascriptExecutor) driver;

        // Launch the application		
       // driver.get("http://demo.guru99.com/test/guru99home/");

//        //To maximize the window. This code may not work with Selenium 3 jars. If script fails you can remove the line below		
//        driver.manage().window().maximize();
//
//        // This  will scroll down the page by  1000 pixel vertical		
//        //js.executeScript("window.scrollBy(0,2000)");
//        
//        Thread.sleep(1000);
//        //js.executeScript("window.scrollBy(0,-2000)");
//        WebElement  Element=driver.findElement(By.xpath("//a[text()=\"Linux\"]"));
//       // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//        js.executeScript("arguments[0].scrollIntoView();", Element);
//        Thread.sleep(1000);
//        
        
		
		//---drag and drop-----//
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
        
      //Element which needs to drag.    		
    	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
     
     //Element on which need to drop.		
     WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
     		
     //Using Action class for drag and drop.
     Actions act=new Actions(driver);
     act.dragAndDrop(From, To);
     
        
        driver.close();
	}

}
