package com.fbistech.SubDealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class VendAirtime_SubDealerToCustomer extends BasePage {
	
	
	public VendAirtime_SubDealerToCustomer(AppiumDriver driver)
	{
		super(driver);
	}
	
	
		
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement textField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement call_Btn;
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement pinInPutField;
	
	
	@AndroidFindBy(xpath = "//*[@text='SEND']")
	private AndroidElement sendPIN_Btn;
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement accountBalancePopUp;
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement balanceOK_Button;
	
	

	
//	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Close\"]")
//	private AndroidElement smsCancel_Btn;
	

	
	
	public String validateSubdealerVendAirtimeTo_Customer(String subDealerVendAirtimeToCustomer1, String subDealer_PIN) throws Exception
	{ 
//		Dial Short code 
//		textField.sendKeys("*878*878*09135212172*1#");
		textField.sendKeys(subDealerVendAirtimeToCustomer1);
		call_Btn.click();
		Thread.sleep(5000);
		
//		Enter PIN 
		pinInPutField.sendKeys(subDealer_PIN);
		sendPIN_Btn.click();
		Thread.sleep(8000);

//		Thread.sleep(10000);
//		smsCancel_Btn.click();
		
		
		String balance = accountBalancePopUp.getText();
		Thread.sleep(6000);
		 
		balanceOK_Button.click();
		return balance;
		
		
	} 
	
}
