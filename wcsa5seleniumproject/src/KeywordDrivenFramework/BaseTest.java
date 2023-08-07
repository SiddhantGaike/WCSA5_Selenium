package KeywordDrivenFramework;

import org.openqa.selenium.WebDriver;

public class BaseTest extends Flib implements IAutoConstant
{
	static WebDriver driver;
	public void openBrowser()
	{
		System.setProperty(PROP_PATH, "Browser");
		
	}	
}
