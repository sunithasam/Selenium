package sunitha;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testjunit {
	
	private WebDriver driver;
	private String BaseUrl;
	
	
@Before
public void Before() {
	System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/");

	  WebDriver driver = new ChromeDriver();
	BaseUrl = "https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&ltmpl=default";
	driver.manage().window().maximize();
}

	

	@Test
	public void test() {
		driver.get(BaseUrl);
		driver.findElement(By.id("FirstName")).sendKeys(Keys.RETURN);
		String error_msg = driver.findElement(By.id("errormsg_0_LastName")).getText();
		System.out.println(error_msg);
		String expected_msg = "You can't leave this empty.";
		assertEquals(expected_msg,error_msg );

	}



@After
public void after() throws InterruptedException
{
	Thread.sleep(5000);
	driver.quit();
}

}
