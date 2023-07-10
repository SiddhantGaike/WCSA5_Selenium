package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnActionsClass 
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
		WebElement target2 = driver.findElement(By.xpath("//span[@class='prcs-d' and @data-p='gold-coins-weight-1gms,m']"));
		act.moveToElement(target2).perform();
		Thread.sleep(1000);
		target2.click();
		Thread.sleep(2000);
		WebElement coin = driver.findElement(By.xpath("//div[@class='mousetrap']"));
		
		if(coin.isDisplayed())
		{
			Thread.sleep(2000);
			driver.quit();
		}
		else
		{
			System.out.println("Exception");
		}

	}

}
