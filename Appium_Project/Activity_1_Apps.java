package Appium_Project;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity_1_Apps {
	 WebDriverWait wait;
	AndroidDriver<MobileElement> driver;

	@BeforeTest
	public void beforeClass() throws MalformedURLException{
		// Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel 4 Pie");
		caps.setCapability("platformName", "Android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.google.android.apps.tasks");
		caps.setCapability("appActivity", ".ui.TaskListsActivity");
		caps.setCapability("noReset", true);

		// Instantiate Appium Driver
		URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, caps);
		 wait = new WebDriverWait(driver, 5);
	}       

	@Test
    public void addtask1() {
    	
    	
    	driver.findElementByAccessibilityId("Create new task").click();
    	  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("com.google.android.apps.tasks:id/add_task_title")));
       
        
         // Find the new task fields
         
        MobileElement newTask = driver.findElementByXPath("//android.widget.EditText[@text='New task']");
         	
         
         // Enter the text in the fields
         newTask.sendKeys("Complete Activity with Google Tasks");
     
         // Save the contact
         driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
         
         // Wait for contact card to appear
         wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("task_name")));

         // Assertion
         MobileElement taskOne = driver.findElementById("task_name");
         Assert.assertTrue(taskOne.isDisplayed());
         
         String contactName = driver.findElementById("task_name").getText();
         Assert.assertEquals(contactName, "Complete Activity with Google Tasks");
         System.out.println("Task 1 added successfully");
     }
    
    @Test
    public void addtask2() {
    	// driver.findElementByAccessibilityId("Create new task").click();
    	  driver.findElementByAccessibilityId("Create new task").click();
    	  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("com.google.android.apps.tasks:id/add_task_title")));
       
        
         // Find the new task fields
         
        MobileElement newTask = driver.findElementByXPath("//android.widget.EditText[@text='New task']");
         	
         
         // Enter the text in the fields
         newTask.sendKeys("Complete Activity with Google Keep");
     
         // Save the contact
         driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
         
         // Wait for contact card to appear
         wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("task_name")));

         // Assertion
         MobileElement taskOne = driver.findElementById("task_name");
         Assert.assertTrue(taskOne.isDisplayed());
         
         String contactName = driver.findElementById("task_name").getText();
         Assert.assertEquals(contactName, "Complete Activity with Google Keep");
         
         System.out.println("Task2 added successfully");
     }
    @Test
    public void addtask3() {
    	 //driver.findElementByAccessibilityId("Create new task").click();
    	  driver.findElementByAccessibilityId("Create new task").click();
    	  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("com.google.android.apps.tasks:id/add_task_title")));
        
         // Find the new task fields
         
        MobileElement newTask = driver.findElementByXPath("//android.widget.EditText[@text='New task']");
         	
         
         // Enter the text in the fields
         newTask.sendKeys("Complete the second Activity Google Keep");
     
         // Save the contact
         driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
         
         // Wait for contact card to appear
         wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("task_name")));

         // Assertion
         MobileElement taskOne = driver.findElementById("task_name");
         Assert.assertTrue(taskOne.isDisplayed());
         
         String contactName = driver.findElementById("task_name").getText();
         Assert.assertEquals(contactName, "Complete the second Activity Google Keep");
         
         System.out.println("Task 3 added successfully");
     }


    @AfterClass
    public void tearDown() {
        //driver.quit();
    }
}
