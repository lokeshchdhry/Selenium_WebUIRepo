import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {
	public static void main(String[] args) {
	
	/*	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("aparna");
		driver.findElement(By.id("password")).sendKeys("mynewpassword");
		
		//driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		*/
		
		System.setProperty("webdriver.chrome.driver","E:\\Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/interview.php");		
		driver.findElement(By.xpath("//li[@id=\'tablist1-tab1']/following-sibling::li[1]")).click();	    
		driver.findElement(By.xpath("//li[@id=\'tablist1-tab1']/following-sibling::li[2]")).click();	
	    driver.findElement(By.xpath("//li[@id=\'tablist1-tab1']/following-sibling::li[3]")).click();
	   
	    
	//	driver.findElement(By.xpath("//div[@class='f0n8F ']/input")).sendKeys("asjsidjsd");	
		
	/*	driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	//	System.out.println(driver.getPageSource());
    	driver.navigate().to("https://github.com/");
		driver.navigate().back();
		driver.navigate().forward();*/
	
	/*	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("aparnachdhry@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("mynewpassword");//
//		driver.findElement(By.xpath("//*[@id=\'passwordNext\']/div[2]")).click();*/
			
		
	}
}
