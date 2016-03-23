package sunitha;

import static org.testng.AssertJUnit.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Diceerror {
	WebDriver driver = new FirefoxDriver();
	
	@BeforeTest
  public void test21() {
	driver.get("https://www.dice.com/dashboard/login");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
	
	@Test
	public void test() {

		driver.findElement(By.linkText("Register")).click();		
		String sunitha = driver.findElement(By.xpath(".//*[@id='people']/div[1]/div[1]/h1[2]/div")).getText();
		String exp = "Register for Dice. Browse thousands of tech jobs.";
		assertEquals(sunitha,exp);
}
	
	
	@Test
	public void test2() {
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys(Keys.TAB);
		String sunitha = driver.findElement(By.xpath(".//*[@id='people']/div[2]/div[3]/div/div/span[2]")).getText();
	    String exp = "Enter a valid email.";
	    assertEquals(sunitha,exp);
	}
@AfterTest
public void after() {
	driver.quit();
}}