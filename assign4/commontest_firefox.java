package assign4;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public abstract class commontest_firefox {
	
	 //protected String user="clama@unomaha.com";
	  //protected String pwd="secrets";
	  protected static WebDriver driver;
	  public static String baseUrl;
	  private boolean acceptNextAlert = true;
	  private static StringBuffer verificationErrors = new StringBuffer();

	  

	  
@BeforeClass
     public static void setUp() throws Exception {
		  System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.15.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		    baseUrl = "http://necaresys.herokuapp.com/";
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         }

@AfterClass
public static void tearDown() throws Exception {
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
