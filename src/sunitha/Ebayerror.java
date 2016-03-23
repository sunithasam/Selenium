package sunitha;

import static org.testng.AssertJUnit.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Ebayerror {
	WebDriver driver = new FirefoxDriver();
	
	@Before 
	public void test12() {
	driver.get("http://http://www.ebay.com//");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
	
	@Test
	public void test() {
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
        driver.findElement(By.id("gh-ug-flex")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email_r")).click();
        driver.findElement(By.id("lblemail")).click();
  
   String error = driver.findElement(By.id("email_w")).getText();
   String expectederror = "Please enter your email address.";
   assertEquals(expectederror,error);
        	}	
        
}
