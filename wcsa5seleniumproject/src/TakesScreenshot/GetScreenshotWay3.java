package TakesScreenshot;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class GetScreenshotWay3 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		//By creating object of Browser Specific Classes
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File ("./Screenshots/facebook.png");
		
		Files.copy(src, dest);
	}
}
		