package com.fbistech.Retailer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class VendAirtime_RetailerToRetailer extends BasePage {
	
	public VendAirtime_RetailerToRetailer(AppiumDriver driver)
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
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement balanceOK_Btn;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Close\"]")
	private AndroidElement smsCancel_Btn;
	

	
	public void retailerVendAirtimeTo_Retailer() throws Exception

	{
		textField.sendKeys("*878*878*09134804274*1#");
		call_Btn.click();
		Thread.sleep(4000);
		pinInPutField.sendKeys("1234");
		sendPIN_Btn.click();
		Thread.sleep(5000);
		balanceOK_Btn.click();
//		Thread.sleep(10000);
//		smsCancel_Btn.click();
		
		
	}
}
