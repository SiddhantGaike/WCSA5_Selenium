package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement src1 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement target1 = driver.findElement(By.xpath("//ol[@id='loan']/descendant::li"));
		WebElement src2 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement target2 = driver.findElement(By.xpath("//ol[@id='bank']/descendant::li"));
		WebElement src3 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement target3 = driver.findElement(By.xpath("//ol[@id='amt8']/descendant::li"));
		WebElement src4 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement target4 = driver.findElement(By.xpath("//ol[@id='amt7']/descendant::li"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src1, target1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src2, target2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src3, target3).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src4, target4).perform();	
		
//		if (driver.findElement(By.xpath("//a[text()='Perfect!']")).isDisplayed())
//		{
//			System.out.println("Drag and Drop Operation Done !");
//		}
//		else
//		{
//			System.out.println("Exception !");
//		}
	}

}
