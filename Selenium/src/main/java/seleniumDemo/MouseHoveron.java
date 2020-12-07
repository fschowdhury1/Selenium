package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoveron {

public static void main(String[] args) throws InterruptedException { 

    System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
   driver.get("http://mrbool.com/"); 
    
   driver.manage().window().maximize();	
		
   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
		
    WebElement content = driver.findElement(By.className("menulink"));
    
    Actions action=new Actions(driver);
    
    Thread.sleep(3000);
    action.moveToElement(content).perform();
    
    //Articles
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[text()='Articles']")).click();
    
   // driver.close();
    

	}

}
