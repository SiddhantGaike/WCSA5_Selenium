package EndToEndFlow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartEndtoEnd2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("T shirt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_2B099V'])[3]")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		if (driver.getTitle()!=title) 
		{
			driver.switchTo().window(title);
		}
		

	}

}
