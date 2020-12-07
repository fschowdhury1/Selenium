package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
			  		      	
		   //click on email
		    driver.findElement(By.xpath("//span[text()='Email']")).click();
		    
		   //enter email
		   driver.findElement(By.xpath("//input[@name=\"emailAddress\"]")).sendKeys("hema@gmail.com");
		   
		  //click find leads button
		 // driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		  driver.findElement(By.linkText("Find Leads")).click();
		  
		//capture name of first resulting lead
		 String firstResultingLead = driver.findElement(By.xpath("(//a[@href=\"/crmsfa/control/viewLead?partyId=10071\"])[1]")).getText();		
		  //String  firstResultingLead= driver.findElement(By.xpath("(//a[@href=\"/crmsfa/control/viewLead?partyId=10036\"])[5]")).getText();
		   System.out.println(firstResultingLead);
		
		//click first resulting lead	   
	     //driver.findElement(By.xpath("(//a[@href=\"/crmsfa/control/viewLead?partyId=10036\"])[5]")).click();
	      driver.findElement(By.xpath("(//a[@href=\"/crmsfa/control/viewLead?partyId=10071\"])[1]")).click();
	     
		//click duplicate lead
		 driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		 //driver.findElement(By.partialLinkText("Duplicate Lead")).click();
		 
		//verify the title as duplicate lead
		  String Title = driver.getTitle();
		  System.out.println(Title);
		  if(Title.contains("Duplicate Lead")) {
			System.out.println("Title Matched");  
		  } else {
			System.out.println("Title not matched");  
		  }
		  
		 //click create lead
		  driver.findElement(By.xpath("//input[@value=\"Create Lead\"]")).click();
		  
		//confirm the duplicate lead name is same as capture name
		 String DuplicateLeadName = driver.findElement(By.xpath("//span[@id=\"viewLead_companyName_sp\"]")).getText();
		 System.out.println(DuplicateLeadName);
		 
		 if(DuplicateLeadName.contains("Mark")){			 
		 
		 System.out.println("DuplicateLead name matched");
		 } else {
		 System.out.println("Not matched");
		 }

		//close the browser
		//driver.close();
								
						
}	


	}


