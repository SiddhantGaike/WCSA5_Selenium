package testNG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod3 {
	@Test
	  public void testMethod1() 
	  {
		  long thID5 = Thread.currentThread().getId();
		  Reporter.log("Thread ID of testMethod5 :" +thID5, true);
	  }
	  @Test
	  public void testMethod6()
	  {
		  long thID6 = Thread.currentThread().getId();
		  Reporter.log("Thread ID of testMethod6 :" +thID6, true);
	  }
}
