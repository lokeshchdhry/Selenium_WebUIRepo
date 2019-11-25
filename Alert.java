//Hello this is a comment for PR.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");

		// TODO Auto-generated method stub

//		driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
//
//		System.out.println(driver.switchTo().alert().getText());
//
//		//driver.switchTo().alert().sendKeys("fesfe");
//
//		driver.switchTo().alert().accept(); //Accept = ok done yes
//
//		//driver.switchTo().alert().dismiss();

		
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
	
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		}
		}
