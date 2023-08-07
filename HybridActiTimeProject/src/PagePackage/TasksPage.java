package PagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericPackge.IAutoConstant;
import GenericPackge.WorkLib;

public class TasksPage extends WorkLib implements IAutoConstant
{
	//WebElements for Create Customer and Create Project Operations
	@FindBy(xpath="//a[text()='Open Tasks']") private WebElement openTasksTab;
	@FindBy(xpath="//a[text()='Projects & Customers']") private WebElement projAndCustomersTab;
	@FindBy(xpath="//a[text()='Completed Tasks']") private WebElement completedTasksTab;
	@FindBy(xpath="//a[text()='Archives']") private WebElement archivesTab;
	@FindBy(xpath="//input[@value='Create New Customer']") private WebElement createNewCustomerButton;
	@FindBy(xpath="//input[@value='Create New Project']") private WebElement createNewProjectButton;
	@FindBy(xpath="//input[@name='name']") private WebElement customerNameTB;
	@FindBy(xpath="//input[@name='createCustomerSubmit']") private WebElement createButton;
	@FindBy(xpath="//input[@value='      Cancel      ']") private WebElement cancelButton;
	@FindBy(xpath="//select[@name='customerId']") private WebElement customerDropdown;
	@FindBy(xpath="//input[@name='name']") private WebElement projectNameTB;
	@FindBy(xpath="//input[@name='createProjectSubmit']") private WebElement createProjButton;
	@FindBy(xpath="//input[@value='    Cancel    ']") private WebElement cancelProjectButton;
	
	//WebElements for Create Tasks Operation
	@FindBy(xpath="//input[@value='Create New Tasks']") private WebElement createNewTasksButton;
	@FindBy(xpath="//select[@name='customerId' and (@class='customer-project-select')]") private WebElement customerSelectDropdown;
	@FindBy(xpath="//select[@name='projectId']") private WebElement projectSelectDropdown;
	@FindBy(xpath="//input[@name='task[0].name']") private WebElement taskNameTB1;
	@FindBy(xpath="//input[@name='task[1].name']") private WebElement taskNameTB2;
	@FindBy(xpath="//input[@name='task[2].name']") private WebElement taskNameTB3;
	@FindBy(xpath="//input[@name='task[3].name']") private WebElement taskNameTB4;
	@FindBy(xpath="//input[@name='task[4].name']") private WebElement taskNameTB5;
	@FindBy(xpath="//input[@value='Create Tasks']") private WebElement createTasksButton;
	@FindBy(xpath="//input[@value='     Cancel     ']") private WebElement cancelTasksButton;
	
	//WebElements for Completion of Tasks Operation
	@FindBy(linkText = task1LinkText) private WebElement task1Link;
	@FindBy(linkText = task2LinkText) private WebElement task2Link;
	@FindBy(xpath = "//span[text()='Functional Test Cases Done']") private WebElement task1CommentText;
	@FindBy(xpath = "//span[text()='Integration Test Cases Done']") private WebElement task2CommentText;
	@FindBy(xpath = "(//input[@type='checkbox'])[1]") private WebElement taskSelectCB1;
	@FindBy(xpath = "(//input[@type='checkbox'])[2]") private WebElement taskSelectCB2;
	@FindBy(xpath = "//input[@value='Complete Selected Tasks']") private WebElement completeTaskButton;
	@FindBy(xpath = "//input[@value='Delete Selected Tasks']") private WebElement deleteTaskButton;
	@FindBy(xpath = "//input[@id='deleteButton']") private WebElement deleteConfirmButton;
	@FindBy(xpath = "//input[@onclick='deleteConfirmDlg.close()']") private WebElement cancelDeleteButton;
	
	//WebElements for Archive Project Operation
	@FindBy(xpath = "//td[@class='selectCustomer']/descendant::input[@type='checkbox']") private WebElement selectCustomerCB;
	@FindBy(xpath = "//input[@value='Archive Selected']") private WebElement archiveSelectedCustButton;
	@FindBy(xpath = "//input[@value='Delete Selected']") private WebElement deleteSelectedCustButton;
	@FindBy(xpath = "//input[@value='Delete This Customer']") private WebElement deleteCustomerConfirmButton;
	@FindBy(xpath = "//input[@onclick='deleteConfirmDlg.close()']") private WebElement deleteCustCancelButton;
	
	//@FindBy(xpath="//input[@name='customers[4]']") private WebElement custCheckbox1;
	//@FindBy(xpath="//input[@value='Delete Selected']") private WebElement deleteSelectedButton;
	//@FindBy(xpath="//input[@value='Delete This Customer']") private WebElement deleteThisCustomerButton;
	
	//Initialization of WebElements using PageFactory
	public TasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Getter methods for WebElements
	public WebElement getOpenTasksTab() {
		return openTasksTab;
	}
	
	public WebElement getProjAndCustomersTab() {
		return projAndCustomersTab;
	}
	
	public WebElement getCompletedTasksTab() {
		return completedTasksTab;
	}

	public WebElement getArchivesTab() {
		return archivesTab;
	}
	
	public WebElement getCreateNewCustomerButton() {
		return createNewCustomerButton;
	}

	public WebElement getCreateNewProjectButton() {
		return createNewProjectButton;
	}

	public WebElement getCustomerNameTB() {
		return customerNameTB;
	}

