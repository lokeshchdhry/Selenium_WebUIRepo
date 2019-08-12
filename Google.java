/* OUTPUT
 * Starting ChromeDriver 2.45.615291 (ec3682e3c9061c10f26ea9e5cdcf3c53f3f74387) on port 45817
Only local connections are allowed.
Apr 16, 2019 3:25:09 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
invalid input Error captured : Test passed
 * 
 */



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws Exception {
	
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.id("identifierId")).sendKeys("shraddhamshete@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("123");
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content")).click();

		String actualError = driver.findElement(By.xpath("//div[@class='GQ8Pzc']")).getText();
		String expectederror = "Wrong password. Try again or click Forgot password to reset it.";
		
		driver.close();
		
		if (actualError.equals(expectederror)) {
			System.out.println("invalid input Error captured : Test passed");
		} else {
			System.out.println("valid input");
		}			   
			    
	}
}
