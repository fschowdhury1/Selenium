package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert2 {

	public static void main(String[] args) {
		

		//WebDriver Setup
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//get url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
		//window maximize
		driver.manage().window().maximize();
		
		
		
		//Wait Time
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.className("inputLogin")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		
		driver.findElement(By.className("decorativeSubmit")).click();  
		
		
		//CRM/SFA click 	 
	 
		driver.findElement(By.linkText("CRM/SFA")).click();
	     
	     
	    // Create lead
	     driver.findElement(By.linkText("Create Lead")).click();
	     
	     //merge lead
		driver.findElement(By.linkText("Merge Leads")).click();
		//merge
		driver.findElement(By.linkText("Merge")).click();
		
		//switching to alert
		String confirmationAlert=driver.switchTo().alert().getText();
		
		System.out.print(confirmationAlert);
		
		
		driver.switchTo().alert().dismiss();
		
		
		
		
		
		
		
		
		
		
		


	}

}
