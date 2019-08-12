import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_MultipleFrames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com");
		
//		driver.findElement(By.linkText("Nested Frames")).click();	
//		System.out.print("Total Frameset count : ");
//		System.out.println(driver.findElements(By.tagName("frameSet")).size());	
//		System.out.print("Total Frame count : ");
//		System.out.println((driver.findElements(By.tagName("frame")).size()));
//		driver.switchTo().frame(0);
//        driver.switchTo().frame(1);    
//        System.out.println(driver.getPageSource().contains("MIDDLE"));	
//        System.out.println(driver.findElement(By.xpath("//*[@id=\'content\']")).getText());
// 
//		driver.switchTo().defaultContent();

		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame("frame-top");      // see name="frame-top" attribute in frames
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.id("content")).getText());
		driver.switchTo().defaultContent();
		
	}
	}
		
		/*
		 *driver.get("http://the-internet.herokuapp.com");

driver.findElement(By.linkText("Nested Frames")).click();

System.out.print("Total Frameset count : ");

System.out.println(driver.findElements(By.tagName("frameSet")).size());

System.out.print("Total Frame count : ");

System.out.println((driver.findElements(By.tagName("frame")).size()));

driver.switchTo().frame(0);

        driver.switchTo().frame(1);   

        System.out.println(driver.getPageSource().contains("MIDDLE"));

        System.out.println(driver.findElement(By.xpath("//*[@id=\'content\']")).getText());

driver.switchTo().defaultContent();	
		 * */
	//	 */
		 
		 
		 /*
		  * 
		  * 
driver.findElement(By.linkText("Nested Frames")).click();
driver.switchTo().frame("frame-top");
driver.switchTo().frame("frame-middle");
System.out.println(driver.findElement(By.id("content")).getText();
		  */

