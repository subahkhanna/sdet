package Activities;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity2_1 {
	AndroidDriver<MobileElement> driver;
	
	@BeforeTest
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel 4 Pie");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity", ".Calculator");
        caps.setCapability("noReset", true);
        
        // Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
	}
       @Test
       public void multiply1()
       {
    	 driver.findElementById("digit_7").click();
    	 driver.findElementById("op_mul").click();
    	 driver.findElementById("digit_4").click();
       driver.findElementById("eq").click();
       
       // Display Result
       String result = driver.findElementById("result").getText();
       System.out.println(result);
       Assert.assertEquals(result, "28");
       }
       
       @Test
       public void subtract() {
           driver.findElementById("digit_1").click();
           driver.findElementById("digit_0").click();
           driver.findElementById("op_sub").click();
           driver.findElementById("digit_5").click();
           // Perform Calculation
           driver.findElementById("eq").click();
    
           // Display Result
           String result = driver.findElementById("result").getText();
           System.out.println(result);
           Assert.assertEquals(result, "5");
       }
       
       @Test
       public void multiply() {
           driver.findElementById("digit_5").click();
           driver.findElementById("op_mul").click();
           driver.findElementById("digit_1").click();
           driver.findElementById("digit_0").click();
           driver.findElementById("digit_0").click();
           // Perform Calculation
           driver.findElementById("eq").click();
    
           // Display Result
           String result = driver.findElementById("result").getText();
           System.out.println(result);
           Assert.assertEquals(result, "500");
       }
    
       @Test
       public void divide() {
           driver.findElementById("digit_5").click();
           driver.findElementById("digit_0").click();
           driver.findElementById("op_div").click();
           driver.findElementById("digit_2").click();
           // Perform Calculation
           driver.findElementById("eq").click();
    
           // Display Result
           String result = driver.findElementById("result").getText();
           System.out.println(result);
           Assert.assertEquals(result, "25");
       }
    
    
   @AfterClass
       public void afterClass()
       {
	   
       driver.quit();
       }
       
}
