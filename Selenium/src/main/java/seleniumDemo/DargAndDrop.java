package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DargAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
     System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	
	driver.get("https://jqueryui.com/droppable/");	
		
     driver.manage().window().maximize();	
		
     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
     
	//Enter into frame
	driver.switchTo().frame(0);	
		
	WebElement Dragable = driver.findElement(By.id("draggable"));	
	WebElement Dropable = driver.findElement(By.id("droppable"));	
	Actions action=new Actions(driver);	
	
	Thread.sleep(3000);
	action.dragAndDrop(Dragable, Dropable).perform();	
	action.clickAndHold(Dragable).moveToElement(Dropable).release().build().perform();	
	
	//switch back from frame	
	driver.switchTo().defaultContent();
	
	//click selectable
	driver.findElement(By.linkText("Selectable")).click();
	
	
	
		
		
		
		

	}

}
