package com.fbistech.BasePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {

	
//	this is an AnddroidDriver object and is declare protected therefore BasePage can be use in sub-classe
//	protected allows you to use BasePage in sub-classes 	
//	Static was used due to error in TestUtil.java class
 	 protected static AndroidDriver driver; 
	
	
	
	
	/*---Reference Variables----*/
	public Properties prop;

	
//	this constructor is accepting AndroidDriver as an object , it takes the driver object and assign it to 
//	AndroidDriver driver object
	
	public BasePage(AndroidDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
//		LaunchMobileUtility.getAndroidDriver();

		

//		initialize input 
		FileInputStream input = null; 
			
		try 
		{
//			Now instantiate by calling the constructor of properties  
			prop = new Properties();
				
//			Instantiate 
			input = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/fbistech/config/config.properties");	
//			input = new FileInputStream("/Users/fbistech-qa/eclipse-workspace/RetailCode_USSD/src/main/java/com/fbistech/config/config.properties");

//			Load file input stream 
			prop.load(input);		
		}
		catch (FileNotFoundException e) 
		{ 
			System.out.println("Errors in config.prop block are catch and printed ");
//			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			if (input != null) 
			{
				try 
				{
					input.close();
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}

		
		
		
		
//		try  
//		{
//			prop = new Properties();
////		    FileInputStream input = new FileInputStream("/Users/fbistech-qa/eclipse-workspace/RetailCode_USSD/src/main/java/com/fbistech/config/config.properties");
//			FileInputStream input = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/fbistech/config/config.properties");
//			prop.load(input);	
//			
//		}
//			catch (FileNotFoundException e) 
//		{ 
//			System.out.println("Errors in config.prop block are catch and printed ");
//			e.printStackTrace();
//		}
//			catch (Exception e)
//		{
//			e.printStackTrace();
//		}
	}
	

	
}
