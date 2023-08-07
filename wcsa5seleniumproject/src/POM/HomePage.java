package POM;

import java.io.IOException;

public class HomePage extends BaseTest
{

	public static void main(String[] args) throws IOException 
	{
		BaseTest bt = new BaseTest();
		bt.setUp();
	
		Flib flib = new Flib();
		
		LoginPage lp = new LoginPage(driver);
		lp.validloginMethod(flib.readPropertyData(PROP_PATH, "Username"), flib.readPropertyData(PROP_PATH, "Password"));
		lp.createCustomerMethod();
	}

}
