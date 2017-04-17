package assign4;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class manage_victimactivity_fjava extends commontest_firefox {



  @Test
  public void testVictimactivity() throws Exception {
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
    driver.findElement(By.linkText("Victims Activity Appointment")).click();
    Thread.sleep(4000);
    driver.findElement(By.linkText("Create a New Activity Appointment")).click();
    Thread.sleep(4000);
    new Select(driver.findElement(By.name("activity_id"))).selectByVisibleText("Help the patient offering information and advice individually.");
    Thread.sleep(4000);
    new Select(driver.findElement(By.name("volunteer_id"))).selectByVisibleText("Angel Chen");
    Thread.sleep(4000);
    new Select(driver.findElement(By.xpath("(//select[@name='activity_id'])[2]"))).selectByVisibleText("2015-06-01 09:00:00");
    Thread.sleep(4000);
    new Select(driver.findElement(By.xpath("(//select[@name='activity_id'])[3]"))).selectByVisibleText("2015-06-01 10:00:00");
    Thread.sleep(4000);
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("(//a[contains(text(),'Show')])[3]")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Back")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[3]")).click();
    Thread.sleep(4000);
    new Select(driver.findElement(By.name("activity_id"))).selectByVisibleText("Discuss about the experience and share the information");
    Thread.sleep(4000);
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    
    Thread.sleep(4000);
    driver.findElement(By.xpath("(//input[@value='Delete'])[3]")).click();
    Thread.sleep(4000);
  }


}

