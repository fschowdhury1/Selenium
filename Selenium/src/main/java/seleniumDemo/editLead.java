package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class editLead {

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
			  		                         
			 //enter Lead ID
             driver.findElement(By.xpath("//input[@name=\"id\"]")).sendKeys("editLead");
             
	       //enter first name
		    driver.findElement(By.xpath("(//input[@name=\"firstName\"])[3]")).sendKeys("Hema");
			    
		    //click find Leads button
			 driver.findElement(By.linkText("Find Leads")).click();
	        //driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			 
		    //capture lead Id of first resulting lead
		    String leadId= driver.findElement(By.xpath("(//a[@href=\"/crmsfa/control/viewLead?partyId=10036\"])[5]")).getText();
		    System.out.println(leadId);
		    
		    //click first resulting Lead
		    driver.findElement(By.xpath("(//a[@href=\"/crmsfa/control/viewLead?partyId=10036\"])[5]")).click();
		    
		    //verify title of the page
		     String title = driver.getTitle();
		     System.out.println(title);
		     if(title.contains("View")) {
		    	System.out.println("Title matched"); 
		     }else {
		    	System.out.println("Not Matches"); 
		     }
		     
		   // click edit Lead
		   driver.findElement(By.linkText("Edit")).click();
	    
		   //change the company name 
		   driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("CTS");
		   
		   //click update
		    driver.findElement(By.xpath("//input[@value=\"Update\"]")).click();
		    
		   //confirm the changed name appears
		    String changedName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		    System.out.println(changedName);
		    if(changedName.contains("TCS")) {
		     System.out.println("Name is matched");			     
		    }else {
		    System.out.println("Not matched");	
		    }
		    //close the browser		    
		   // driver.close();
		   		    		   		    		    		    
		    
		    
	}		 
}
