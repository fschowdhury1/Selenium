package wrapper2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class editLead extends ProjectSpecificWrapper {
	
	        @Test
	        public void editLead() {
	        	
				
			
		     //click leads link
			 driver.findElement(By.linkText("Leads")).click();
					
			//click find leads link
			driver.findElement(By.linkText("Find Leads")).click();
			
          //enter Lead ID
          driver.findElement(By.xpath("//input[@name=\"id\"]")).sendKeys("editLead");
            
	       //enter first name
		    driver.findElement(By.xpath("(//input[@name=\"firstName\"])[3]")).sendKeys("Hema");
			    
		    //click find Leads button
			 driver.findElement(By.linkText("Find Leads")).click();

		
	       //close browser
		    driver.close();
		    
	}	
		
}
