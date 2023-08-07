package PagePackage;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericPackge.WorkLib;

public class TimeTrackPage extends WorkLib
{
	static WebDriver driver;
	//WebElements for Assign Tasks Operation
	@FindBy(xpath="//select[@name='usersSelector.selectedUser']") private WebElement timeTrackForDD;
	@FindBy(xpath="//a[text()='Insert existing tasks']") private WebElement insertExistingTaskLink;
	@FindBy(xpath="//td[@id='cpSelector.cpButton.contentsContainer']") private WebElement customerNprojectsDD;
	@FindBy(xpath="//input[@id='selectedCustomersProjectsRadio']") private WebElement custProjRadioButton;
	@FindBy(xpath="//input[@id='cpSelector.cpPopup.cpListbox_item_0']") private WebElement selectCustProjCB;
	@FindBy(xpath="//input[@id='closeButton']") private WebElement closeButton;
	@FindBy(xpath="(//td[@class='listtblcell']/../descendant::input[@type='checkbox'])[1]") private WebElement taskCB1;
	@FindBy(xpath="(//td[@class='listtblcell']/../descendant::input[@type='checkbox'])[2]") private WebElement taskCB2;
	@FindBy(xpath="//input[@value='Insert Selected Tasks to the Enter Time-Track Page']") private WebElement insertTasksButton;
	@FindBy(xpath="//input[@id='SubmitTTButton']") private WebElement saveChangesButton;
	
	//WebElements for Perform Tasks Operation
	@FindBy(xpath="(//td[@class='calendarCurrentDayNormal']/descendant::input[@type='text'])[1]") private WebElement workHoursTask1TB7;
	@FindBy(xpath="(//td[@class='calendarCurrentDayNormal']/descendant::input[@type='text'])[2]") private WebElement workHoursTask2TB7;
	
	@FindBy(xpath="(//td[@class='calendarWorkingDayNormal']/descendant::input[@type='text'])[1]") private WebElement workHoursTask1TB1;
	@FindBy(xpath="(//td[@class='calendarWorkingDayNormal']/descendant::input[@type='text'])[2]") private WebElement workHoursTask1TB2;
	@FindBy(xpath="(//td[@class='calendarWorkingDayNormal']/descendant::input[@type='text'])[3]") private WebElement workHoursTask1TB3;
	@FindBy(xpath="(//td[@class='calendarWorkingDayNormal']/descendant::input[@type='text'])[4]") private WebElement workHoursTask1TB4;
	@FindBy(xpath="(//td[@class='calendarWorkingDayNormal']/descendant::input[@type='text'])[5]") private WebElement workHoursTask1TB5;
	@FindBy(xpath="(//td[@class='calendarWorkingDayNormal']/descendant::input[@type='text'])[6]") private WebElement workHoursTask2TB1;
	@FindBy(xpath="(//td[@class='calendarWorkingDayNormal']/descendant::input[@type='text'])[7]") private WebElement workHoursTask2TB2;
	@FindBy(xpath="(//td[@class='calendarWorkingDayNormal']/descendant::input[@type='text'])[8]") private WebElement workHoursTask2TB3;
	@FindBy(xpath="(//td[@class='calendarWorkingDayNormal']/descendant::input[@type='text'])[9]") private WebElement workHoursTask2TB4;
	@FindBy(xpath="(//td[@class='calendarWorkingDayNormal']/descendant::input[@type='text'])[10]") private WebElement workHoursTask2TB5;
	
	@FindBy(xpath="(//td[@class='calendarWeekendDayNormal']/descendant::input[@type='text'])[1]") private WebElement workHoursTask1TB6;
	@FindBy(xpath="(//td[@class='calendarWeekendDayNormal']/descendant::input[@type='text'])[2]") private WebElement workHoursTask2TB6;
	@FindBy(xpath="//input[@id='SubmitTTButton']") private WebElement saveChangesButton2;
	
	@FindBy(xpath="(//a[@class='cursorImageLink']/descendant::img[@title='Click to edit comments'])[1]") private WebElement commentsTask1Button1;
	@FindBy(xpath="(//a[@class='cursorImageLink']/descendant::img[@title='Click to edit comments'])[2]") private WebElement commentsTask1Button2;
	@FindBy(xpath="(//a[@class='cursorImageLink']/descendant::img[@title='Click to edit comments'])[3]") private WebElement commentsTask2Button1;
	@FindBy(xpath="(//a[@class='cursorImageLink']/descendant::img[@title='Click to edit comments'])[4]") private WebElement commentsTask2Button2;
	@FindBy(xpath="//textarea[@id='editDescriptionPopupText']") private WebElement commentPopupTextArea;
	@FindBy(xpath="//input[@id='scbutton']") private WebElement okButton;
	@FindBy(xpath="//input[@name='nccbutton']") private WebElement cancelButton;
	
	//Initialization of WebElements
	public TimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Getter methods for WebElements
	public WebElement getTimeTrackForDD() {
		return timeTrackForDD;
	}
	
