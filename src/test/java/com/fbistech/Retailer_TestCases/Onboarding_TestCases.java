package com.fbistech.Retailer_TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.Retailer.OnboardingDirectly_RetailerUnder_FBIS_Dealer;
import com.fbistech.Retailer.OnboardingDirectly_RetailerUnder_FBIS_SubDealer;
import com.fbistech.Retailer.Onboarding_RetailerUnder_Dealer;
import com.fbistech.Retailer.Onboarding_RetailerUnder_SubDealer;
import com.fbistech.SubDealer.Onboarding_SubDealerUnder_Dealer;
import com.fbistech.Utility.LaunchMobileUtility;
import com.fbistech.Utility.LaunchMobile_SMS_Utility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Onboarding_TestCases {
	
//	AndroidDriver driver = LaunchMobileUtility.getAndroidDriver();
	
	AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();
	

	public static Properties prop;
	 
	public static FileInputStream input;
	
	Onboarding_RetailerUnder_Dealer onboarding_RetailerUnder_Dealer;

	@BeforeMethod
	public void setUp()
	{
		initializePropFile();
		onboarding_RetailerUnder_Dealer = new Onboarding_RetailerUnder_Dealer(driver);
	}
	
	
//	@Test(priority = 1)
	public void verifyRetailerCanOnboardUnderDealer()throws Exception
	{
		Onboarding_RetailerUnder_Dealer retailerOnboardUnder_Dealer = new Onboarding_RetailerUnder_Dealer(driver);
		String registrationDetails = retailerOnboardUnder_Dealer.validateRetailerOnboardUnderDealer();
		System.out.println(retailerOnboardUnder_Dealer);
		Thread.sleep(19000);
	}
	
	
//	@Test(priority = 2)
	public void verifyRetailerCanOnboardUnderSubDealer()throws Exception
	{
		Onboarding_RetailerUnder_SubDealer retailerOnboardUnder_SubDealer = new Onboarding_RetailerUnder_SubDealer(driver);
		String registrationDetails = retailerOnboardUnder_SubDealer.validateRetailerOnboardUnderSubdealer();
		System.out.println(registrationDetails);
		Thread.sleep(19000);
	
	}
	 

	 
//	@Test(priority = 3)
	public void verifyRetailerCanOnboardDirectlyUnderFBISDealer()throws Exception
	{
		OnboardingDirectly_RetailerUnder_FBIS_Dealer retailerOnboardDirectlyUnder_Dealer = new OnboardingDirectly_RetailerUnder_FBIS_Dealer(driver);
		String registrationDetails = retailerOnboardDirectlyUnder_Dealer.validateRetailerOnboardDirectlyUnderDealer();
		System.out.println(registrationDetails);
		Thread.sleep(19000);
	}
	
	
//	@Test(priority = 4) 
	public void verifyRetailerCanOnboardDirectlyUnderFBISSubDealer()throws Exception
	{
		OnboardingDirectly_RetailerUnder_FBIS_SubDealer retailerOnboardDirectlyUnder_SubDealer = new OnboardingDirectly_RetailerUnder_FBIS_SubDealer(driver);
		String registrationDetails = retailerOnboardDirectlyUnder_SubDealer.validateRetailerOnboardDirectlyUnderSubDealer();
		System.out.println(registrationDetails);
		Thread.sleep(19000);
	}
	
	
	

	@AfterMethod 
	public void tearDown() throws Exception
	{
		Thread.sleep(6000);
		driver.quit(); 
	} 
	
	
	
	
	
	public void initializePropFile() 
	{
		try  
		{
//			Now instantiate by calling the constructor of properties  
			prop = new Properties();
				
//			Instantiate 
			FileInputStream input = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/fbistech/config/config.properties");	

//			Load file input stream 
			prop.load(input);	
		}
		
		
		catch (FileNotFoundException e) 
		{ 
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

	

}
