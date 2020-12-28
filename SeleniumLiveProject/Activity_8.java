package SeleniumProj_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity_8 {
	
WebDriver driver;
WebDriverWait wait;
	
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
	
	//navigating toolbar for SALES
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
	 
	// finding option - Accounts in drop down
	WebElement accountsinfo = driver.findElement(By.id("moduleTab_9_Accounts"));
	String accountname = accountsinfo.getText();
	System.out.println("Accounts Page is displaying" + accountname );
	Assert.assertEquals(accountsinfo.getText(), "Accounts");
	//Accounts page should be displayed
	Actions action2 = new Actions(driver);
	action2.moveToElement(navigationbar).click().build().perform();
	
	//wait for accounts table to load
	
	action.moveToElement(accountsinfo).click().build().perform();
	
	//WebElement ACCOUNTS = driver.findElement(By.xpath("//div[@id='content']/div[@class='moduleTitle']/h2"));
	WebElement ACCOUNTS = driver.findElement(By.xpath("//div[@id='content']"));
	System.out.println("TABLE HEADER" + ACCOUNTS );
	//wait.until(ExpectedConditions.visibilityOf(ACCOUNTS));

	for (int i = 1; i < 10; i += 2) {
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[contains(@class,'table-responsive')]/tbody/tr[" + i + "]/td[@field='name']")));

		WebElement name = driver.findElement(By.xpath("//table[contains(@class,'table-responsive')]/tbody/tr[" + i +"]/td[@field='name']"));
		
		System.out.println("name: " + name.getText());
	}
	
	}

	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
	
}
