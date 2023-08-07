package testNG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod1 
{
  @Test
  public void testMethod1() 
  {
	  long thID1 = Thread.currentThread().getId();
	  Reporter.log("Thread ID of testMethod1 :" +thID1, true);
  }
  @Test
  public void testMethod2()
  {
	  long thID2 = Thread.currentThread().getId();
	  Reporter.log("Thread ID of testMethod2 :" +thID2, true);
  }
}
