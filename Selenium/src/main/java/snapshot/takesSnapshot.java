package snapshot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class takesSnapshot {

public static void main(String[] args) {
		
		
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\ahnaf\\eclipse-workspace\\Selenium\\drivers\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\SeleniumSoft\\geckodriver.exe");

	   FirefoxDriver driver = new FirefoxDriver();
	
	
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
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");

	//enter first name 
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hema");		
		
		
		
		
		
		
		
    

	}

}
