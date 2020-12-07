package nPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser_GoogleChrome {

	public static void main(String[] args) {
		
		//Launch chrome browser		
		//System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver.exe");		
		//WebDriver driver = new ChromeDriver();	
		
		//Launch Firefox browser
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ahnaf\\eclipse-workspace\\Selenium\\drivers\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\SeleniumSoft\\geckodriver.exe");
	    //FirefoxDriver driver = new FirefoxDriver();
		WebDriver driver = new FirefoxDriver();
				
		//Maximize Window		
		driver.manage().window().maximize();		
				
       //Load url
		driver.get("http://google.com");
		
		//get title of the page
		 System.err.println(driver.getTitle());
		
		//click About
		driver.findElement(By.linkText("About")).click();
		
		//click products
		 driver.findElement(By.xpath("//a[@title=\"Products\"]")).click();
		
		
		

	}

}
