import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindow {

	public static void main(String[] args) {
		

		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com");
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		System.out.println(driver.getPageSource().contains("Opening a"));
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> ids = driver.getWindowHandles();
		java.util.Iterator<String> it = ids.iterator();
		
		String parent =	it.next();
		String child1 =	it.next();
	  
	    driver.switchTo().window(child1);
	    System.out.println("New Window");
				
	}
}
