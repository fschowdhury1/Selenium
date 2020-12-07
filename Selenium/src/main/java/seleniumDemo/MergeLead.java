package seleniumDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		
		

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
						
		     //click merge Lead
		     driver.findElement(By.linkText("Merge Leads")).click();
		      
		     //click on icon near from lead
		      driver.findElement(By.xpath("(//img[@alt=\"Lookup\"])[1]")).click();
		      String firstWin = driver.getWindowHandle();
		      
		     //move to new window
		      Set<String>allWin= driver.getWindowHandles();
		      System.out.println(allWin);
		      for(String eachWin:allWin) {
		      driver.switchTo().window(eachWin);
		      System.out.println(driver.getTitle());
		      }
		      
		     //enter lead id
		      driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("10163");
		      
		     //click find lead button
		      driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		      
		      Thread.sleep(4000);
		      
		    //click first resulting lead
		    // String firstName = driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).getText();
			 String firstName= driver.findElement(By.xpath("(//a[@href=\"/crmsfa/control/viewLead?partyId=10036\"])[5]")).getText();
		  
               System.out.println(firstName);
		      //driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click(); 
              driver.findElement(By.xpath("(//a[@href=\"/crmsfa/control/viewLead?partyId=10036\"])[5]")).click();
           
               
		    //switch back to primary window
		      driver.switchTo().window(firstWin);
		      
		    //click on icon near to lead
		      driver.findElement(By.xpath("(//img[@alt=\"Lookup\"])[2]")).click();
		      
		  /*  //move to new window
		      Set<String>allWin1 = driver.getWindowHandles();
		      System.out.println(allWin1);
		      for(String eachWin1:allWin1) {
		      driver.switchTo().window(eachWin1); 
		      System.out.println(driver.getTitle());
		      }
		      
		      //enter lead id
		      driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("10000");
		      
		     //click find leads button
		      driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		      
		     //click first resulting lead
		      String firstName1 = driver.findElement(By.xpath("(//a[@class=\"linktext\"])[1]")).getText();
		      System.out.println(firstName1);
		      driver.findElement(By.xpath("(//a[@class=\"linktext\"])[1]")).click();
		      
		     //switch back to primary window
		      driver.switchTo().window(firstWin);
		      
		     //click merge
		      driver.findElement(By.linkText("Merge Leads")).click();
		      
		     //accept alert
		      String alertMessage = driver.switchTo().alert().getText();
		      System.out.println(alertMessage);
		      driver.switchTo().alert().accept(); */
	           
		     //click find leads
		     //enter from lead id
		     //click find leads
		     //verify error msg
		     //close the browser
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
                        