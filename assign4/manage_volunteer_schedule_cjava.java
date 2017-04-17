package Assign4;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class manage_volunteer_schedule_cjava {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "http://necaresys.herokuapp.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testManageVolunteerScheduleFjava() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("cmpuchanemolefha@unomaha.edu");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("secrete");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("Manage Volunteers")).click();
    driver.findElement(By.linkText("Volunteer Schedule Management")).click();
    driver.findElement(By.linkText("Create a New Schedule for Volunteer")).click();
    new Select(driver.findElement(By.name("volunteer_id"))).selectByVisibleText("VOL00002");
    //driver.findElement(By.name("valid_from")).clear();
    driver.findElement(By.name("valid_from")).sendKeys("2017-06-01");
   //driver.findElement(By.name("valid_to")).clear();
    driver.findElement(By.name("valid_to")).sendKeys("2017-07-30");
    driver.findElement(By.name("sunday_morning")).click();
    driver.findElement(By.name("sunday_afternoon")).click();
    driver.findElement(By.name("monday_morning")).click();
    driver.findElement(By.name("tuesday_morning")).click();
    driver.findElement(By.name("wednesday_morning")).click();
    driver.findElement(By.name("thursday_morning")).click();
    driver.findElement(By.name("saturday_morning")).click();
    driver.findElement(By.name("saturday_afternoon")).click();
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Show")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Back")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.name("friday_morning")).click();
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
