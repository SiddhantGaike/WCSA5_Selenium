package GenericPackge;

public interface IAutoConstant 
{
	String EXCEL_PATH = "./Data/TestData.xlsx";
	String PROP_PATH = "./Data/Config.properties";
	
	String CHROME_KEY = "webdriver.chrome.driver";
	String CHROME_VALUE = "./Drivers/chromedriver.exe";
	
	String GECKO_KEY = "webdriver.gecko.driver";
	String GECKO_VALUE = "./Drivers/geckodriver.exe";
	
	String EDGE_KEY = "webdriver.edge.driver";
	String EDGE_VALUE = "./Drivers/msedgedriver.exe";
	
	String SCREENSHOT_PATH = "./Screenshots/";
	
	String VALIDCREDS_SHEET = "validcreds";
	String INVALIDCREDS_SHEET = "invalidcreds";
	String MANAGER_CREDS = "managercreds";
	String CUSTOMERCREDS_SHEET = "customercreds";
	String PROJECT_CREDS = "projectcreds";
	String TASKS_FOR_USER = "tasksforuser";
	String USER_CREDS = "usercreds";
	
	String task1LinkText = "write functional test cases";
	String task2LinkText = "write integration test cases";
	String task1Comment = "Functional Test Cases Done";
	String task2Comment = "Integration Test Cases Done";
}
