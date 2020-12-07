package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {  
	System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	WebElement rightClick = driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
	Actions action=new Actions(driver);
	action.contextClick(rightClick).perform();
	Thread.sleep(3000);
	
	//driver.close();
	
	
	}
}
