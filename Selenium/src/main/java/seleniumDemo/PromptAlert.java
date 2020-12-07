package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//get url
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	
	driver.manage().window().maximize();	
		
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
		
	driver.switchTo().frame("iframeResult");	
		
    driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
	Alert alert=driver.switchTo().alert();
	
	Thread.sleep(2000);	
	alert.getText();	
	alert.sendKeys("my name is kanon");	
	alert.accept();	
	System.out.println();
	

	}

}
