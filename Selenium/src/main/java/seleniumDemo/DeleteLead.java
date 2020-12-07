package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		
		
		   //Launch chrome browser		
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver.exe");		
			WebDriver driver=new ChromeDriver();		

			//Load url		
			driver.get("http://leaftaps.com/opentaps");		

			//Maximize window		
			driver.manage().window().maximize();	

			//implicitly wait	
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       
	    
			//enter username
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

			//enter password
			driver.findElement(By.id("password")).sendKeys("crmsfa");

			//Click login
			driver.findElement(By.className("decorativeSubmit")).click();

			//Click CRM/SFA 
			driver.findElement(By.linkText("CRM/SFA")).click();

		      //click leads link
			  driver.findElement(By.linkText("Leads")).click();
											  
			 //click Find Leads
			  driver.findElement(By.linkText("Find Leads")).click();
			  		                         		
		     //click on phone
		     driver.findElement(By.xpath("//span[text()='Phone']")).click();
		    		     		
		   //enter phone number (area code)
		     driver.findElement(By.xpath("//input[@name=\"phoneAreaCode\"]")).sendKeys("123");
				
           //enter phone number
		    driver.findElement(By.xpath("//input[@name=\"phoneNumber\"]")).sendKeys("6666666");
		
		   //click find Leads button
		  //driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		    driver.findElement(By.linkText("Find Leads")).click();
		    
		  //capture lead id of first resulting lead
			//String leadId = driver.findElement(By.xpath("(//a[@href=\"/crmsfa/control/viewLead?partyId=10057\"])[1]")).getText();
		    String leadId= driver.findElement(By.xpath("(//a[@href=\"/crmsfa/control/viewLead?partyId=10036\"])[5]")).getText();
			System.out.println(leadId);
			
            //click first resulting lead		
			//driver.findElement(By.xpath("(//a[@href=\"/crmsfa/control/viewLead?partyId=10057\"])[1]")).click();
			   driver.findElement(By.xpath("(//a[@href=\"/crmsfa/control/viewLead?partyId=10036\"])[5]")).click();	
			   
		   //click Delete
		   driver.findElement(By.linkText("Delete")).click();
		   // driver.findElement(By.xpath("//a[text()='Delete']")).click();
		  
		 //click find leads
		  driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		  
		 //enter captured lead id
		  driver.findElement(By.xpath("//input[@name=\"id\"]")).sendKeys("10097");
		  
		 //click find leads button
		  driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		  
		//verify error msg
		  String errorMsg = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		  System.out.println(errorMsg);
		 if(errorMsg.contains("No records")) { 
		  System.out.println("ErrorMsg is matched");
		 } else {
		    System.out.println("Not matched");
		 }
		 
		//close the browser
		  //driver.close();
		
		
		

	}

}
