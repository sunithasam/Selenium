package sunitha;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sampletestannotations {

	public String baseurl;
	public  WebDriver driver;
	
		
@Before
public void before(){
driver = new FirefoxDriver();
baseurl = "https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default";
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}



@Test
public void test(){
	driver.get(baseurl);
	
}
@After
	public void after(){
	driver.quit();
}
}
