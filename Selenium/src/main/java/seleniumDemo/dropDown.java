package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

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
		
	//click create lead	
	driver.findElement(By.linkText("Create Lead")).click();
	
	//enter company name
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
    
    //enter first name
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hema");


	//enter source drop down
	WebElement source= driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select dd1=new Select(source);
    dd1.selectByVisibleText("Employee");
    dd1.selectByIndex(4);
    dd1.selectByValue("LEAD_EMPLOYEE");
     

	//drop down Industry	
	  WebElement Ind = driver.findElement(By.id("createLeadForm_industryEnumId"));	
	  Select dd2=new Select (Ind);
	  dd2.selectByVisibleText("Manufacturing");
	  dd2.selectByIndex(9);
	  dd2.selectByValue("IND_MANUFACTURING");
		
	//drop down ownership	
    WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
    Select dd3=new Select(ownership);
    dd3.selectByVisibleText("Public Corporation");
    dd3.selectByIndex(6);
    dd3.selectByValue("OWN_PUBLIC_CORP");
    
    //drop down marketing Campaign
      WebElement mktCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
      Select dd4= new Select(mktCampaign);
      dd4.selectByVisibleText("Demo Marketing Campaign");
      dd4.selectByIndex(5);
      dd4.selectByValue("DEMO_MKTG_CAMP");
      
     //drop down Preferred Currency 
      WebElement preferredCurrency= driver.findElement(By.id("createLeadForm_currencyUomId"));
      Select dd5=new Select(preferredCurrency);
      dd5.selectByVisibleText("BDT - Bangladesh Taka");
      dd5.selectByIndex(14);
      dd5.selectByValue("BDT");

      //drop down State/Province	
      WebElement sP = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
      Select dd6 = new Select(sP);
      dd6.selectByIndex(4);
      dd6.selectByValue("AZ"); 
      dd6.selectByVisibleText("Arizona");
     

      //drop down country
      WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
      Select dd7=new Select(country);
      dd7.selectByVisibleText("American Samoa");
      dd7.selectByIndex(4);
      dd7.selectByValue("ASM");
      
      
      
	}

}
