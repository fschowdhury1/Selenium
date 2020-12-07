package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRAME {

	public static void main(String[] args) {
		
		
		
 System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();	
		
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");	
		
    driver.manage().window().maximize();	
  	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
	
	//frame locator
	//driver.switchTo().frame(7);
	//driver.switchTo().frame("iframeResult");	
	driver.switchTo().frame (driver.findElement(By.xpath("//iframe[@allowfullscreen=\"true\"]")));
	
	//first name	
	  driver.findElement(By.xpath("//input[@value=\"John\"]")).clear();
	  driver.findElement(By.xpath("//input[@value=\"John\"]")).sendKeys("kanon");
	  
	 //last name 
      driver.findElement(By.xpath("//input[@value=\"Doe\"]")).clear();
	  driver.findElement(By.xpath("//input[@value=\"Doe\"]")).sendKeys("chy");
	  
	 //submit 
	 // driver.findElement(By.xpath("//input[@value=\"Submit\"]")).click();	
	
	 // driver.close();
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
