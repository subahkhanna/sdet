package SeleniumProj_Practise;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity_7 {
	
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
	WebElement navigationbar = driver.findElement(By.id("grouptab_0"));
	String textsales = navigationbar.getText();
	Assert.assertEquals(textsales,"SALES");
	
	System.out.println(textsales);
	// wait at SALES
	WebDriverWait wait1 = new WebDriverWait(driver, 50);
	wait1.until(ExpectedConditions.visibilityOf(navigationbar));
		//navigationbar.click();
	// SALES is selected
	  Actions action = new Actions(driver);
	  action.moveToElement(navigationbar).click().build().perform();
	 
	// finding option - leads in drop down
	WebElement leadinfo = driver.findElement(By.id("moduleTab_9_Leads"));
	leadinfo.click();
	//Page should display
	 Thread.sleep(500);
	//finding additional information
    WebElement additionalinfo = driver.findElement(By.xpath("//table[contains(@class,'table-responsive')]/tbody/tr[2]/td[10]/span/span[contains(@title,'Additional')]"));
    Actions action1 = new Actions(driver);
	  action1.moveToElement(additionalinfo).click().build().perform();
    
	 System.out.println(additionalinfo.getText());
	  //wait1.until(ExpectedConditions.visibilityOf(leadinfo));
	  additionalinfo.click();
		 Thread.sleep(1000);
    WebElement phone = driver.findElement(By.xpath("//div[2]/span[@class='phone']"));	 
	 String phonenumber = phone.getText();
    System.out.println("Phone Number is "+ phonenumber);
	
	}
	
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}

}
