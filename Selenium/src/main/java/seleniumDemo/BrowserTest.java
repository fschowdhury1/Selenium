package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) {

		//Launch chrome browser		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");		
		WebDriver driver=new ChromeDriver();

		//System.setProperty("webdriver.gecko.driver","C:\\SeleniumSoft\\geckodriver.exe");	
		//WebDriver  driver = new FirefoxDriver();

		//Load url		
		driver.get("http://leaftaps.com/opentaps");		

		//Maximize Window		
		driver.manage().window().maximize();		

		//Implicitly wait		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//Close driver
		//driver.close();

	}

}
