package SeleniumProj_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity_6 {

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

	WebElement username = driver.findElement(By.id("user_name"));
	WebElement userpassword = driver.findElement(By.id("username_password"));
	username.sendKeys("admin");
	userpassword.sendKeys("pa$$w0rd");
	
	WebElement buttonlogin = driver.findElement(By.id("bigbutton"));
	buttonlogin.click();
	// getting title of new page
	String titlename = driver.getTitle();
		//navigating toolbar for ACTIVITIES
	WebElement navigationbar = driver.findElement(By.id("grouptab_3"));
	//printing
	System.out.println(navigationbar);
	navigationbar.getText();
	//navigationbar.getAttribute("style");
	System.out.println("Menu Bar has option of  "+ navigationbar.getText());
	Assert.assertEquals(navigationbar.getText(), "ACTIVITIES");
}
	
	
	@AfterTest

	public void aftertest()
	{
		driver.close();
	}
	
	
}
