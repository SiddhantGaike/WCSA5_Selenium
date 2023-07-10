package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoLogin {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/india");
		
		driver.findElement(By.linkText("Sign up")).click();
		
		driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("Siddhant Gaike");
		driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("gaikesiddhant.7@gmail.com");
	
	}

}
