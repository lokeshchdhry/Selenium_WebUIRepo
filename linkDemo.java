import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkDemo {

	public static void main(String[] args) throws Exception {

      System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("http://qaclickacademy.com/practice.php");
      
      
        int noOfLinks  = driver.findElements(By.tagName("a")).size();      
        System.out.println(noOfLinks);
           
       WebElement footer = driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]"));      
       
       WebElement col = driver.findElement(By.xpath("//div[@id='gf-BIG']//td[1]"));
       
       int colLink =   col.findElements(By.tagName("a")).size();
       
       for(int i = 0; i <= colLink ; i++) {
    	   
    	   String clickOnlinks = Keys.chord(Keys.CONTROL , Keys.ENTER);
    	   
    	   col.findElements(By.tagName("a")).get(i).sendKeys(clickOnlinks);
    	   Thread.sleep(1000L);
       }     
	}
}
