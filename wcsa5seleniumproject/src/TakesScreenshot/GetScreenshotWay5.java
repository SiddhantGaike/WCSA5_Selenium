package TakesScreenshot;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class GetScreenshotWay5 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		//By Using EventFiringWebDriver
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		
		EventFiringWebDriver efw = new EventFiringWebDriver(driver);
		
		File src = efw.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/amazon.png");
		
		Files.copy(src, dest);
	}
	
}
		
		