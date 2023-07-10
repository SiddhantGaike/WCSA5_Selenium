package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathLocator 
{
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.instagram.com/");
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("9422309752");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("123456");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();

	}

}
