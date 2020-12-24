package SeleniumProj_Practise;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Activity_1 {

	WebDriver driver;
	
	@BeforeTest
	public void beforemethod(){
		//Initializing driver
	driver = new FirefoxDriver();
	//opening site
	driver.get(" https://alchemy.hguy.co/crm/");
	}
	
@Test
	public void testtitle()
	{
		//Getting site title
		String titlename = driver.getTitle();
		System.out.println(titlename);
		Assert.assertEquals(titlename, "SuiteCRM");	
		
	}
	
	@AfterTest
	
	public void aftertest()
	{
		driver.close();
	}
	
	
}
