package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/");
		
		driver.findElement(By.linkText("Sign up")).click();
		
		driver.findElement(By.cssSelector("input[class='sc-1yzxt5f-9 bbrwhB']")).sendKeys("Siddhant Gaike");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='sc-1yzxt5f-9 dFkpnp']")).sendKeys("gaikesiddhant.7@gmail.com");
		driver.findElement(By.cssSelector("input[class='sc-1o2pknd-1 iPRmnw']")).click();
		driver.findElement(By.cssSelector("button[class='sc-1kx5g6g-1 elxuhW']")).click();

	}

}
