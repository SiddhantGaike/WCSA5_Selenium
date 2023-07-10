package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/");
		
		 Point element = driver.findElement(By.xpath("//span[text()='Downloads']")).getLocation();
		 
		 int Xaxis = element.getX();
		 int Yaxis = element.getY();
		 
		 System.out.println("X axis of the element is :" +Xaxis + "  Y axis of the element is : "+Yaxis);

	}

}
