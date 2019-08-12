import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestCase3 {
	public static void main(String[] args) {
		
	  System.setProperty("webdriver.ie.driver", "E:\\MicrosoftWebDriver.exe");
	  WebDriver driver = new InternetExplorerDriver();
	  driver.get("http://google.com");
	  System.out.println(driver.getTitle());
	
	}
}
