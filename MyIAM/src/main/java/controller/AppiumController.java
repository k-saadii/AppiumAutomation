package controller;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;



import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumController {

	public static AppiumDriver<MobileElement> driver;
	
	
	@SuppressWarnings("unchecked")
	public void setUp() throws MalformedURLException
	{
		  File appDir = new File("");
	        File app = new File(appDir, "");
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("device","Android");

	        //mandatory capabilities
	        capabilities.setCapability("deviceName","Android");
	        capabilities.setCapability("platformName","Android");

	        //other caps
	        capabilities.setCapability("app", app.getAbsolutePath());
	        driver =  new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
     
	}
}
