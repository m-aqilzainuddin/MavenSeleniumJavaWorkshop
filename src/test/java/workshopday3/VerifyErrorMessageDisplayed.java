package workshopday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessageDisplayed {
	public static void main (String [] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64_2\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("asdafasdfasdgasd");
		driver.findElement(By.id("pass")).sendKeys("asdasf");
		driver.findElement(By.name("login")).click();
		
		//storing element
		String errorMsg = driver.findElement(By.className("_9ay7")).getText();
		
		String errorMsg1 = driver.findElement(By.xpath("*//div[contains(text(),'The email address')]")).getText();
		System.out.println(errorMsg);
		System.out.println();
		if(errorMsg1.contains("The email address")) {
			System.out.println("The error message is correct");
		}else
			System.out.println("The error message is incorrect");
	}
}
