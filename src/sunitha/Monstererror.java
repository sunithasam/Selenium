package sunitha;

import static org.testng.AssertJUnit.assertEquals;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Monstererror {
WebDriver driver = new FirefoxDriver();
	
	@Before 
   public void test3() {
   driver.get("https://www.monster.com//");
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   driver.manage().window().maximize();
	}
	
	@Test
	public void test() {
    driver.findElement(By.id("loginLink")).click();
    driver.findElement(By.id("ctl00")).click();
        
    String error = driver.findElement(By.id("EmailAddressLabel")).getText();
    String expectederror = "Whoops, we noticed something incorrect...";
    assertEquals(expectederror,error);

	}
        @After 
        public void afterTest(){
        driver.quit();
        	}
}