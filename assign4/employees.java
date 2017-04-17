
package assign4;

import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import com.opencsv.CSVReader;




public class Location {
	private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "http://necaresys.herokuapp.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

	

	String csvpath= "C:\\Users\\selene\\Desktop\\locations.csv";
	private CSVReader reader;
	  @Test
public void testlocation() throws IOException, InterruptedException{
		  
		  reader = new CSVReader(new FileReader(csvpath));
		  String [] csvCell;
		  
		  driver.get(baseUrl + "/");
		    driver.findElement(By.linkText("Login")).click();
		    driver.findElement(By.id("email")).clear();
		    driver.findElement(By.id("email")).sendKeys("clama@unomaha.edu");
		    driver.findElement(By.id("password")).clear();
		    driver.findElement(By.id("password")).sendKeys("secrets");
		    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
		    driver.findElement(By.linkText("Manage Locations")).click();
		   
		  while ((csvCell = reader.readNext()) != null) {   
			  driver.findElement(By.linkText("Create New Location")).click();
			   String Locationcode = csvCell[0];
			   String Name = csvCell[1];
			   String Street_Address = csvCell[2];
			   String City = csvCell[3];
			   String State = csvCell[4];
			   String Zip_Code = csvCell[5];
			   String Notes = csvCell[6];
			   
			   driver.findElement(By.name("location_code")).clear();
			   driver.findElement(By.name("location_code")).sendKeys(Locationcode);
			   driver.findElement(By.name("name")).clear();
			   driver.findElement(By.name("name")).sendKeys(Name);
			   driver.findElement(By.name("street_address")).clear();
			   driver.findElement(By.name("street_address")).sendKeys(Street_Address);
			   driver.findElement(By.name("city")).clear();
			   driver.findElement(By.name("city")).sendKeys(City);
			   driver.findElement(By.name("state")).clear();
			   driver.findElement(By.name("state")).sendKeys(State);
			   driver.findElement(By.name("zip")).clear();
			   driver.findElement(By.name("zip")).sendKeys(Zip_Code);
			   driver.findElement(By.name("notes")).clear();
			   driver.findElement(By.name("notes")).sendKeys(Notes);
			    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
			   
			    
			  
			    driver.switchTo().defaultContent();
			   //driver.switchTo().alert().accept();
			    
			  } 
		  Thread.sleep(6000);
	  }
	
@After
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
