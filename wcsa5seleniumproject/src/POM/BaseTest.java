package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest extends Flib implements IAutoConstant
{
	static WebDriver driver;
	public void setUp()
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://siddhant/login.do");
	}	
	
	public void tearDown()
	{
		driver.quit();
	}

}

