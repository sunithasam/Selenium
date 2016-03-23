package sunitha;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class Americaneagleerror {
	WebDriver driver = new FirefoxDriver();
	
 @Before 
//public void test2() {
//driver.get("https://www.americaneagle.com/");
//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//driver.manage().window().maximize();
//}
	
@Test
public void test() {
driver.findElement(By.xpath("//nav[@id='mainNav']/ul/li[4]/div/a/span")).click();
driver.findElement(By.xpath("//nav[@id='mainNav']/ul/li[3]/div/a/span")).click();
driver.findElement(By.cssSelector("div.reqQuote > div > a > span")).click();

 }
@After 
public void afterTest(){
driver.quit();
  }
}