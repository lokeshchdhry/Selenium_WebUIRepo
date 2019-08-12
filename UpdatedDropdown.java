
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UpdatedDropdown {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
		driver.get("https://book.spicejet.com/");
		driver.findElement(By.id("divpaxinfo")).click();
		
	//	Thread.sleep(2000L);
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		int i =1;
		for(i=1; i<5; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); 
		
	}
}
