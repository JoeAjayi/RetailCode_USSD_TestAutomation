package com.fbistech.Utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchMobile_SMS_Utility {

	protected AppiumDriver driver;
//	AppiumDriver<MobileElement> driver; 

	public static AppiumDriver initializeMobileAndroidSMSDriver() {
		AppiumDriver driver = null;

		try {

			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "LG-M150");
			caps.setCapability(MobileCapabilityType.UDID, "LGM1509362ee13");
			caps.setCapability("appPackage", "com.android.mms");
			caps.setCapability("appActivity", "com.android.mms.ui.ConversationList");

			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url, caps);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		driver = (AppiumDriv r<MobileElement>) new AppiumDriver<MobileElement> (url, caps); //object of android driver 

			driver.findElementByXPath("//*[@text='NEXT']").click();

			driver.findElementByXPath("//*[@text='OK']").click();
		
//  		this element picked the first sms in the sms list inbox 
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/"
					+ "android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v4.view.ViewPager/"
					+ "android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
					+ "android.widget.ListView/android.widget.FrameLayout[1]/android.view.View").click();
			
			
//			String fundRequestSMS = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/"
//					+ "android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/"
//					+ "android.widget.FrameLayout/android.widget.RelativeLayout[1]/android.widget.ListView/"
//					+ "android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/"
//					+ "android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/"
//					+ "android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/"
//					+ "android.widget.LinearLayout/android.widget.TextView").getText();
//				
//			
////			String approveToken = fundRequestSMS.getText();
//			
//			StringBuilder sb = new StringBuilder();
//			for (int i = fundRequestSMS.length() - 1; i >= 0; i--) 
//			{
//				char c = fundRequestSMS.charAt(i);
//				if (Character.isDigit(c)) 
//				{
//					sb.insert(0, c);
//				} 
//				else 
//				{
//					break;
//				}
//			}
//			String token = sb.toString();
//			Integer.parseInt(token);
//			System.out.println(token); 



		} catch (MalformedURLException e) {
			System.out.println("Could not read Mobile setCapability");
//	 		e.printStackTrace();
		}
		return (AppiumDriver) driver;

	}

}
