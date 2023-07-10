package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://siddhant/login.do");
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@name='remember']"));
		Thread.sleep(1000);
		boolean verify = checkBox.isSelected();
		System.out.println(verify);
		Thread.sleep(2000);
		checkBox.click();
		Thread.sleep(2000);
		boolean verify2 = checkBox.isSelected();
		System.out.println(verify2);
	}
}
