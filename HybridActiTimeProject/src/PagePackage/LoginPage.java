package PagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	//WebElements of Login Page
	@FindBy(xpath="//input[@name='username']") private WebElement usnTB;
	@FindBy(xpath="//input[@name='pwd']") private WebElement pssTB;
	@FindBy(xpath="//*[contains(@class,'initial')]") private WebElement loginButton;
	@FindBy(id="keepLoggedInCheckBox") private WebElement checkBox;
	
	//Initialization of WebElements using PageFactory Class
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Getter methods of WebElements
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
	
	//Operational Methods
	public void validloginMethod(String validUsername, String validPassword)
	{
		usnTB.sendKeys(validUsername);
		pssTB.sendKeys(validPassword);
		checkBox.click();
		loginButton.click();
	}
	public void invalidLoginMethod(String invalidUsername, String invalidPassword)
	{
		usnTB.sendKeys(invalidUsername);
		pssTB.sendKeys(invalidPassword);
		checkBox.click();
		loginButton.click();
		usnTB.clear();
	}
}
