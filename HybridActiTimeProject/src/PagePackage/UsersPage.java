package PagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage
{
	//WebElements for Create New User Operation
	@FindBy(xpath="//input[@value='Create New User']") private WebElement createNewUserButton;
	@FindBy(xpath="//input[@name='username']") private WebElement usernameTB;
	@FindBy(xpath="//input[@name='passwordText']") private WebElement passwordTB;
	@FindBy(xpath="//input[@name='passwordTextRetype']") private WebElement retypePasswordTB;
	@FindBy(xpath="//input[@name='firstName']") private WebElement firstnameTB;
	@FindBy(xpath="//input[@name='lastName']") private WebElement lastnameTB;
	@FindBy(xpath="//input[@id='right12']") private WebElement managerPermissionChBx1;
	@FindBy(xpath="//input[@id='right2']") private WebElement managerPermissionChBx2;
	@FindBy(xpath="//input[@id='right1']") private WebElement managerPermissionChBx4;
	@FindBy(xpath="//input[@id='right5']") private WebElement managerPermissionChBx5;
	@FindBy(xpath="//input[@id='right7']") private WebElement managerPermissionChBx6;
	@FindBy(xpath="//input[@value='   Create User   ']") private WebElement createUserButton;
	@FindBy(xpath="//input[@value='      Cancel      ']") private WebElement cancelButton;
	
	//Initialization of WebElements using Pagefactory
	public UsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Getter methods for WebElements
	public WebElement getCreateNewUserButton() {
		return createNewUserButton;
	}

	public WebElement getUsernameTB() {
		return usernameTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getRetypePasswordTB() {
		return retypePasswordTB;
	}

	public WebElement getFirstnameTB() {
		return firstnameTB;
	}

	public WebElement getLastnameTB() {
		return lastnameTB;
	}
	
	public WebElement getManagerPermissionChBx1() {
		return managerPermissionChBx1;
	}

	public WebElement getManagerPermissionChBx2() {
		return managerPermissionChBx2;
	}

	public WebElement getManagerPermissionChBx4() {
		return managerPermissionChBx4;
	}

	public WebElement getManagerPermissionChBx5() {
		return managerPermissionChBx5;
	}

	public WebElement getManagerPermissionChBx6() {
		return managerPermissionChBx6;
	}

	public WebElement getCreateUserButton() {
		return createUserButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	//Operational Methods
	public void createUserManager(String username, String password, String retypePassword, String firstname, String lastname) throws InterruptedException
	{
		createNewUserButton.click();
		usernameTB.sendKeys(username);
		passwordTB.sendKeys(password);
		retypePasswordTB.sendKeys(retypePassword);
		firstnameTB.sendKeys(firstname);
		lastnameTB.sendKeys(lastname);
		managerPermissionChBx1.click();
		managerPermissionChBx2.click();
		managerPermissionChBx4.click();
		managerPermissionChBx5.click();
		managerPermissionChBx6.click();	
		createUserButton.click();
	}
	
	public void createUserByManager(String username, String password, String retypePassword, String firstname, String lastname)
	{
		createNewUserButton.click();
		usernameTB.sendKeys(username);
		passwordTB.sendKeys(password);
		retypePasswordTB.sendKeys(retypePassword);
		firstnameTB.sendKeys(firstname);
		lastnameTB.sendKeys(lastname);
		createUserButton.click();
	}
}
