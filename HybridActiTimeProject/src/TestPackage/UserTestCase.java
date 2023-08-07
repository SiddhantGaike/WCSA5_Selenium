package TestPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericPackge.BaseTest;
import GenericPackge.Flib;
import PagePackage.HomePage;
import PagePackage.LoginPage;
import PagePackage.UsersPage;

public class UserTestCase extends BaseTest
{
  @Test
  public void createUserManager() throws IOException, EncryptedDocumentException, InterruptedException 
  {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  
	  Flib flib = new Flib();
	  LoginPage lp = new LoginPage(driver);
	  HomePage hp = new HomePage(driver);
	  UsersPage usp = new UsersPage(driver);
	  
      lp.validloginMethod(flib.readPropertyData(PROP_PATH, "Username"), flib.readPropertyData(PROP_PATH, "Password"));
	  hp.clickOnUsersModule();
	  usp.createUserManager(flib.readExcelData(EXCEL_PATH, MANAGER_CREDS, 1, 0),flib.readExcelData(EXCEL_PATH, MANAGER_CREDS, 1, 1),flib.readExcelData(EXCEL_PATH, MANAGER_CREDS, 1, 2),flib.readExcelData(EXCEL_PATH, MANAGER_CREDS, 1, 3),flib.readExcelData(EXCEL_PATH, MANAGER_CREDS, 1, 4));
	  hp.clickOnLogoutLink();
  }
  
  @Test(dependsOnMethods = "createUserManager")
  public void createUserByManager() throws EncryptedDocumentException, IOException
  {
	  Flib flib = new Flib();
	  LoginPage lp = new LoginPage(driver);
	  HomePage hp = new HomePage(driver);
	  UsersPage usp = new UsersPage(driver);
	  
      lp.validloginMethod(flib.readExcelData(EXCEL_PATH, VALIDCREDS_SHEET, 2, 0),flib.readExcelData(EXCEL_PATH, VALIDCREDS_SHEET, 2, 1));
	  hp.clickOnUsersModule();  
	  usp.createUserByManager(flib.readExcelData(EXCEL_PATH, USER_CREDS, 1, 0), flib.readExcelData(EXCEL_PATH, USER_CREDS, 1, 1), flib.readExcelData(EXCEL_PATH, USER_CREDS, 1, 2), flib.readExcelData(EXCEL_PATH, USER_CREDS, 1, 3), flib.readExcelData(EXCEL_PATH, USER_CREDS, 1, 4)); 
	  hp.clickOnLogoutLink();
  }
}
