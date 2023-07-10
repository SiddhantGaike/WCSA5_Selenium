package EndToEndFlow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopperstackEndtoEnd 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://shoppersstack.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("gaikesiddhant.7@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Siddhant@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement element1 = driver.findElement(By.xpath("//a[@id='men']"));
		act.moveToElement(element1).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='T-shirts']")).click();
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Puma t shirt']/../../descendant::button[text()='add to cart']"));
		Actions act2 = new Actions(driver);
		act2.moveToElement(element2).perform();
		Thread.sleep(4000);
		element2.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='cart']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Buy Now']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='4217']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='COD']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(2000);
	}
}
