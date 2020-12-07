package nPackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TakesSnapShot {

	public static void main(String[] args) throws IOException  {
		
		//web driver setup
		//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ahnaf\\eclipse-workspace\\Selenium\\drivers\\geckodriver.exe");

		//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		//WebDriver driver = new FirefoxDriver();
		
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

        
		try {		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ma");
		 System.err.println("Enter lastName successfully");
		
		}catch(Exception e) {
		  System.err.println("LastName not enter  successfully");
		
		} finally {
		
		//take snapshot
	       File  src = driver.getScreenshotAs(OutputType.FILE);
		   File dest = new File ("C:\\SeleniumSoft\\Desktop\\snaps\\img.png");  
		
		//the  path  where it  store  after  move
		 File dest1 = new File("./snap/image.png");		 
		 FileUtils.copyFile(src, dest);     //moving file source to dest
		}
		
		//click  create lead
		driver.findElement(By.name("submitButton")).click();
		
		 //driver.close(); 
		
		
	

	}

}
