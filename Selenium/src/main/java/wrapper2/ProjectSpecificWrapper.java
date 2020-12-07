package wrapper2;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificWrapper {

   public ChromeDriver driver;
   
 @Parameters({"url","uname","pwd"})
 @BeforeMethod	
 public void login(String url,String uname,String pwd) {
	
	System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver.exe");	

	 driver = new ChromeDriver();
   
     
	//load URL
	//driver.get("http://leaftaps.com/opentaps");
    driver.get(url);
    
	//maximize
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	

	//Enter Username 
	//driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("username").sendKeys(uname);

	//Enter Password 
	//driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementById("password").sendKeys(pwd);

	// Click Login Button 
	driver.findElementByClassName("decorativeSubmit").click();
 
	// click crm.sfa link
	driver.findElementByLinkText("CRM/SFA").click();
}


   @AfterMethod
  // public void closeBrowser(){
	//driver.close();
	
  // }	
   
 @DataProvider
  public String[] [] getData(){	
  	
  String[][] data = new String[2][3];
  
 data[0][0]= "TCS";
 data[0][1]= "Lipa"; 	
 data[0][2] = "chy1";
 
data[1][0]=	"ABC";
data[1][1]= "Tamim";
data[1][2]="chy2";

  return data;

}

}




