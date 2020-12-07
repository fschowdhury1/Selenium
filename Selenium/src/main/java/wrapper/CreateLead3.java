package wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateLead3 extends ProjectSpecificWrapper {

	

						
	
	    @Test
		public void logingTest() {
	    //enter username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		
	    //click CRM/SFA 
		driver.findElement(By.linkText("CRM/SFA")).click();
		
	   //click leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//click create lead	
		driver.findElement(By.linkText("Create Lead")).click();
		
		
		//close driver
		driver.close();
	}

}
