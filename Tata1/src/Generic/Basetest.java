package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements Auto_constants {
	
	public WebDriver driver;
	static
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		
	}
	@BeforeMethod
	public void openi3m()
	{
		driver=new ChromeDriver();
		driver.get(APP_URL);
		
	}
	
	@AfterMethod()
	public void closeapp()
	{
		driver.quit();
	}
}


