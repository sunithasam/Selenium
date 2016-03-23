package sunitha;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
public class Gmail {
WebDriver driver = new FirefoxDriver();

//@Before 
//  public void test2() {
//	driver.get("https://www.gmail.com/");
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	driver.manage().window().maximize();
//}
	@Test
	public void test() {
		driver.get("https://www.gmail.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
driver.findElement(By.id("link-signup")).click();
//driver.findElement(By.id("FirstName")).click();
//driver.findElement(By.id("FirstName")).sendKeys(Keys.TAB);
String error = driver.findElement(By.id("gmail-address-label")).getText();
String expectederror = "You can't leave this empty.";
assertEquals(expectederror,error);
	}	
//	
//	@Test
//	public void test1() throws InterruptedException {
//	driver.findElement(By.id("link-signup")).click();
//    driver.findElement(By.id("Passwd")).click();
//    driver.findElement(By.id("Passwd")).sendKeys(Keys.TAB);
//    String error = driver.findElement(By.id("errormsg_0_Passwd")).getText();
//    String expectederror = "You can't leave this empty.";
//    assertEquals(expectederror,error);
//    Thread.sleep(2000);
//	}
    
@After 
public void afterTest(){
driver.quit();
	}
}




