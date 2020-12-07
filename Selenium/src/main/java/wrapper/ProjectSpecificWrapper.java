package wrapper;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificWrapper {

   public ChromeDriver driver;
   

 @BeforeMethod	
 public void login() {
	
	System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver.exe");	

	 driver = new ChromeDriver();
   
     
	//load URL
	driver.get("http://leaftaps.com/opentaps");

	//maximize
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	//Enter Username 
	driver.findElementById("username").sendKeys("DemoSalesManager");

	//Enter Password 
	driver.findElementById("password").sendKeys("crmsfa");

	// Click Login Button 
	driver.findElementByClassName("decorativeSubmit").click();
 
	// click crm.sfa link
	driver.findElementByLinkText("CRM/SFA").click();
}


   @AfterMethod
   public void closeBrowser(){
	driver.close();
}



}


