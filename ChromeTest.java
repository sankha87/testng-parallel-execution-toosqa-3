package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeTest {

	public WebDriver driver;
	@BeforeTest
	public void beforeTest() {
System.out.println("Before Test Thread Number Is " + Thread.currentThread().getId());
System.setProperty("webdriver.chrome.driver", "C:\\browser drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	}

       @Test
 	public void ChromeTestMethod()
 	{ 
	 System.out.println("The thread ID for Chrome Test is "+ Thread.currentThread().getId());
	  driver.get("https://www.demoqa.com"); 
		 WebElement e = driver.findElement(By.xpath("(//div[@class='card-up'])[1]"));
			Actions act = new Actions(driver);
			act.moveToElement(e).perform();
			act.click(e).perform();  
      }
 
     @AfterTest
     public void afterTest() {
	 System.out.println("After Test Thread Number Is " + Thread.currentThread().getId());
//	 driver.close();
    }
 }
