package programsTestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Americaeagletesting {
 WebDriver driver = new FirefoxDriver();
	String Baseurl;
	By navid = By.id("//nav[@id='mainNav']/ul/li[4]/div/a/span");
	By navid1 = By.id("//nav[@id='mainNav']/ul/li[3]/div/a/span");
	By divrequote = By.id("div.reqQuote > div > a > span");
	By c008tbname = By.id("008_tbName");
	By c008tbname1 = By.id("008_tbName");
	By c008tbcompany = By.id("C008_tbCompany");
	By c008tbcompany1 = By.id("C008_tbCompany");
	By c008tbphone = By.id("C008_tbPhone");
	By c008tbphone1 = By.id("C008_tbPhone");
	By c008tbemail = By.id("C008_tbEmail");
	By c008tbemail1 =  By.id("C008_tbEmail");
	
  @Test
  public void f() throws InterruptedException{
	  driver.get(Baseurl);
	  Thread.sleep(10000); 
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
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
