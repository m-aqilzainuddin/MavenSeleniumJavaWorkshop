package workshopday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifySuccessLogin {

	public static void main (String [] args) {

		ChromeOptions options = new ChromeOptions();
//		Disable option notification
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64_2\\chromedriver-win64\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("mrditto5ed@gmail.com");
//		WebElement email= driver.findElement(By.id("email"));
//		email.sendKeys("mrditto5ed@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("ForTesting");
		driver.findElement(By.name("login")).click();
		String verifyHomePage = driver.findElement(By.xpath("//span[contains(text(),'MrDitto ')]")).getText();
		
	
		
		if(verifyHomePage.contains(verifyHomePage)) {
			System.out.println("Successfully reach homepage");
		}else
			System.out.println("Unable to reach homepage");	
	}
}
