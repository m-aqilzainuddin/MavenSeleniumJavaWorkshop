package workshopday3;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropDownElement {
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64_2\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("CONGO");	
	}
}
