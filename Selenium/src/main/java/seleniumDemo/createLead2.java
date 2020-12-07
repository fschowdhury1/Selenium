package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createLead2 {

	public static void main(String[] args) {
		
	

		//web driver setup
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();


		//Get url
		driver.get("http://leaftaps.com/opentaps/control/main");


		//window maximize
		driver.manage().window().maximize();

		//wait time
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        //enter username
		driver.findElement(By.className("inputLogin")).sendKeys("DemoSalesManager");
		
		//enter password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");

        //click login
		driver.findElement(By.className("decorativeSubmit")).click();  

		//click CRM/SFA  	 
		driver.findElement(By.linkText("CRM/SFA")).click();

		//click Leads link 
		driver.findElement(By.linkText("Leads")).click();

		//click Create lead
		driver.findElement(By.linkText("Create Lead")).click();

		//enter company name 
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");

		//enter first name 
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hema");
		
        //enter last name
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ma");
		 
		//enter Title
		 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Ms");
		 
		 //enter description
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("TCS");
		 
		 //enter country code
		 driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("code1");
		 
		 //enter department
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("MKT");
		 
		 //enter number of employee
		  driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
		 
		 //enter web url
		 driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("google.com");
		
		 //enter zip/postal code
		  driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("75061");
		  
		 //enter phone number
		 driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("123456");
		 
		 //enter email address
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		
		//click create Lead
		driver.findElement(By.name("submitButton")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
