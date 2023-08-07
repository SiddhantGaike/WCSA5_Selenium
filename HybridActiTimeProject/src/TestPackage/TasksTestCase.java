package TestPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericPackge.BaseTest;
import GenericPackge.Flib;
import PagePackage.HomePage;
import PagePackage.LoginPage;
import PagePackage.TasksPage;
import PagePackage.TimeTrackPage;

public class TasksTestCase extends BaseTest
{
  @Test
  public void taskFlow() throws EncryptedDocumentException, IOException, InterruptedException 
  {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  
	  Flib flib = new Flib();
	  LoginPage lp = new LoginPage(driver);
	  HomePage hp = new HomePage(driver);
	  TasksPage tsp = new TasksPage(driver);
	  TimeTrackPage ttp = new TimeTrackPage(driver);
	  
      lp.validloginMethod(flib.readExcelData(EXCEL_PATH, VALIDCREDS_SHEET, 2, 0),flib.readExcelData(EXCEL_PATH, VALIDCREDS_SHEET, 2, 1));
	  hp.clickOnTasksModule();
	  tsp.createTaskByManager(flib.readExcelData(EXCEL_PATH, TASKS_FOR_USER, 1, 0), flib.readExcelData(EXCEL_PATH, TASKS_FOR_USER, 1, 1), flib.readExcelData(EXCEL_PATH, CUSTOMERCREDS_SHEET, 1, 0), flib.readExcelData(EXCEL_PATH, PROJECT_CREDS, 1,0));
	  hp.clickOnTimeTrackModule();	  
	  ttp.assignTaskToUserByManager(driver, flib.readExcelData(EXCEL_PATH, USER_CREDS, 2, 0));
	  hp.clickOnLogoutLink();
	  
	  lp.validloginMethod(flib.readExcelData(EXCEL_PATH, USER_CREDS, 1, 0),flib.readExcelData(EXCEL_PATH, USER_CREDS, 1, 1));
	  ttp.performTasksByUser(driver);
	  hp.clickOnLogoutLink();
	  
	  lp.validloginMethod(flib.readExcelData(EXCEL_PATH, VALIDCREDS_SHEET, 2, 0),flib.readExcelData(EXCEL_PATH, VALIDCREDS_SHEET, 2, 1));
	  hp.clickOnTasksModule();
	  tsp.completeTaskByManager();
	  tsp.archiveProjectByManager();
	  hp.clickOnLogoutLink(); 
  }
}
