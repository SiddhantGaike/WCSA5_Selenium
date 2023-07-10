package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;     //import libraries for browsers
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp 
{
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc = new Scanner(System.in);   
		
		System.out.println("Which browser you want to open ? : ");
		String browserValue = sc.next();    //next() is non static method used to access String input from user
		
		if (browserValue.equalsIgnoreCase("chrome")) 
		{
			driver = new ChromeDriver();           //For launching the browser
			driver.manage().window().maximize();   //For maximizing the browser
			Thread.sleep(2000);                    //For stopping the execution for 2 seconds
			driver.close();                        //For closing the browser
		}
		else if (browserValue.equalsIgnoreCase("firefox")) 
		{
			driver = new FirefoxDriver();	
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}
		else if (browserValue.equalsIgnoreCase("edge")) 
		{
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();	
			Thread.sleep(2000);
			driver.close();
		}
		else
		{
			System.out.println("Enter valid browser name !");
		}

	}

}
