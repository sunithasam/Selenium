
package programsTestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Dicetesting {
	WebDriver driver = new FirefoxDriver();
	String Baseurl;
	By Login1 = By.id("Login_1");
	By Loginbtn1 = By.id("LoginBtn_1");
	By Email1 = By.id("Email_1");
	By email = By.id("Email_1");
	By password1 = By.id("Password_1");
	By paswrd1 = By.id("Password_1");
	
  @Test
  public void f() throws InterruptedException{
	  driver.get(Baseurl);
	    Thread.sleep(10000); 
	    driver.findElement(Login1).click();
	    driver.findElement(Loginbtn1).click();
	    driver.findElement(Email1).clear();
	    driver.findElement(email).sendKeys("sunitha.sam02@gmail.com");
	    driver.findElement(password1).clear();
	    driver.findElement(paswrd1).sendKeys("9985317312");
	

  }
  
  @Test
  public void f1() throws InterruptedException{
	  driver.get(Baseurl);
	    Thread.sleep(10000); 
	    driver.findElement(By.id("Login_1")).click();
	    driver.findElement(By.id("LoginBtn_1")).click();
	    driver.findElement(By.id("Email_1")).clear();
	    driver.findElement(By.id("Email_1")).sendKeys("sunitha.sam02@gmail.com");
	    driver.findElement(By.id("Password_1")).clear();
	    driver.findElement(By.id("Password_1")).sendKeys("9985317312");
	

  }
  @Test
  public void f2() throws InterruptedException{
	  driver.get(Baseurl);
	    Thread.sleep(10000); 
	    driver.findElement(By.id("Login_1")).click();
	    driver.findElement(By.id("LoginBtn_1")).click();
	    driver.findElement(By.id("Email_1")).clear();
	    driver.findElement(By.id("Email_1")).sendKeys("sunitha.sam02@gmail.com");
	    driver.findElement(By.id("Password_1")).clear();
	    driver.findElement(By.id("Password_1")).sendKeys("9985317312");
	

  }
  @Test
  public void f3() throws InterruptedException{
	  driver.get(Baseurl);
	    Thread.sleep(10000); 
	    driver.findElement(By.id("Login_1")).click();
	    driver.findElement(By.id("LoginBtn_1")).click();
	    driver.findElement(By.id("Email_1")).clear();
	    driver.findElement(By.id("Email_1")).sendKeys("sunitha.sam02@gmail.com");
	    driver.findElement(By.id("Password_1")).clear();
	    driver.findElement(By.id("Password_1")).sendKeys("9985317312");
	

  }
  @BeforeTest
  public void beforeTest() {
	  Baseurl = "https://www.dice.com";
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
