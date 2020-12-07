package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KEYCONTROL {

	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	   driver.get("https://jqueryui.com/selectable/");
	   
       driver.manage().window().maximize();	
			  	
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
		
		driver.switchTo().frame(0);
		
		WebElement item1= driver.findElement(By.linkText("Item 1"));
		
		 WebElement item2 = driver.findElement(By.linkText("Item 2"));
		
		WebElement item4 = driver.findElement(By.linkText("Item 4"));
		
		WebElement item6 = driver.findElement(By.linkText("Item 6"));
		
		Actions action=new Actions(driver);
		
		action.keyDown(Keys.CONTROL).click(item1).click(item2).click(item4).click(item6).release().perform();
		
		
		
		
		

	}

}
