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
import org.openqa.selenium.firefox.FirefoxDriver;

public class Americaneagle {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.americaneagle.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();

  }

  @Test
  public void testUntitled() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.xpath("//nav[@id='mainNav']/ul/li[4]/div/a/span")).click();
    driver.findElement(By.xpath("//nav[@id='mainNav']/ul/li[3]/div/a/span")).click();
    driver.findElement(By.cssSelector("div.reqQuote > div > a > span")).click();
    driver.findElement(By.id("C008_tbName")).clear();
    driver.findElement(By.id("C008_tbName")).sendKeys("sunitha");
    driver.findElement(By.id("C008_tbCompany")).clear();
    driver.findElement(By.id("C008_tbCompany")).sendKeys("sunita");
    driver.findElement(By.id("C008_tbPhone")).clear();
    driver.findElement(By.id("C008_tbPhone")).sendKeys("1234567891");
    driver.findElement(By.id("C008_tbEmail")).clear();
    driver.findElement(By.id("C008_tbEmail")).sendKeys("abcd123@gmail.com");
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
