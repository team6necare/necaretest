package assign4;


import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class manage_activityschedule_fjava extends commontest_firefox {




  @Test
  public void testActivityschedule() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("clama@unomaha.edu");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("secrets");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    Thread.sleep(4000);
    driver.findElement(By.linkText("Manage Activities")).click();
    Thread.sleep(4000);
    driver.findElement(By.linkText("Activity Schedules Management")).click();
    Thread.sleep(4000);
    driver.findElement(By.linkText("Create New Activity")).click();
    Thread.sleep(4000);
    driver.findElement(By.name("activity_refno")).clear();
    driver.findElement(By.name("activity_refno")).sendKeys("2004");
    driver.findElement(By.name("description")).clear();
    driver.findElement(By.name("description")).sendKeys("Individual Counseling with one on one sessions");
    new Select(driver.findElement(By.name("activity_type_id"))).selectByVisibleText("One on one Session");
    driver.findElement(By.name("start_datetime")).clear();
    driver.findElement(By.name("start_datetime")).sendKeys("2017-04-13 10:00:00");
    driver.findElement(By.name("end_datetime")).clear();
    driver.findElement(By.name("end_datetime")).sendKeys("2017-04-13 11:00:00");
    driver.findElement(By.name("status")).clear();
    driver.findElement(By.name("status")).sendKeys("Open");
    driver.findElement(By.name("cost")).clear();
    driver.findElement(By.name("cost")).sendKeys("800");
    Thread.sleep(4000);
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    Thread.sleep(4000);
    driver.findElement(By.linkText("Show")).click();
    Thread.sleep(4000);
    driver.findElement(By.linkText("Back")).click();
    Thread.sleep(4000);
    driver.findElement(By.linkText("Edit")).click();
    Thread.sleep(4000);
    new Select(driver.findElement(By.name("location_id"))).selectByVisibleText("Papillion");
    driver.findElement(By.name("cost")).clear();
    driver.findElement(By.name("cost")).sendKeys("500");
    Thread.sleep(4000);
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    Thread.sleep(4000);
    driver.findElement(By.cssSelector("input.btn.btn-danger")).click();
    Thread.sleep(4000);
  }

}
