package learnTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogingTest {

	//public static void main(String[] args) {
	
	@Test
	public void logingTest() {
		
		
		//Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\\\SeleniumSoft\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Load url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//window maximize
		driver.manage().window().maximize();
		
		//Wait Time
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//enter username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click CRM/SFA 
		driver.findElement(By.linkText("CRM/SFA")).click();
		
	    //Close Browser
		//driver.close();
		

	}

}
