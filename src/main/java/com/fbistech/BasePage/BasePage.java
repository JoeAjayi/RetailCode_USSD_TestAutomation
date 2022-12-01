package com.fbistech.BasePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {

	
//	this is an AnddroidDriver object and is declare protected therefore BasePage can be use in sub-classe
//	protected allows you to use BasePage in sub-classes 	
//	Static was used due to error in TestUtil.java class
 	 protected static AppiumDriver driver; 
	
	
	

	
//	this constructor is accepting AppiumDriver as an object , it takes the driver object and assign it to 
//	Appium Driver driver object
	 
	public BasePage(AppiumDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
//		LaunchMobileUtility.initializeMobileAndroidDriver();		
	
	}

	
}
