package com.fbistech.SubDealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class VendAirtime_SubDealerToRetailer_NotDownline extends BasePage {
	
	public VendAirtime_SubDealerToRetailer_NotDownline(AppiumDriver driver)
	{
		super(driver);
	}
	
	
		
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement textField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement dial_Button;
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement pinInputField;
	
	
	@AndroidFindBy(xpath = "//*[@text='SEND']")
	private AndroidElement sendPIN_Button;
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement accountBalancePopUp;
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement balanceOK_Button;
	

	
	public String validateSubdealerVendAirtimeToRetailer_NotOnDownline(String subDealerVendAirtimeToRetailer_NotOnDownline,
			String subDealer_PIN) throws Exception
	{ 
		textField.sendKeys(subDealerVendAirtimeToRetailer_NotOnDownline);
		dial_Button.click(); 
		Thread.sleep(5000);
		
//		Enter PIN 
		pinInputField.sendKeys(subDealer_PIN);
		sendPIN_Button.click();
		Thread.sleep(8000);

		
		String balance = accountBalancePopUp.getText();
		Thread.sleep(6000);
		
		balanceOK_Button.click();
		return balance;
	}
}
