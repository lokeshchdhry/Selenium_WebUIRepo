import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement_JavaScriptExecutor {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ksrtc.in");
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("ben");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.id("fromPlaceName")).getText());  //not getting text in console bcs its hidden element
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Script is a string and always use return to retrive the value
		String script =	"return document.getElementById(\"fromPlaceName\").value;"; //java dont accept "" within "" use\" \" and always use ; after script 
		
		String text = (String) js.executeScript(script);
		
		System.out.println(text);
		
	}
}
/*
public class Autosuggestive {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://www.ksrtc.in");
driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
Thread.sleep(2000);

driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);

System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());

//Javascript DOM can extract hidden elements
//because selenium cannot identify hidden elements - (Ajax implementation)
//investigate the properties of object if it have any hidden text

//JavascriptExecutor
JavascriptExecutor js= (JavascriptExecutor)driver;

String script = "return document.getElementById(\"fromPlaceName\").value;";
String text=(String) js.executeScript(script);
System.out.println(text);
int i =0;
//BENGALURU INTERNATION AIPORT
while(!text.equalsIgnoreCase("BENGALURU INTATION AIPORT"))
{
i++;
driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);

text=(String) js.executeScript(script);
System.out.println(text);
if(i>10)
{
break;
}

}

if(i>10)
{
System.out.println("Element not found");
}
else
{
System.out.println("Element  found");
}
}
}
*/