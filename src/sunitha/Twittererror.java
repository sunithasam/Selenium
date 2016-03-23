package sunitha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Twittererror {
	WebDriver driver = new FirefoxDriver();
	
//@Before 
//  public void test2() {
//	driver.get("https://twitter.com//");
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	driver.manage().window().maximize();
//}
	@Test
	public void test() {
		driver.get("https://www.gmail.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
}
