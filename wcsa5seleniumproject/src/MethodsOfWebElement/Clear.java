package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Laptop");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).clear();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Mobile");	
	}
}
