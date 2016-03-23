package programsTestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Amazontest {
	WebDriver driver = new FirefoxDriver();
	String Baseurl;
	By navlink = By.id("nav-link-yourAccount");
	By createacct = By.id("createAccountSubmit");
	By apcustomer = By.id("ap_customer_name");
	By apemail = By.id("ap_email");
	By appasswrd = By.id("ap_password");
	By appasswrdcheck = By.id("ap_password_check");
	
  @Test
  public void f() throws InterruptedException {
	    driver.get(Baseurl);
	    Thread.sleep(10000); 
	    driver.findElement(navlink).click();
	    driver.findElement(createacct).click();
	    driver.findElement(apcustomer).sendKeys("sunitha");
	    driver.findElement(apemail).sendKeys("sunitha.staffing@gmail.com");
	    driver.findElement(appasswrd).sendKeys("9985317312");
	    driver.findElement(appasswrdcheck).sendKeys("9985317312");
  }
  
  @Test
  public void f2() throws InterruptedException {
	    driver.get(Baseurl);
	    Thread.sleep(10000); 
	    driver.findElement(navlink).click();
	    driver.findElement(createacct).click();
	    driver.findElement(apcustomer).sendKeys("sunitha");
	    driver.findElement(apemail).sendKeys("sunitha.staffing@gmail.com");
	    driver.findElement(appasswrd).sendKeys("9985317312");
	    driver.findElement(appasswrdcheck).sendKeys("9985317312");
  }
  
  @Test
  public void f1() throws InterruptedException {
	    driver.get(Baseurl);
	    Thread.sleep(10000); 
	    driver.findElement(navlink).click();
	    driver.findElement(createacct).click();
	    driver.findElement(apcustomer).sendKeys("sunitha");
	    driver.findElement(apemail).sendKeys("sunitha.staffing@gmail.com");
	    driver.findElement(appasswrd).sendKeys("9985317312");
	    driver.findElement(appasswrdcheck).sendKeys("9985317312");
  }
  
  @BeforeTest
  public void beforeTest() {
	  Baseurl = "https://www.amazon.com";
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
