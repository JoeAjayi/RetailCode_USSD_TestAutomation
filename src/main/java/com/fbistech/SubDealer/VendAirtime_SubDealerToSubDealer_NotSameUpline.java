package com.fbistech.SubDealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class VendAirtime_SubDealerToSubDealer_NotSameUpline extends BasePage {
	
	
	
	public VendAirtime_SubDealerToSubDealer_NotSameUpline(AppiumDriver driver)
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
	private AndroidElement sendPIN_Btn;
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement accountBalancePrompt;
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement balanceOK_Button;
	

	
	
	
	public String validateSubdealerVendAirtimeToSubDealer_NotSameUpline(String subDealerVendAirtimeToSubDealer_NotSameUpline, 
			String subDealer_PIN) throws Exception
	{
//		Dial Short code 
		textField.sendKeys(subDealerVendAirtimeToSubDealer_NotSameUpline);
		dial_Button.click();
		Thread.sleep(5000);
		 
//		Enter PIN 
		pinInputField.sendKeys(subDealer_PIN);
		sendPIN_Btn.click();
		Thread.sleep(8000);

		
		String balance = accountBalancePrompt.getText();
		Thread.sleep(6000);
		
		balanceOK_Button.click();
		return balance;
	
	}

	
}
