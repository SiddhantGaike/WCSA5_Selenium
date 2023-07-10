package Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Siddhant/Desktop/WCSA5%20Workspace/MultiSelectDropDown.html");
		
		WebElement element = driver.findElement(By.id("forts"));
		Select sel = new Select(element);
		
		for(int i=0;i<=5;i++)
		{
			Thread.sleep(1000);
			sel.selectByIndex(i);
		}

		List<WebElement> allops = sel.getAllSelectedOptions();
		
		for(WebElement all:allops)
		{
			Thread.sleep(1000);
			System.out.println(all.getText());
		}
	}

}
