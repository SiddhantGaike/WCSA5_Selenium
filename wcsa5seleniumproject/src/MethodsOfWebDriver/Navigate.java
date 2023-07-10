package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.instagram.com/");
	}

}
