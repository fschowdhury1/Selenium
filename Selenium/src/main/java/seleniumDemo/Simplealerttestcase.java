package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simplealerttestcase {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	//get url
	driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
	
	
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	//submit
	driver.findElement(By.xpath("//input[@id=\"searchBtn\"]")).click();
	
	Alert simplealert = driver.switchTo().alert();
	System.out.print(simplealert);
	driver.switchTo().alert().accept();
	//driver.close();
	
	
	
	
	
	
	
	

	}

}
