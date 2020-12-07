package snapshot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion {

	public static void main(String[] args) {
		
		
		//web driver setup
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		//get url
		driver.get("https://www.google.com/");
		
		//window maximize
		driver.manage().window().maximize();

		//wait time
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
       //get title
		String title = driver.getTitle();
	    System.out.println(title);
		
		Assert.assertEquals(title, "Google");
		Assert.assertEquals(title, "Google","Asserting the title");
		
		boolean searchBox = driver.findElement(By.name("q")).isDisplayed();
		
		Assert.assertTrue(searchBox, "verify if the searchbox is displayed");
		
       // driver.close();
        
	}

}
