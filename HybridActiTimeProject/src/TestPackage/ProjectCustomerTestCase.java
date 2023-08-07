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

public class ProjectCustomerTestCase extends BaseTest 
{
	@Test
	public void createCustomerAndProject() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		TasksPage tsp = new TasksPage(driver);
		
		lp.validloginMethod(flib.readPropertyData(PROP_PATH, "Username"), flib.readPropertyData(PROP_PATH, "Password"));		
		hp.clickOnTasksModule();		
		tsp.clickOnProjectAndCustomers();		
		tsp.createCustomerByAdmin(flib.readExcelData(EXCEL_PATH, CUSTOMERCREDS_SHEET, 1, 0));		
		tsp.createProjectByAdmin(flib.readExcelData(EXCEL_PATH, CUSTOMERCREDS_SHEET, 1, 0), flib.readExcelData(EXCEL_PATH, PROJECT_CREDS, 1, 0));
		hp.clickOnLogoutLink();
		
		//ts.deleteCustomerNProject();
	}	
}

