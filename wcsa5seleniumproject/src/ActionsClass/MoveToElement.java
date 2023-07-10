package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//a[@title='Coins']"));
		act.moveToElement(target).perform();
		Thread.sleep(1000);
		WebElement target2 = driver.findElement(By.xpath("//span[text()='Gifts ']"));
		act.moveToElement(target2).perform();
		Thread.sleep(1000);
		WebElement target3 = driver.findElement(By.xpath("//a[@title='Jewellery']"));
		act.moveToElement(target3).perform();
		Thread.sleep(1000);
		WebElement target4 = driver.findElement(By.xpath("//span[@title='Preset Solitaires Jewellery']"));
		act.moveToElement(target4).perform();
		Thread.sleep(1000);
		WebElement target5 = driver.findElement(By.xpath("//a[@title='Watch Jewellery']"));
		act.moveToElement(target5).perform();
		Thread.sleep(1000);
		

	}
}
