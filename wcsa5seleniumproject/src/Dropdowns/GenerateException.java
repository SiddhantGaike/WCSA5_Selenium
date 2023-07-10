package Dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenerateException 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//  java.lang.UnsupportedOperationException 
		// Because you can deselect options of only multi select dropdown
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Siddhant/Desktop/WCSA5%20Workspace/SingleSelectDropDown.html");
		Thread.sleep(2000);
		
		WebElement dropDownElement = driver.findElement(By.id("bikes"));
		dropDownElement.click();
		Select sel = new Select(dropDownElement);
		Thread.sleep(2000);
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		sel.deselectByIndex(2);
	}

}
