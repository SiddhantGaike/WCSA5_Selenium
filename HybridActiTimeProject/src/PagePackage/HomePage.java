package PagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	//WebElements of Home Page
	@FindBy(xpath="//a[@class='content tt']") private WebElement timeTrackModule;
	@FindBy(xpath="//a[@class='content tasks']") private WebElement tasksModule;
	@FindBy(xpath="//a[@class='content reports']") private WebElement reportsModule;
	@FindBy(xpath="//a[@class='content users']") private WebElement usersModule;
	@FindBy(xpath="//a[@class='content calendar']") private WebElement workScheduleModule;
	@FindBy(xpath="//a[@class='content administration']") private WebElement settingsModule;
	@FindBy(xpath="//a[text()='Logout']") private WebElement logoutLink;
	
	//Initialization of WebElements using PageFactory Class
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Getter methods of WebElements
	public WebElement getTimeTrackModule() 
	{
		return timeTrackModule;
	}

	public WebElement getTasksModule() 
	{
		return tasksModule;
	}

	public WebElement getReportsModule() 
	{
		return reportsModule;
	}

	public WebElement getUsersModule() 
	{
		return usersModule;
	}

	public WebElement getWorkScheduleModule() 
	{
		return workScheduleModule;
	}

	public WebElement getSettingsModule() 
	{
		return settingsModule;
	}

	public WebElement getLogoutLink() 
	{
		return logoutLink;
	}
	
	//Operational Methods
	public void clickOnTimeTrackModule()
	{
		timeTrackModule.click();
	}
	public void clickOnTasksModule()
	{
		tasksModule.click();
	}
	public void clickOnReportsModule()
	{
		reportsModule.click();
	}
	public void clickOnUsersModule()
	{
		usersModule.click();
	}
	public void clickOnWorkScheduleModule()
	{
		workScheduleModule.click();
	}
	public void clickOnSettingsModule()
	{
		settingsModule.click();
	}
	public void clickOnLogoutLink()
	{
		logoutLink.click();
	}
}
