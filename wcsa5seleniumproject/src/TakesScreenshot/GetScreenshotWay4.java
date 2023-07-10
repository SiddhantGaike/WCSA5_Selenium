package TakesScreenshot;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class GetScreenshotWay4 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		//By Up casting into RemoteWebDriver class
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File ("./Screenshots/flipkart.png");
		
		Files.copy(src, dest);
	}
}