import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");	
	
		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());	
		//WebElement check = driver.findElement(By.cssSelector("input[type='checkbox']"));
  
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());
		
		WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox']"));
		System.out.println("The checkbox is selection state is - " + checkbox.isSelected());
		
		if(!checkbox.isSelected())
			checkbox.click();
		System.out.println("The checkbox is selection state is - " + checkbox.isSelected());
		
		//get count
	    System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	    		
		//label[@for="bmw"]
				
	}
}
