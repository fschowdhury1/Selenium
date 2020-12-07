package snapshot;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {

	public static void main(String[] args) {
		
		
		
		//web driver setup
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
   

		//Get url
		driver.get("http://leaftaps.com/opentaps/control/main");
         

		//window maximize
		driver.manage().window().maximize();

		//wait time
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        //enter username
		driver.findElement(By.className("inputLogin")).sendKeys("DemoSalesManager");
		
		//enter password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");

        //click login
		driver.findElement(By.className("decorativeSubmit")).click();  

		//click CRM/SFA  	 
		driver.findElement(By.linkText("CRM/SFA")).click();

		//click Leads link 
		driver.findElement(By.linkText("Leads")).click();
		
		//find all link
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		 System.out.println(linkList.size());
		
	  /*//linkText from all link	
		for(int i =0; i <linkList.size(); i++) {
		String Linklist = linkList.get(i).getText();
        System.out.println(Linklist);
		}*/
		
		//find all div tag
		List<WebElement> allDivTag = driver.findElements(By.tagName("div"));
		 System.out.println(allDivTag.size());
		
		//find all input tag
		 List<WebElement> allInputTag = driver.findElements(By.tagName("input"));
		  System.out.println(allInputTag.size());
		  
		 //find all td tag 
		  List<WebElement> allTdTag = driver.findElements(By.tagName("td"));
		   System.out.println(allTdTag.size());
		  
		  //find all tr tag 
		    List<WebElement> allTrTag = driver.findElements(By.tagName("tr"));
		     System.out.println(allTrTag.size());
		  
		  //find all li tag
		   List<WebElement> allLiTag = driver.findElements(By.tagName("li"));
		    System.out.println(allLiTag.size());
		    
		   //find all html tag 
		     List<WebElement> allHtmlTag = driver.findElements(By.tagName("html"));
		      System.out.println(allHtmlTag.size());
		      
		    //find all script tag  
		      List<WebElement> allScriptTag = driver.findElements(By.tagName("script"));
		       System.out.println(allScriptTag.size());		
		
		     
	

	}

}
