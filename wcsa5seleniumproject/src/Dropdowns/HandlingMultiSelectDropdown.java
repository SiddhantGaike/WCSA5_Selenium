package Dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Siddhant/Desktop/WCSA5%20Workspace/MultiSelectDropDown.html");
		Thread.sleep(2000);
		
		WebElement dropDownElement = driver.findElement(By.id("forts"));
		Select sel = new Select(dropDownElement);
		Thread.sleep(2000);
		sel.selectByIndex(1);
		Thread.sleep(1000);
		sel.deselectByIndex(1);
		Thread.sleep(1000);
		sel.selectByIndex(2);
		Thread.sleep(1000);
		sel.deselectByIndex(2);
		Thread.sleep(1000);
		sel.selectByIndex(3);
		Thread.sleep(1000);
		sel.deselectByIndex(3);
		Thread.sleep(1000);
		sel.selectByIndex(4);
		Thread.sleep(1000);
		sel.deselectByIndex(4);
		Thread.sleep(1000);
	}
}