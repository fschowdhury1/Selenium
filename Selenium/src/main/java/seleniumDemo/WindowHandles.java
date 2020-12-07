package seleniumDemo;



import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args)  {
		
	System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver.exe");	
		
	 WebDriver driver=new ChromeDriver();
	
	  //get url 
	 driver.get("https://www.w3schools.com/jsref/met_win_open.asp");           

     
     //window maximize
     
     driver.manage().window().maximize();
     
     //wait time
     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	
	driver.findElement(By.partialLinkText("Try it Yourself")).click();
	
	String currentwindow = driver.getWindowHandle();	
	System.out.println(currentwindow);	
		
	 Set<String> allwin = driver.getWindowHandles();	
	//System.out.println(allWin);
		
	for( String eachwin : allwin) {	
	System.out.println(eachwin);	
		

	
	driver.switchTo().window(eachwin);
		
	System.out.println(driver.getTitle());	
		
	}
	
	}	
		
}

	


