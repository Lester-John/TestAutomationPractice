package mobileAutomation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.*;
import java.net.URL;
import java.net.MalformedURLException;


public class TestCase1 {
private String reportDirectory = "reports";
private String reportFormat = "xml";
private String testName = "TestMp3Player";
protected AndroidDriver<AndroidElement> driver = null;

DesiredCapabilities dc = new DesiredCapabilities();

@Before
public void setUp() throws MalformedURLException {
	dc.setCapability("reportDirectory", reportDirectory);
	  dc.setCapability("reportFormat", reportFormat);
	  dc.setCapability("testName", testName);
	  dc.setCapability(MobileCapabilityType.UDID, "6PQ7N17411000931");
	  driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
}

@Test
public void TestMp3Player() {
	 driver.startActivity("com.example.android.uamp.next", "com.example.android.uamp.MainActivity");
	  driver.findElement(By.xpath("//*[@text=concat('Irsen', \"'\", 's Tale')]")).click();
	  driver.swipe(487, 1653, 468, 2290, 767);
	  driver.swipe(456, 1062, 456, 412, 779);
	  driver.findElement(By.xpath("//*[@text='Outro']")).click();
	  new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='item_state' and ./following-sibling::*[@text='Outro']]")));
	  driver.findElement(By.xpath("//*[@id='item_state' and ./following-sibling::*[@text='Outro']]")).click();

}

@After
public void tearDown() {
   driver.quit();
}
}