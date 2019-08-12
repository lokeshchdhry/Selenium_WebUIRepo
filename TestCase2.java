import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {
	public static void main(String[] args) {
		
	 System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.23.0-win64\\geckodriver.exe");
     WebDriver driver = new FirefoxDriver();
	driver.get("http://google.com");
//	driver.findElement(By.xpath("//div[@class='RNNXgb']/div[2]/div/input")).sendKeys("Hello");

    System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	
	}
}
