package testNG2;

import org.testng.annotations.Test;

public class Flag3 
{
  @Test
  public void method1() 
  {
	  System.out.println("Method1");
  }
  
  @Test(enabled = true)
  public void method2() 
  {
	  System.out.println("Method2");
  }
}
