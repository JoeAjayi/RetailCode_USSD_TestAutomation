package com.fbistech.Utility;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchMobileUtility {

	
	
	protected AndroidDriver driver; 
//	AppiumDriver<MobileElement> driver; 

	
	
	public static AndroidDriver getAndroidDriver()
	{
		AppiumDriver driver = null;
		
		
	 try {		
		 
		DesiredCapabilities caps = new DesiredCapabilities(); 
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "LG-M150");
		caps.setCapability(MobileCapabilityType.UDID, "LGM1509362ee13");
		caps.setCapability("appPackage", "com.android.contacts");
		caps.setCapability("appActivity", "com.android.contacts.activities.DialtactsActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub"); 
		driver = new AndroidDriver<MobileElement> (url, caps);
//		driver = new AppiumDriver<MobileElement> (url, caps); 

			
//		driver = (AppiumDriv r<MobileElement>) new AppiumDriver<MobileElement> (url, caps); //object of android driver 

		driver.findElementByXPath("//*[@text='Next']").click();
		driver.findElementByXPath("//*[@text='Next']").click();
		driver.findElementByXPath("//*[@text='OK']").click();
				 
		
	 	}
	 		catch(MalformedURLException e)
	 	{
	 		System.out.println("Could not read Mobile setCapability");
//	 		e.printStackTrace();
	 	}
	 return (AndroidDriver) driver;
	  
	}

	
}
