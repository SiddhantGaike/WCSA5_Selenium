package TestPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericPackge.BaseTest;
import GenericPackge.Flib;
import PagePackage.LoginPage;

public class ValidLoginTestCase extends BaseTest
{
  @Test
  public void validLogin() throws IOException 
  {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  
	  Flib flib = new Flib();
	  LoginPage lp = new LoginPage(driver);
	  
	  lp.validloginMethod(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));	  
  }
  
  @Test (priority = 1)
  public void invalidLogin() throws EncryptedDocumentException, IOException
  {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  
	  Flib flib = new Flib();
	  LoginPage lp = new LoginPage(driver);
	  
	  int rc = flib.getLastRowCount(EXCEL_PATH, INVALIDCREDS_SHEET);
	  for(int i=1;i<=rc;i++)
	  {
		  lp.invalidLoginMethod(flib.readExcelData(EXCEL_PATH, INVALIDCREDS_SHEET, i, 0),flib.readExcelData(EXCEL_PATH, INVALIDCREDS_SHEET, i, 1));
	  }
  }
}
