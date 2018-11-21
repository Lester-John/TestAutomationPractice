package Abstract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.PropertyHelper;

import org.junit.*;
public class AbstractTestCase {
	protected WebDriver driver;
	
	@Before
	public void ttBefore()
	{
		 //Creating a driver object referencing WebDriver interface
       // WebDriver driver;
        
        //Setting the webdriver.chrome.driver property to its executable's location
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	
        //Instantiating driver object
        driver = new ChromeDriver();
        
        
        //Using get() method to open a webpage
        driver.get(PropertyHelper.ReadProperty("inputdata", "base.url"));
        driver.manage().window().maximize();
        //driver.switchTo().alert().accept();
	}
	
	@After
	public void ttAfter()
	{
		//driver.close();
		
	}
}
