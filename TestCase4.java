import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("Abcdffytfd");
		
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Abcdffytfd");
		//driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("58787696gyuvjh");
		
	}
}
