package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet_PROJECT {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		
//		Select s = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")));
//		s.selectByVisibleText("USD");
//		driver.findElement(By.id("divpaxinfo")).click();
//		Thread.sleep(2000L);

//		for(int i =0; i<=2 ; i++) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//		}
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		Thread.sleep(2000L);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); 
		
   //select desti		
	WebElement desti =	driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
	desti.clear();
	desti.sendKeys("del");
   // Thread.sleep(2000);
   // desti.sendKeys(Keys.ARROW_RIGHT);
   // desti.sendKeys(Keys.ENTER);    
   // select calendar    
    
    driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click(); //.ui-state-default.ui-state-highlight.ui-state-active
    
    //Select search =	new Select (driver.findElement(By.xpath("//*[@id='ctl00_mainContent_btn_FindFlights']")));
    Select s = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")));
    s.selectByVisibleText("USD");
    driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
  
	}
}
