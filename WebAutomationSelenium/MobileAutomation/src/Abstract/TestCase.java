package Abstract;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestCase {
	

	
	private String reportDirectory = "reports";
	private String reportFormat = "xml";
	private String testName = "TestMp3Player";
	private AndroidDriver<AndroidElement> driver = null;

	DesiredCapabilities dc = new DesiredCapabilities();
	
	private String _sUDID;
	private String _sAppPackage;
	private String _sAppActivity;
	
	public TestCase(String sUDID, String sAppPackage, String sAppActivity)
	{
		_sUDID = sUDID;
		_sAppPackage = sAppPackage;
		_sAppActivity = sAppActivity;
		
	}
	public TestCase()
	{
		String sUDID = "6PQ7N17411000931";
		String sAppPackage = "com.example.android.uamp.next";
		String sAppActivity = "com.example.android.uamp.MainActivity";
		
		_sUDID = sUDID;
		_sAppPackage = sAppPackage;
		_sAppActivity = sAppActivity;
		
	}
	/* N
	  	dc.setCapability(MobileCapabilityType.UDID, "6PQ717411000931");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.example.android.uamp.next");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.example.android.uamp.MainActivity");
	 */
	

	public void BeforeTest() throws MalformedURLException {
	dc.setCapability("reportDirectory", reportDirectory);
	dc.setCapability("reportFormat", reportFormat);
	dc.setCapability("testName", testName);
	dc.setCapability(MobileCapabilityType.UDID, _sUDID);
	dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, _sAppPackage);
	dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, _sAppActivity);
	driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
	}
}
