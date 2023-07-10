package EndToEndFlow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonEndtoEnd 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("shirt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Select delivery location']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='or enter an Indian pincode']")).sendKeys("411033");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='a-button-inner a-declarative'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//div[@class='a-section a-padding-medium sw-atc-message-section']"));
		
		if (element.isDisplayed()) 
		{
			System.out.println("Product adding to cart succesful !");
		}
		else
		{
			System.out.println("Not Successful !");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		WebElement element2 = driver.findElement(By.xpath("//h1[@class='a-spacing-mini a-spacing-top-base']"));
		
		if (element2.isDisplayed()) 
		{
			System.out.println("Removing product from cart successful !");
		}
		else
		{
			System.out.println("Not Successful !");
		}
	}

}
