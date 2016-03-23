package sunitha;

import static org.testng.AssertJUnit.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Bestbuyerror {
	WebDriver driver = new FirefoxDriver();
	
 @Before 
public void test2() {
driver.get("https://http://www.bestbuy.com//");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().window().maximize();
 }
 
 @Test
	public void test() {
		driver.get("https://www.bestbuy.com//");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("hdr_signin_b")).click();
		driver.findElement(By.id("links-model-data")).click();
		driver.findElement(By.className("https://www-ssl.bestbuy.com/identity/newAccount?token=X9A4aVwpFZcVI1KiLcbObps1aOq%2FGF%2FCf7qyMKfueJRzrIe3qe9RzTzVhPdgv5XMBQHytmfz2BTQQXjlxEhMVkks5iu2pQPJgHLa2US8BhA5%2FONiQrHZmJf3xb7GmepkCUs%2FFseJZRyJ0YVKa8TFLyp0K8JMwxXg%2B8VJbtPxwkdEzh4bBr4MQAwCVLlumeRMm%2FWU1k3pQkNV7Ht6rMj0e2%2FdaY2xvGh5m38VlvVhtDA%3D")).click();
		
		String error = driver.findElement(By.id("fld-e")).getText();
		String expectederror = "Please enter a valid e-mail address.";
		assertEquals(expectederror,error);
 }  
		
	@After 
	public void afterTest(){
	driver.quit();
	}
}
