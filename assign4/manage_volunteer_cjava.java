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

public class manage_volunteer_cjava {
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
  public void testManageVolunteerCjava() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("cmpuchanemolefha@unomaha.edu");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("secrete");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.linkText("Manage Volunteers")).click();
    driver.findElement(By.linkText("Volunteer Management")).click();
    driver.findElement(By.linkText("Create a New Volunteer")).click();
    driver.findElement(By.name("volunteer_refno")).clear();
    driver.findElement(By.name("volunteer_refno")).sendKeys("VOL00003");
    driver.findElement(By.name("last_name")).clear();
    driver.findElement(By.name("last_name")).sendKeys("Ching-chong");
    driver.findElement(By.name("first_name")).clear();
    driver.findElement(By.name("first_name")).sendKeys("Lu");
    driver.findElement(By.name("street_address")).clear();
    driver.findElement(By.name("street_address")).sendKeys("4002 Pacific St. and 67th Pine St.");
    driver.findElement(By.name("city")).clear();
    driver.findElement(By.name("city")).sendKeys("Omaha");
    driver.findElement(By.name("state")).clear();
    driver.findElement(By.name("state")).sendKeys("NE");
    driver.findElement(By.name("zip")).clear();
    driver.findElement(By.name("zip")).sendKeys("68139");
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("lching@gmail.com");
    driver.findElement(By.name("work_phone")).clear();
    driver.findElement(By.name("work_phone")).sendKeys("4024567871");
    driver.findElement(By.name("mobile_phone")).clear();
    driver.findElement(By.name("mobile_phone")).sendKeys("4026756745");
    new Select(driver.findElement(By.name("cancer_type_id"))).selectByVisibleText("Cervix");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.linkText("Show")).click();
    driver.findElement(By.linkText("Back")).click();
    driver.findElement(By.linkText("Edit")).click();
    new Select(driver.findElement(By.name("cancer_type_id"))).selectByVisibleText("Leukemia");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
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
