package Selenium_Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5_1 {

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
		System.setProperty("webdriver.gecko.driver","C:\\Users\\SubahKhanna\\Downloads\\geckodriver-v0.28.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
 
        //Open the browser
        driver.get("https://www.training-support.net/selenium/dynamic-controls");
 
        //Find the checkbox
        WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("The checkbox Input is displayed: " + checkboxInput.isDisplayed());
 
        driver.findElement(By.id("toggleCheckbox")).click();
 
        System.out.println("The checkbox Input is displayed: " + checkboxInput.isDisplayed());
 
        //Close the browser
        driver.close();

	}

}
