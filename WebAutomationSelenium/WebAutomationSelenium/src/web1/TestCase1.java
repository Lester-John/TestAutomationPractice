package web1;
import java.util.Properties;

import org.junit.*;
import Abstract.*;
import util.PropertyHelper;

import org.junit.Test.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.FindsByLinkText;
import org.openqa.selenium.remote.RemoteWebDriver;
public class TestCase1 extends AbstractTestCase{

	
	
	@org.junit.Test
	public void ttTest()
	{
		
		driver.findElement(By.linkText("For Me")).click();  
		//driver.findElement(By.xpath("//*[contains(@class, 'CHAM_tabButton vAlignMiddle')]//*[text() = 'For Me']")).click();
	    driver.findElement(By.linkText("Bank accounts")).click();/// this i copied from your file
		//driver.findElement(By.linkText("closeButton")).click();/// this i copied from your file
		driver.findElement(By.xpath("//*[@id=\"zaSkin\"]/body/div[4]/div/div/div[1]/div/a/span")).click();
        driver.findElement(By.id(PropertyHelper.ReadProperty("inputdata", "object.username"))).sendKeys(PropertyHelper.ReadProperty("inputdata", "data.username"));
        driver.findElement(By.id(PropertyHelper.ReadProperty("inputdata", "object.password"))).sendKeys(PropertyHelper.ReadProperty("inputdata", "data.password"));
        driver.findElement(By.id("OBSubmit")).click();
        Assert.assertTrue(driver.findElement(By.id("section1")).isDisplayed());

	}
	
}
