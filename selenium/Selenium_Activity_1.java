package Selenium_Activities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Selenium_Activity_1 {
	
	 public static void main(String[] args) 
	 {
		 
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\SubahKhanna\\Downloads\\geckodriver-v0.28.0-win64\\geckodriver.exe");
	        //Create a new instance of the Firefox driver
	        WebDriver driver = new FirefoxDriver();

	        //Open the browser
	        driver.get("https://www.example.com");
	        
	        //Perform testing and assertions
	      

	        //Close the browser
	        driver.close();

}
}



