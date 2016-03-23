package sunitha;

import static org.testng.AssertJUnit.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Amazonerror {
WebDriver driver = new FirefoxDriver();

@Before 
public void test11() {
driver.get("http://www.amazon.com/");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().window().maximize();
}

@Test
public void test() throws InterruptedException{
	driver.findElement(By.id("nav-link-yourAccount")).click();
	driver.findElement(By.id("createAccountSubmit")).click();
//	driver.findElement(By.id("auth-create-account-link")).click();
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("continue")).click();

	String error = driver.findElement(By.id("auth-error-message-box")).getText();
	String expectederror = "There was a problem" +"\n"
			+ "Missing e-mail address. Please correct and try again." +"\n"
			+ "Please enter your password." +"\n"
			+ "You must provide a name." +"\n"
			+ "Please check that your passwords match and try again.";
	assertEquals(expectederror,error);
}

@After 
public void test1(){
driver.quit();
	}
}