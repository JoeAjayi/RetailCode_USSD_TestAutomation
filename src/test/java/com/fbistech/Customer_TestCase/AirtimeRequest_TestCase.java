package com.fbistech.Customer_TestCase;

import org.testng.annotations.Test;

import com.fbistech.Customer.AirtimeRequest_CustomerFrom_Dealer;
import com.fbistech.Customer.AirtimeRequest_CustomerFrom_RetailerUnderDealer;
import com.fbistech.Customer.AirtimeRequest_CustomerFrom_RetailerUnderSubdealer;
import com.fbistech.Customer.AirtimeRequest_CustomerFrom_Subdealer;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.android.AndroidDriver;

public class AirtimeRequest_TestCase {

	
	AndroidDriver driver = LaunchMobileUtility.getAndroidDriver();

	
	
	
	@Test(priority = 1)
	public void verifyCustomerCannotRequestAirtimeFrom_Dealer() throws Exception
	{
		AirtimeRequest_CustomerFrom_Dealer customerRequestAirtmeFromDealer = new AirtimeRequest_CustomerFrom_Dealer(driver);
		customerRequestAirtmeFromDealer.customerRequestAirtimeFrom_Dealer();
		Thread.sleep(3000);
		
		String requestPopUp = customerRequestAirtmeFromDealer.validateAirtimeRequestSentPopUp();
		System.out.println(requestPopUp);
		
		Thread.sleep(19000);

	}
	
	 
//	@Test(priority = 2)
	public void verifyCustomerCanRequestAirtimeFrom_RetailerUnderDealer() throws Exception
	{
		AirtimeRequest_CustomerFrom_RetailerUnderDealer customerRequestAirtimeFromRetailerUnderDealer = new AirtimeRequest_CustomerFrom_RetailerUnderDealer(driver);
		customerRequestAirtimeFromRetailerUnderDealer.customerRequestAirtimeFrom_RetailerUnderDealer();
		Thread.sleep(2000);
		String requestPopUp = customerRequestAirtimeFromRetailerUnderDealer.validateAirtimeRequestSentPopUp();
		System.out.println(requestPopUp);
//		String s = requestPopUp;
//		s = s.replaceAll("\\D+", "");
//		System.out.println(s);
//		Assert.assertEquals(requestPopUp, null);

	}
	
	
	
//	@Test(priority = 3)
	public void verifyCustomerCanRequestAirtimeFrom_RetailerUnderSubdealer() throws Exception
	{
		AirtimeRequest_CustomerFrom_RetailerUnderSubdealer customerRequestAirtimeFromRetailerUnderSubdealer = new AirtimeRequest_CustomerFrom_RetailerUnderSubdealer(driver);
		customerRequestAirtimeFromRetailerUnderSubdealer.customerRequestAirtimeFrom_RetailerUnderSubDealer();
		Thread.sleep(19000);
	}
	
	
	@Test(priority = 4)
	public void verifyCustomerCannotsRequestAirtimeFrom_Subdealer() throws Exception
	{
		AirtimeRequest_CustomerFrom_Subdealer customerRequestAirtimeFromSubdealer = new AirtimeRequest_CustomerFrom_Subdealer(driver);
		customerRequestAirtimeFromSubdealer.customerRequestAirtimeFrom_SubDealer();
		
		String requestPopUp = customerRequestAirtimeFromSubdealer.validateAirtimeRequestSentPopUp();
		System.out.println(requestPopUp);
		
		Thread.sleep(19000);
	}
	
	
	
	
	
}
