package workshopday3;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMultipleElements {
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64_2\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		Select list of elements (e.x: checkerbox and radio button)
		driver.get("https://demo.guru99.com/test/radio.html");
		List<WebElement> list = driver.findElements(By.name("webform"));
		for(WebElement i:list) {
			i.click();
		}	
	}
}
