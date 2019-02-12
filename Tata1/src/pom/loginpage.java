package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	@FindBy(xpath="//input[@id='__xmlview1--userName-inner']")
    WebElement UsernameTB;
	@FindBy(xpath="//input[@id='__xmlview1--password-inner']")
	WebElement PasswordTB;
	@FindBy(xpath="//span[@id='__xmlview1--site-arrow']")
	WebElement CLKarw;
	@FindBy(xpath="//li[.='TSK']")
	WebElement TSK;
	@FindBy(xpath="//bdi[.='Log In']")
	WebElement CLKlogin;
	
	public loginpage(WebDriver driver) {

		PageFactory.initElements(driver,this);
	}
	
	public void enterUsernameTB()         //String Username
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
UsernameTB.sendKeys("152446");
}
	public void enterPasswordTb()            //String Password
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PasswordTB.sendKeys("Admin");

}
	public void CLKarw()
	{
		try {
			CLKarw.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void TSK()
	{
		try {
			TSK.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void CLKlogin()
	{
		try {
			CLKlogin.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

