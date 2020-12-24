package SeleniumProj_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity_2 {

	WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		//Initializing driver
		driver = new FirefoxDriver();
		//opening site
		driver.get(" https://alchemy.hguy.co/crm/");
	}
	
@Test
		public void testmain() throws InterruptedException
		{
	//	WebElement idlocator = driver.findElement(By.xpath("/html/body/div[1]/div[1]/a"));
		WebElement idlocator = driver.findElement(By.tagName("a"));
		//System.out.println("value of idlocator is "+ idlocator);
		idlocator.getAttribute("href");
		System.out.println(idlocator.getAttribute("href"));
		Thread.sleep(1000);
	}
	
	@AfterTest
	
	public void aftertest()
	{
		driver.close();
	}
	
}
