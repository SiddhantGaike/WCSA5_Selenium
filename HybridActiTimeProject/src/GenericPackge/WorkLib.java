package GenericPackge;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WorkLib extends BaseTest 
{
	//Handling Alert Pop-up
	public void acceptAlertPopup()
	{
		driver.switchTo().alert().accept();
	}
	public void dismissAlertPopup()
	{
		driver.switchTo().alert().dismiss();
	}
	
	//Handling Confirmation Pop-up
	public void acceptConfirmationPopup()
	{
		driver.switchTo().alert().accept();
	}
	public void dismissConfirmationPopup()
	{
		driver.switchTo().alert().dismiss();
	}
	
	//Handling Frame
	public void handleFrameByUsingIndex(int index)
	{
		driver.switchTo().frame(index);
	}
	public void handleFrameByUsingString(String nameOrId)
	{
		driver.switchTo().frame(nameOrId);
	}
	public void handleFrameByUsingFrameElement(WebElement frameElement)
	{
		driver.switchTo().frame(frameElement);
	}
	public void switchToMainPage()
	{
		driver.switchTo().defaultContent();
	}
	public void switchToParentPage()
	{
		driver.switchTo().parentFrame();
	}
	
	//Handling the Mouse Actions
	public void mouseHover(WebElement target)
	{
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
	}
	public void rightClick(WebElement target)
	{
		Actions act = new Actions(driver);
		act.contextClick(target).perform();;
	}
	public void doubleClick(WebElement target)
	{
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();;
	}
	public void dragNDrop(WebElement src, WebElement target)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}
	
	//Handle Keyboard Actions
	public void hitEnterMethod() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	public void hitTabMethod() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}
	
	//Handling Dropdown
	public void selectByIndex(int index, WebElement element)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	public void selectByVisibleText(String text, WebElement element)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	public void selectByValue(String value, WebElement element)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	
}