	public WebElement getInsertExistingTaskLink() {
		return insertExistingTaskLink;
	}

	public WebElement getCustomerNprojectsDD() {
		return customerNprojectsDD;
	}

	public WebElement getCustProjRadioButton() {
		return custProjRadioButton;
	}

	public WebElement getSelectCustProjCB() {
		return selectCustProjCB;
	}

	public WebElement getCloseButton() {
		return closeButton;
	}

	public WebElement getTaskCB1() {
		return taskCB1;
	}

	public WebElement getTaskCB2() {
		return taskCB2;
	}

	public WebElement getInsertTasksButton() {
		return insertTasksButton;
	}

	public WebElement getSaveChangesButton() {
		return saveChangesButton;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getWorkHoursTask1TB1() {
		return workHoursTask1TB1;
	}

	public WebElement getWorkHoursTask1TB2() {
		return workHoursTask1TB2;
	}

	public WebElement getWorkHoursTask1TB3() {
		return workHoursTask1TB3;
	}

	public WebElement getWorkHoursTask1TB4() {
		return workHoursTask1TB4;
	}

	public WebElement getWorkHoursTask1TB5() {
		return workHoursTask1TB5;
	}

	public WebElement getWorkHoursTask1TB6() {
		return workHoursTask1TB6;
	}

	public WebElement getWorkHoursTask1TB7() {
		return workHoursTask1TB7;
	}

	public WebElement getWorkHoursTask2TB1() {
		return workHoursTask2TB1;
	}

	public WebElement getWorkHoursTask2TB2() {
		return workHoursTask2TB2;
	}

	public WebElement getWorkHoursTask2TB3() {
		return workHoursTask2TB3;
	}

	public WebElement getWorkHoursTask2TB4() {
		return workHoursTask2TB4;
	}

	public WebElement getWorkHoursTask2TB5() {
		return workHoursTask2TB5;
	}

	public WebElement getWorkHoursTask2TB6() {
		return workHoursTask2TB6;
	}

	public WebElement getWorkHoursTask2TB7() {
		return workHoursTask2TB7;
	}

	public WebElement getSaveChangesButton2() {
		return saveChangesButton2;
	}
	
	public WebElement getCommentsTask1Button1() {
		return commentsTask1Button1;
	}

	public WebElement getCommentsTask2Button1() {
		return commentsTask2Button1;
	}

	public WebElement getCommentPopupTextArea() {
		return commentPopupTextArea;
	}

	public WebElement getOkButton() {
		return okButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	//Operational Methods
	public void assignTaskToUserByManager(WebDriver driver, String userName) throws InterruptedException
	{
		timeTrackForDD.click();
		selectByVisibleText(userName, timeTrackForDD);
		String parentWindowHandle = driver.getWindowHandle();
		Thread.sleep(2000);
		insertExistingTaskLink.click();
		Thread.sleep(1000);
		Set<String> windowHandles = driver.getWindowHandles();
		for(String wh : windowHandles)
		{
			driver.switchTo().window(wh);
		}
		Thread.sleep(2000);
		customerNprojectsDD.click();
		custProjRadioButton.click();
		selectCustProjCB.click();
		closeButton.click();
		Thread.sleep(1000);
		taskCB1.click();
		taskCB2.click();
		insertTasksButton.click();
		driver.switchTo().window(parentWindowHandle);
		Thread.sleep(1000);
		saveChangesButton.click();
	}
	
	public void performTasksByUser(WebDriver driver) throws InterruptedException
	{
		//For Current Working Day
		workHoursTask1TB7.sendKeys("3");
		workHoursTask2TB7.sendKeys("3");
		
		//For Normal Working Days
		workHoursTask1TB1.sendKeys("4");
		workHoursTask1TB2.sendKeys("4");

//		workHoursTask1TB3.sendKeys("5");
//		workHoursTask2TB3.sendKeys("5");
//
//		workHoursTask1TB4.sendKeys("3");
//		workHoursTask2TB4.sendKeys("3");
//
//		workHoursTask1TB5.sendKeys("4");
//		workHoursTask2TB5.sendKeys("4");
//
		//For Weekends
//		workHoursTask1TB6.sendKeys("2");
//		workHoursTask2TB6.sendKeys("2");
		
		saveChangesButton2.click();
		
		commentsTask1Button1.click();
		commentPopupTextArea.sendKeys("Functional Test Cases Done");
		okButton.click();
		Thread.sleep(2000);
		commentsTask1Button2.click();
		commentPopupTextArea.sendKeys("Functional Test Cases Done");
		okButton.click();
		Thread.sleep(2000);
		commentsTask2Button1.click();
		commentPopupTextArea.sendKeys("Integration Test Cases Done");
		okButton.click();
		Thread.sleep(2000);
		commentsTask2Button2.click();
		commentPopupTextArea.sendKeys("Integration Test Cases Done");
		okButton.click();
		Thread.sleep(1000);
		saveChangesButton2.click();
	}
}
