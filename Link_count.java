import java.util.Set;
import javax.swing.text.html.HTMLDocument.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_count {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Software\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");

		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));// Limiting webdriver scope		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//3-
		WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		
		//4- click on each link in the coloumn and check if the pages are opening-
		
		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
		{			
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);			
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);		
			Thread.sleep(5000L);			
		}
		
		// opens all the tabs
		
		 Set<String> abc=driver.getWindowHandles();//4
		 
		 java.util.Iterator<String> it = abc.iterator();
		 
		  while(it.hasNext())
		{		
			  
		   driver.switchTo().window(it.next());
		   System.out.println(driver.getTitle());	
		   
		}		
	}
}



////EntirePageS Links	
//		System.out.println(driver.findElements(By.tagName("a")).size());	
//
////Footer Links		
//		WebElement footerScope = driver.findElement(By.id("gf-BIG"));	
//		System.out.println(footerScope.findElements(By.tagName("a")).size());		
//		
//
////Column Links
//		WebElement columnScope = footerScope.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
//		System.out.println(columnScope.findElements(By.tagName("a")).size());
//		
//		
//		for(int i = 1; i < columnScope.findElements(By.tagName("a")).size(); i++) {
//						
//			String clickOnLinks = Keys.chord(Keys.CONTROL , Keys.ENTER);
//			columnScope.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinks);
//			
//		
//		
//		}	
//			
//		
//	}
//}
