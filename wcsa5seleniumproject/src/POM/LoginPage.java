package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	//Element Repository
	
	@FindBy(xpath="//input[@name='username']") private WebElement usnTB;
	@FindBy(xpath="//input[@name='pwd']") private WebElement pssTB;
	@FindBy(xpath="//*[contains(@class,'initial')]") private WebElement loginButton;
	@FindBy(id="keepLoggedInCheckBox") private WebElement checkBox;
	@FindBy(partialLinkText = "Actimind Inc.") private WebElement actiMindLink;
	@FindBy(xpath = "//div[text()='Tasks']") private WebElement tasksTab;
	@FindBy(xpath = "//a[text()='Projects & Customers']") private WebElement projCustTab;
	@FindBy(xpath = "//input[@value='Create New Customer']") private WebElement createNewCustButton;
	@FindBy(xpath = "//input[@name='name']") private WebElement custNameTB;
	@FindBy(xpath = "//input[@type='submit']") private WebElement createButton;

	//initialization

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	
	public WebElement getUsnTB() 
	{
		return usnTB;
	}
	public WebElement getPssTB() 
	{
		return pssTB;
	}
	public WebElement getLoginButton() 
	{
		return loginButton;
	}
	public WebElement getCheckBox() 
	{
		return checkBox;
	}
	public WebElement getActiMindLink() 
	{
		return actiMindLink;
	}
	public WebElement getTasksTab() 
	{
		return tasksTab;
	}

	public WebElement getProjCustTab() 
	{
		return projCustTab;
	}

	public WebElement getCreateNewCustButton() 
	{
		return createNewCustButton;
	}
	public WebElement getCustNameTB() 
	{
		return custNameTB;
	}

	public WebElement getCreateButton() 
	{
		return createButton;
	}

	//Operational Methods
	
	public void validloginMethod(String validUsername, String validPassword)
	{
		usnTB.sendKeys(validUsername);
		pssTB.sendKeys(validPassword);
		checkBox.click();
		loginButton.click();
	}
	public void createCustomerMethod()
	{
		tasksTab.click();
		projCustTab.click();
		createNewCustButton.click();
		custNameTB.sendKeys("Manager");
		createButton.click();
	}
}
