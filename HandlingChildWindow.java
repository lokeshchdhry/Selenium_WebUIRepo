import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildWindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://support.google.com/mail/answer/56256?hl=en");

		driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div[1]/article/section/div/p[2]/a")).click();    //  int count = ids.size();
		
        Set<String> ids = driver.getWindowHandles(); 
        
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        
        driver.switchTo().window(childId);
        System.out.println("After switching");
        
	}
}


