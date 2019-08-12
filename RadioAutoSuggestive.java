import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAutoSuggestive {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 String url = "http://www.echoecho.com/htmlforms10.htm";
		 driver.get(url);
		 driver.findElement(By.xpath("//input[@value='Cheese']")).click();
	     System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size()); //gives counts
	}
}
