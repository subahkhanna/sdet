package TestNGProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_1 {
	WebDriver driver;
	@BeforeMethod
		public void beforemethod()
		{
			//Create a new instance of the FireFox driver
	        driver = new FirefoxDriver();
	        
	        //Open browser
	        driver.get("https://www.training-support.net");
	
		}
	@Test
	public void ExampleTestCase()
	{
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
	     //Assertion for page title
        Assert.assertEquals("Training Support", title);
                          
        //Find the click link on the page and click it
        driver.findElement(By.id("about-link")).click();
                    
        //Print title of new page
        System.out.println("New page title is: " + driver.getTitle());
        
        Assert.assertEquals(driver.getTitle(), "About Training Support");
	}
	
	 @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	    }
	
	}

