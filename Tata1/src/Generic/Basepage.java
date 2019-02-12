package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Basepage {

	public WebDriver driver;
	public Basepage()
	{
		PageFactory.initElements(driver,this);
	}

	
	

}
