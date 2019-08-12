import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicRadio {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		String url = "http://www.echoecho.com/htmlforms10.htm";
		driver.get(url);
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		for(int i=0; i<count;i++)
		{
		    // driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		    //Thread.sleep(2000L);
			//System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
			
			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if(text.equals("Butter"))
			{
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}
	}
}
