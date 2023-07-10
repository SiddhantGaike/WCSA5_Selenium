package Synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin 
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("abcde");
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("abcde");
		
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
	}
}
