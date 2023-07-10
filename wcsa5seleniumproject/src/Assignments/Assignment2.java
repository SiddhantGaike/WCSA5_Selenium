package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 
{
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();	
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);

			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//input[@type='text' and @placeholder='Search for products, brands and more']")).sendKeys("hp laptop");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and text()='Hard Disk Capacity']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='_3879cV' and text()='1 TB']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and text()='Brand']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='_3879cV' and text()='HP']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Core i5']")).click();
			Thread.sleep(2000);
	}

}
