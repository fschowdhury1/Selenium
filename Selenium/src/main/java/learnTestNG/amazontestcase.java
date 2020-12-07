package learnTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class amazontestcase {

	//public static void main(String[] args) {
	
	@Test
	public void Amazontestcase() {
    
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver.exe");	

		WebDriver driver=new ChromeDriver();

		//get url 
		driver.get("https://www.amazon.ca/Best-Sellers-generic/zgbs/?ref_=nav_cs_bestsellers");

		//window maximize
		driver.manage().window().maximize();

		//wait time
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		//login 
		//driver.findElement(By.className("nav-a")).sendKeys("Best Sellers");
        
        
		driver.findElement(By.linkText("Deals Store")).click();

		driver.findElement(By.linkText("New Releases")).click();

		driver.findElement(By.linkText("Customer Service")).click();

		driver.findElement(By.linkText("Electronics")).click();

		driver.findElement(By.linkText("Computers")).click();

		driver.findElement(By.linkText("Coupons")).click();

		//driver.close();
	}
}

