package fiveTestCases5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class CreateLead {

	public static void main(String[] args) {



		//web driver setup
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver.exe");
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

		//drop down choose source
		WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd1=new Select(drop1);
		dd1.selectByVisibleText("Word of Mouth");
		dd1.selectByIndex(12);
		dd1.selectByValue("LEAD_WORDOFMOUTH");

		//enter last name local    
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ma");

		//enter Salutation	 
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("salutation");

		//enter Title 
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Ms"); 

		//enter Annual Revenue	 
		driver.findElement(By.name("annualRevenue")).sendKeys("Ar"); 

		//drop down Industry 
		WebElement drop2 = driver.findElement(By.id("createLeadForm_industryEnumId")); 
		Select dd2=new Select(drop2);
		dd2.selectByVisibleText("Computer Software");
		dd2.selectByIndex(3);
		dd2.selectByValue("IND_SOFTWARE");

		//drop down ownership 
		WebElement drop3 = driver.findElement(By.name("ownershipEnumId")); 
		Select dd3=new Select(drop3); 
		dd3.selectByIndex(6); 
		dd3.selectByValue("OWN_PUBLIC_CORP"); 
		dd3.selectByVisibleText("Public Corporation"); 

		//enter SIC Code	 
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("Code"); 

		//enter Description  
		driver.findElement(By.name("description")).sendKeys("TCS");

		//enter Important Note	
		driver.findElement(By.name("importantNote")).sendKeys("Note");

		//enter Country Code	
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("Code1");

		//enter Area code 
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("None");

		//enter Extension	  
		driver.findElement(By.name("primaryPhoneExtension")).sendKeys("Number"); 

		//enter E-Mail Address	  
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com"); 

		//enter To name  
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Hema");

		//enter Address Line 1	 
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Abc");

		//enter City
		driver.findElement(By.name("generalCity")).sendKeys("Xyz"); 

		//enter Zip/Postal Code	 
		driver.findElement(By.name("generalPostalCode")).sendKeys("75061");

		//enter Zip/Postal Code Extension	   
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("000");

		//enter Parent Account	
		driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("Xyz");

		//enter Last name	
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ma");

		//drop down Marketing Campaign	
		WebElement drop4 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd4=new Select(drop4);
		dd4.selectByIndex(5);
		dd4.selectByValue("DEMO_MKTG_CAMP");
		dd4.selectByVisibleText("Demo Marketing Campaign");

		//enter Last Name (Local)	
		driver.findElement(By.name("lastNameLocal")).sendKeys("Ma"); 

		//enter Birth Date	 
		driver.findElement(By.name("birthDate")).sendKeys("birth"); 

		//enter Department
		driver.findElement(By.name("departmentName")).sendKeys("MKT");

		//drop down Preferred Currency	
		WebElement drop5 = driver.findElement(By.name("currencyUomId"));
		Select dd5=new Select(drop5);
		dd5.selectByIndex(14);
		dd5.selectByValue("BDT");
		dd5.selectByVisibleText("BDT - Bangladesh Taka");

		//enter Number Of Employees	 
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");

		//enter Ticker Symbol	
		driver.findElement(By.name("tickerSymbol")).sendKeys("Xyz");

		//enter Phone Number	 
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("123456");

		//enter Person to Ask For	
		driver.findElement(By.name("primaryPhoneAskForName")).sendKeys("Hi");   

		//enter Web Url	  
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("google.com"); 

		// enter Attention Name	 
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Hema"); 

		//enter Address Line 2	
		driver.findElement(By.name("generalAddress2")).sendKeys("Abc");

		//State/Province	 
		WebElement drop6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")); 
		Select dd6=new Select(drop6); 
		dd6.selectByIndex(4);
		dd6.selectByValue("AZ"); 
		dd6.selectByVisibleText("Arizona");

		//Country 
		WebElement drop7 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dd7=new Select(drop7);
		dd7.selectByIndex(4);
		dd7.selectByValue("ASM");
		dd7.selectByVisibleText("American Samoa");  

		//click create Lead  
		driver.findElement(By.name("submitButton")).click();



	}   



}


