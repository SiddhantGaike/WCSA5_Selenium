package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//Using unique attribute
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		//Using multiple attributes
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Search for products, brands and more']")).sendKeys("One plus");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(5000);
		//Using contains function
		driver.findElement(By.xpath("//a[contains(text(),'OnePlus Nord CE 2 Lite 5G (Black Dusk, 128 GB')]")).click();
	}

}
