package assign4;




import org.junit.Test;
import org.openqa.selenium.*;


public class manage_activitytype_cjava extends commontest_chrome {

  @Test
  public void testActivitytype() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("secrets");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("clama@unomaha.edu");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.linkText("Manage Activities")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("Activity-Types Management")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("Create New Activity Type")).click();
    Thread.sleep(3000);
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Reach to");
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Reach to  Recovery");
    driver.findElement(By.name("description")).clear();
    driver.findElement(By.name("description")).sendKeys("Volunteer shares experience with someone who is facing diagnosis");
    driver.findElement(By.name("min_participants")).clear();
    driver.findElement(By.name("min_participants")).sendKeys("2");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("Show")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("Back")).click();
    driver.findElement(By.linkText("Edit")).click();
    Thread.sleep(3000);
    driver.findElement(By.name("description")).clear();
    driver.findElement(By.name("description")).sendKeys("Volunteer shares experience with someone who is facing diagnosis. Through this program, volunteer provides understanding and hope to individual.");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("input.btn.btn-danger")).click();
    Thread.sleep(4500);
  }

  
}

