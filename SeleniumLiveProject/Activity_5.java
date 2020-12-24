package SeleniumProj_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity_5 {

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
	WebElement username = driver.findElement(By.id("user_name"));
	WebElement userpassword = driver.findElement(By.id("username_password"));
	username.sendKeys("admin");
	userpassword.sendKeys("pa$$w0rd");
	
	WebElement buttonlogin = driver.findElement(By.id("bigbutton"));
	buttonlogin.click();
	// getting title of new page
	String titlename = driver.getTitle();
		
	// getting background color of Navigation Bar
	WebElement navigationbar = driver.findElement(By.className("desktop-toolbar"));
	System.out.println(navigationbar);
	navigationbar.getText();
	String colorof = navigationbar.getCssValue("background-color");
	//navigationbar.getAttribute("style");
	System.out.println("Background color is "+ colorof);
}
	
	@AfterTest

	public void aftertest()
	{
		driver.close();
	}
	
	
	
}
