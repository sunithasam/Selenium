package programsTestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Firsttestng {
	WebDriver driver = new FirefoxDriver();
	String Baseurl;
	By Fname = By.id("FirstName");
	By Lname = By.id("LastName");
	By Gaddress = By.id("GmailAddress");
	By password = By.id("Passwd");
	By passwordagn = By.id("PasswdAgain");
  @Test
  public void f3() throws InterruptedException {
	    
	  driver.get(Baseurl);
	  Thread.sleep(10000);
	  driver.findElement(By.id("link-signup")).click();
	  driver.findElement(Fname).sendKeys("sunitha");
	  driver.findElement(Lname).sendKeys("sam02");
	  driver.findElement(Gaddress).sendKeys("sunitha.sam02@gmail.com");
	  driver.findElement(password).sendKeys("02061985");
	  driver.findElement(passwordagn).sendKeys("02061985");
	  driver.findElement(By.id("BirthMonth")).sendKeys("January");
	  driver.findElement(By.id("BirthDay")).sendKeys("02");
	  driver.findElement(By.id("BirthYear")).sendKeys("1985");
	  driver.findElement(By.id("Gender")).sendKeys("Female");
	  driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("305-903-4868");
	  driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("sunitha.staffing");
	  
	  
  }
  
  @Test
  public void f2() throws InterruptedException {
	  
	  
	  
	  driver.get(Baseurl);
	  Thread.sleep(10000);
	  driver.findElement(By.id("link-signup")).click();
	  driver.findElement(Fname).sendKeys("sunitha");
	  driver.findElement(Lname).sendKeys("sam02");
	  driver.findElement(Gaddress).sendKeys("sunitha.sam02@gmail.com");
	  driver.findElement(password).sendKeys("02061985");
	  driver.findElement(passwordagn).sendKeys("02061985");
	  driver.findElement(By.id("BirthMonth")).sendKeys("January");
	  driver.findElement(By.id("BirthDay")).sendKeys("02");
	  driver.findElement(By.id("BirthYear")).sendKeys("1985");
	  driver.findElement(By.id("Gender")).sendKeys("Female");
	  driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("305-903-4868");
	  driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("sunitha.staffing");
	  
	  
  }
  
  @Test
  public void f() throws InterruptedException {
	  
	  
	  
	  driver.get(Baseurl);
	  Thread.sleep(10000);
	  driver.findElement(By.id("link-signup")).click();
	  driver.findElement(Fname).sendKeys("sunitha");
	  driver.findElement(Lname).sendKeys("sam02");
	  driver.findElement(Gaddress).sendKeys("sunitha.sam02@gmail.com");
	  driver.findElement(password).sendKeys("02061985");
	  driver.findElement(passwordagn).sendKeys("02061985");
	  driver.findElement(By.id("BirthMonth")).sendKeys("January");
	  driver.findElement(By.id("BirthDay")).sendKeys("02");
	  driver.findElement(By.id("BirthYear")).sendKeys("1985");
	  driver.findElement(By.id("Gender")).sendKeys("Female");
	  driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("305-903-4868");
	  driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("sunitha.staffing");
	  
	  
  }
  @Test
  public void f1() throws InterruptedException {
	    
	  driver.get(Baseurl);
	  Thread.sleep(10000);
	  driver.findElement(By.id("link-signup")).click();
	  driver.findElement(Fname).sendKeys("sunitha");
	  driver.findElement(Lname).sendKeys("sam02");
	  driver.findElement(Gaddress).sendKeys("sunitha.sam02@gmail.com");
	  driver.findElement(password).sendKeys("02061985");
	  driver.findElement(passwordagn).sendKeys("02061985");
	  driver.findElement(By.id("BirthMonth")).sendKeys("January");
	  driver.findElement(By.id("BirthDay")).sendKeys("02");
	  driver.findElement(By.id("BirthYear")).sendKeys("1985");
	  driver.findElement(By.id("Gender")).sendKeys("Female");
	  driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("305-903-4868");
	  driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("sunitha.staffing");
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  Baseurl = "https://www.gmail.com";
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
