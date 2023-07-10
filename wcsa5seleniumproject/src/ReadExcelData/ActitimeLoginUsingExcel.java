package ReadExcelData;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import DataDrivenFramework.FileLibrary;

public class ActitimeLoginUsingExcel 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://siddhant/login.do");
		Thread.sleep(2000);
		
		FileLibrary flib = new FileLibrary();
		String validUsername = flib.readExcelData("./Data/TestData.xlsx", "validcreds", 1, 0);
		String validPassword = flib.readExcelData("./Data/TestData.xlsx", "validcreds", 1, 1);
		
		driver.findElement(By.name("username")).sendKeys(validUsername);
		driver.findElement(By.name("pwd")).sendKeys(validPassword);
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='logout']")).click();	
		
		for (int i = 1; i <= 7; i++) 
		{
			String invalidUsername = flib.readExcelData("./Data/TestData.xlsx", "invalidcreds", i, 0);
			String invalidPassword = flib.readExcelData("./Data/TestData.xlsx", "invalidcreds", i, 1);
			driver.findElement(By.name("username")).sendKeys(invalidUsername);
			driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
			Thread.sleep(1000);
			driver.findElement(By.id("loginButton")).click();
			driver.findElement(By.name("username")).clear();
			Thread.sleep(1000);
		}
			
		
	}
}
