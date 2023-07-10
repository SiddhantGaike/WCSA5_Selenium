package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) 
	{	
		WebDriver driver = new ChromeDriver();
		driver.close();
	}

}
