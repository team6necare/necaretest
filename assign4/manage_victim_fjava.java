package Assign4;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class manage_victim_fjava {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium\\geckodriver.exe");
	driver = new FirefoxDriver();
    baseUrl = "http://necaresys.herokuapp.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testManageVictimFjava() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("cmpuchanemolefha@unomaha.edu");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("secrete");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Manage victims")).click();
    driver.findElement(By.linkText("Create a New Victim")).click();
    driver.findElement(By.name("victim_refno")).clear();
    driver.findElement(By.name("victim_refno")).sendKeys("VIC00010");
    driver.findElement(By.name("last_name")).clear();
    driver.findElement(By.name("last_name")).sendKeys("Lionel");
    driver.findElement(By.name("first_name")).clear();
    driver.findElement(By.name("first_name")).sendKeys("Sandrah");
    driver.findElement(By.name("street_address")).clear();
    driver.findElement(By.name("street_address")).sendKeys("1111 Dodge St.");
    driver.findElement(By.name("city")).clear();
    driver.findElement(By.name("city")).sendKeys("Omaha");
    driver.findElement(By.name("state")).clear();
    driver.findElement(By.name("state")).sendKeys("NE");
    driver.findElement(By.name("zip")).clear();
    driver.findElement(By.name("zip")).sendKeys("68012");
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("slionel@gmail.com");
    driver.findElement(By.name("home_phone")).clear();
    driver.findElement(By.name("home_phone")).sendKeys("4021342323");
    driver.findElement(By.name("mobile_phone")).clear();
    driver.findElement(By.name("mobile_phone")).sendKeys("4021342312");
    new Select(driver.findElement(By.name("cancer_type_id"))).selectByVisibleText("Cervix");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Show")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Back")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.name("zip")).clear();
    driver.findElement(By.name("zip")).sendKeys("68121");
    driver.findElement(By.name("mobile_phone")).clear();
    driver.findElement(By.name("mobile_phone")).sendKeys("4021342222");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("input.btn.btn-danger")).click();
    driver.findElement(By.linkText("Chandapiwa Mpuchane")).click();
    driver.findElement(By.linkText("Logout")).click();
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