	public WebElement getCreateButton() {
		return createButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	public WebElement getCustomerDropdown() {
		return customerDropdown;
	}

	public WebElement getProjectNameTB() {
		return projectNameTB;
	}

	public WebElement getCreateProjButton() {
		return createProjButton;
	}

	public WebElement getCancelProjectButton() {
		return cancelProjectButton;
	}
	
//	public WebElement getCustCheckbox1() {
//		return custCheckbox1;
//	}
//
//	public WebElement getDeleteSelectedButton() {
//		return deleteSelectedButton;
//	}
//
//	public WebElement getDeleteThisCustomerButton() {
//		return deleteThisCustomerButton;
//	}

	public WebElement getCreateNewTasksButton() {
		return createNewTasksButton;
	}

	public WebElement getCustomerSelectDropdown() {
		return customerSelectDropdown;
	}

	public WebElement getProjectSelectDropdown() {
		return projectSelectDropdown;
	}

	public WebElement getTaskNameTB1() {
		return taskNameTB1;
	}

	public WebElement getTaskNameTB2() {
		return taskNameTB2;
	}

	public WebElement getTaskNameTB3() {
		return taskNameTB3;
	}

	public WebElement getTaskNameTB4() {
		return taskNameTB4;
	}

	public WebElement getTaskNameTB5() {
		return taskNameTB5;
	}

	public WebElement getCreateTasksButton() {
		return createTasksButton;
	}

	public WebElement getCancelTasksButton() {
		return cancelTasksButton;
	}
	
	public WebElement getTask1Link() {
		return task1Link;
	}

	public WebElement getTask2Link() {
		return task2Link;
	}

	public WebElement getTask1CommentText() {
		return task1CommentText;
	}

	public WebElement getTask2CommentText() {
		return task2CommentText;
	}

	public WebElement getTaskSelectCB1() {
		return taskSelectCB1;
	}

	public WebElement getTaskSelectCB2() {
		return taskSelectCB2;
	}

	public WebElement getCompleteTaskButton() {
		return completeTaskButton;
	}

	public WebElement getDeleteTaskButton() {
		return deleteTaskButton;
	}

	public WebElement getDeleteConfirmButton() {
		return deleteConfirmButton;
	}

	public WebElement getCancelDeleteButton() {
		return cancelDeleteButton;
	}

	public WebElement getSelectCustomerCB() {
		return selectCustomerCB;
	}

	public WebElement getArchiveSelectedCustButton() {
		return archiveSelectedCustButton;
	}

	public WebElement getDeleteSelectedCustButton() {
		return deleteSelectedCustButton;
	}

	public WebElement getDeleteCustomerConfirmButton() {
		return deleteCustomerConfirmButton;
	}

	public WebElement getDeleteCustCancelButton() {
		return deleteCustCancelButton;
	}

	// Operational Methods
	public void clickOnOpenTasks() 
	{
		openTasksTab.click();
	}

	public void clickOnCompletedTasks() 
	{
		completedTasksTab.click();
	}

	public void clickOnProjectAndCustomers() 
	{
		projAndCustomersTab.click();
	}

	public void clickOnArchives() 
	{
		archivesTab.click();
	}
	
	public void createCustomerByAdmin(String customerName)
	{
		createNewCustomerButton.click();
		customerNameTB.sendKeys(customerName);
		createButton.click();
	}
	
	public void createProjectByAdmin(String customerName, String projectName)
	{
		createNewProjectButton.click();
		customerDropdown.click();
		selectByVisibleText(customerName, customerDropdown);
		projectNameTB.sendKeys(projectName);
		createProjButton.click();	
	}
	
	public void createTaskByManager(String task1, String task2, String customerName, String projectName) throws InterruptedException
	{
		Thread.sleep(2000);
		createNewTasksButton.click();
		Thread.sleep(2000);
		customerSelectDropdown.click();
		selectByVisibleText(customerName, customerSelectDropdown);
		projectSelectDropdown.click();
		selectByVisibleText(projectName, projectSelectDropdown);
		taskNameTB1.sendKeys(task1);
		taskNameTB2.sendKeys(task2);
		createTasksButton.click();
	}
	
	public void completeTaskByManager()
	{
		task1Link.click();
		if(task1Comment.equals(task1CommentText.getText()))
		{
			System.out.println("Task 1 is completed by the Test Engineer");
		}
		else
		{
			System.out.println("Comments not present ! Task 1 is not nompleted !");
		}
		openTasksTab.click();
		task2Link.click();
		if(task2Comment.equals(task2CommentText.getText()))
		{
			System.out.println("Task 2 is completed by the Test Engineer");
		}
		else
		{
			System.out.println("Comments not present ! Task 2 is not completed !");
		}
		openTasksTab.click();
		taskSelectCB1.click();
		taskSelectCB2.click();
		completeTaskButton.click();
	}
	
	public void archiveProjectByManager()
	{
		projAndCustomersTab.click();
		selectCustomerCB.click();
		archiveSelectedCustButton.click();
		acceptAlertPopup();	
	}
	
//	public void deleteCustomerNProject() throws InterruptedException
//	{
//		custCheckbox1.click();
//		deleteSelectedButton.click();
//		Thread.sleep(2000);
//		deleteThisCustomerButton.click();
//		
//	}
	
		
}
