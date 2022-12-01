package com.fbistech.Dealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FundRecallSubDealer_To_RetailerUnderDealer extends BasePage {
	
//	Initialize the Page Objects
	public FundRecallSubDealer_To_RetailerUnderDealer(AppiumDriver driver)
	{
		super(driver);
	}
	
	
	
	
	
//	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"Asterisk\"]/android.widget.TextView") 
//	private AndroidElement starBtn;
//	
//	@AndroidFindBy(xpath = "//*[@resource-id='com.samsung.android.contacts:id/digits']") 
//	private AndroidElement textField;	
//	
//	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Call button\"]")
//	private AndroidElement callButton;
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement textInputField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement callButton;
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']") 
//	@AndroidFindBy(xpath = "//*[@resource-id='com.android.phone:id/input_field']")
	private AndroidElement pinInPutField;
	
	@AndroidFindBy(xpath = "//*[@text='SEND']")
	private AndroidElement sendPinButton;
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement accountBalanceResponse;
	
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement ok_Button;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Close\"]")
	private AndroidElement smsCancel_Btn;
	
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
//	private AndroidElement invalidFund_PopUp;
//
	

	
	public String validateSubdealerRecallFund_from_RetailerUnderDealer(String subDealerRecallFundfromR_D, String subDealerRecallAmountR_D, 
			String subDealer_PIN) throws Exception
	{
//		starBtn.click();
//		textInputField.sendKeys("*878*999*33*1*004080#");
		textInputField.sendKeys(subDealerRecallFundfromR_D);  
		callButton.click(); 
		Thread.sleep(7000);
		
//		Amount to Recall
		pinInPutField.sendKeys(subDealerRecallAmountR_D);
		sendPinButton.click();
		Thread.sleep(5000);
		
//		Enter PIN to complete Fund Recall
		pinInPutField.sendKeys(subDealer_PIN);
		sendPinButton.click();
		Thread.sleep(5000);
		
		String balance = accountBalanceResponse.getText();
		Thread.sleep(7000);
		
		ok_Button.click();

		return balance;
	}

}
