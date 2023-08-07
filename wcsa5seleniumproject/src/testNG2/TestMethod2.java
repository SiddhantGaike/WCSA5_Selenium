package testNG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod2 {
	@Test
	  public void testMethod3() 
	  {
		  long thID3 = Thread.currentThread().getId();
		  Reporter.log("Thread ID of testMethod3 :" +thID3, true);
	  }
	  @Test
	  public void testMethod4()
	  {
		  long thID4 = Thread.currentThread().getId();
		  Reporter.log("Thread ID of testMethod4 :" +thID4, true);
	  }
}
