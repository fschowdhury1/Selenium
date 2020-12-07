package wrapper2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateLead3 extends ProjectSpecificWrapper {
	

		
				
	    @Test(dataProvider="getData")
	    
		public void CreateLead(String cName,String fName, String lName) {
	    	
	    
	   //click leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//click create lead	
		driver.findElement(By.linkText("Create Lead")).click();
		
		//enter company name 
		//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		//enter first name 
		//driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hema");
		 
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		
        //enter last name
		// driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ma");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);

		
		//close driver
		//driver.close();
	}

}
