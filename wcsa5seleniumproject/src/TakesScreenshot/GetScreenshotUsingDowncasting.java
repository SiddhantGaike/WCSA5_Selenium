package TakesScreenshot;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class GetScreenshotUsingDowncasting 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		//By using Down Casting
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		RemoteWebDriver drv = (RemoteWebDriver) driver;
		File src = drv.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./Screenshots/instagram.png");
		
		Files.copy(src, dest);
	}

}
