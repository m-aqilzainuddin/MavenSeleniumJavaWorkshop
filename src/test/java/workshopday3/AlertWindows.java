package workshopday3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindows {
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64_2\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		//Action for alert window
		driver.get("https://demo.guru99.com/test/delete_customer.php");			
		    	
	    driver.findElement(By.name("cusid")).sendKeys("53920");					
	    driver.findElement(By.name("submit")).submit();			
	    		
	    // Switching to Alert        
	    Alert alert = driver.switchTo().alert();		
	    		
	    // Capturing alert message.    
	    String alertMessage= driver.switchTo().alert().getText();		
	    		
	    // Displaying alert message		
	    System.out.println(alertMessage);	
	    Thread.sleep(5000);
	    		
	    // Accepting alert		
	    alert.accept();	
	}
}	
