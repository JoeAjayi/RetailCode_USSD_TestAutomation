package com.fbistech.Utility;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchSamsungMobileUtilit {
	
	protected AppiumDriver driver; 
//	AppiumDriver<MobileElement> driver; 

	
	
	public static AppiumDriver initializeMobileAndroidDriver()
	{
		AppiumDriver driver = null;
		
		
	 try {		
		  
		DesiredCapabilities caps = new DesiredCapabilities(); 
//		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
//		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Infinix X690");
//		caps.setCapability(MobileCapabilityType.UDID, "055802507L002551");
//		caps.setCapability("appPackage", "com.sh.smart.caller");
//		caps.setCapability("appActivity", "com.android.dialer.app.DialtactsActivity");
		
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "SM-N950F");
		caps.setCapability(MobileCapabilityType.UDID, "ce051715dc1f4426017e");
		caps.setCapability("appPackage", "com.samsung.android.contacts");
		caps.setCapability("appActivity", "com.android.dialer.DialtactsActivity");
		
		
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub"); 
//		driver = new AndroidDriver<MobileElement> (url, caps);
		driver = new AppiumDriver<MobileElement> (url, caps); 

			
//		driver = (AppiumDriv r<MobileElement>) new AppiumDriver<MobileElement> (url, caps); //object of android driver 

		driver.findElementByXPath("//*[@resource-id='com.samsung.android.contacts:id/floating_action_button_container']").click();
		
	
//		driver.findElementByXPath("//*[@text='OK']").click();
				 
		
	 	}
	 		catch(MalformedURLException e)
	 	{
	 		System.out.println("Could not read Mobile setCapability");
//	 		e.printStackTrace();
	 	}
	 return (AppiumDriver) driver;
	  
	}


}
