package web1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.*;

public class webAutomation {

	    public static void main(String[] args) {
	        
	        //Creating a driver object referencing WebDriver interface
	        WebDriver driver;
	        
	        //Setting the webdriver.chrome.driver property to its executable's location
	        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
	        //Instantiating driver object
	        driver = new ChromeDriver();
	        
	        //Using get() method to open a webpage
	        driver.get(PropertyHelper.ReadProperty("inputdata", "base.url"));
	        
	        //Closing the browser
	        //driver.quit();
	 
	    }
	 
	}

