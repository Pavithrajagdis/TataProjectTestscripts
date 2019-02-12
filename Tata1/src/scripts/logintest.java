package scripts;

import org.testng.annotations.Test;

import Generic.Basetest;
import pom.loginpage;

public class logintest extends Basetest {
	@Test
	public void testlogin()
	{
		loginpage lp=new loginpage(driver);
		lp.enterUsernameTB();
		lp.enterPasswordTb();
		lp.CLKarw();
		lp.TSK();
		lp.CLKlogin();
		
		
	}
	

}


