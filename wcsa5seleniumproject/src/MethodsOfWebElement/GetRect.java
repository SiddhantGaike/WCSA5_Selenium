package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/");
		
		 Rectangle element = driver.findElement(By.xpath("//span[text()='Downloads']")).getRect();
		 
		 int Xaxis = element.getX();
		 int Yaxis = element.getY();
		 int height = element.getHeight();
		 int width = element.getWidth();
		 
		 System.out.println("X axis : " +Xaxis+ " Y axis : " +Yaxis+ " Height : " +height+ " Width : " +width);

	}

}
