
package assign4;

import java.io.FileReader;
import java.io.IOException;
import org.junit.*;
import org.openqa.selenium.*;



import com.opencsv.CSVReader;




public class create_location_fjava extends commontest_firefox {

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
	

	
	
}
