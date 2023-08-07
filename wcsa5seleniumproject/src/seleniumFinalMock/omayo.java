package seleniumFinalMock;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class omayo {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(1000);
		String title = driver.getTitle();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1500)");
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		
		 Set<String> windowHandles = driver.getWindowHandles();
		 
		 for(String wh : windowHandles)
		 {
			 driver.switchTo().window(wh);
			 String title1 = driver.getTitle();
			 if(!title1.equals(title))
			 {
				 driver.close();
			 }
		 }
	}
}

