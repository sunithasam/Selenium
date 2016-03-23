package sunitha;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CareerBuilder {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.careerbuilder.com";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("cbhlSignUp")).click();
    driver.findElement(By.id("ucUserRegistration_HHTVUser_FirstName")).sendKeys("sunitha");
    driver.findElement(By.id("ucUserRegistration_HHTVUser_LastName")).sendKeys("sam");
    driver.findElement(By.id("ucUserRegistration_HHTVUser_Email")).sendKeys("sunitha.staffing@gmail.com");
    driver.findElement(By.id("ucUserRegistration_HHTVUser_RetypeEmail")).sendKeys("sunitha.staffing@gmail.com");
    driver.findElement(By.id("ucUserRegistration_HHTVUser_Passwd")).sendKeys("9985317");
    driver.findElement(By.id("ucUserRegistration_HHTVUser_RetypePasswd")).sendKeys("9985317");
    driver.findElement(By.id("ucUserRegistration_HHTVUser_Phone")).sendKeys("9985317312");
    driver.findElement(By.id("ucUserRegistration_HHTVUser_Address1")).sendKeys("stevenson blvd");
    driver.findElement(By.id("ucUserRegistration_HHTVUser_Address2")).sendKeys("mission peaks apt");
    driver.findElement(By.id("ucUserRegistration_HHTVUser_CountryName")).sendKeys("United States");
//    
    
  }


@After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
