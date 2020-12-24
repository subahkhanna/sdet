package SeleniumProj_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity_3 {

WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		//Initializing driver
		driver = new FirefoxDriver();
		//opening site
		driver.get("https://alchemy.hguy.co/crm/");
	}
	
	@Test
	public void testmain() throws InterruptedException
	{
//	WebElement idlocator = driver.findElement(By.id("admin_options"));
	WebElement idlocator = driver.findElement(By.id("admin_options"));
	//System.out.println("value of idlocator is "+ idlocator);
	idlocator.getText();
	System.out.println(idlocator.getText());
	Thread.sleep(1000);
}

@AfterTest

public void aftertest()
{
	driver.close();
}
	
	
	
}
