package com.fbistech.Dealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FundRecallSubDealer_To_SubDealerOnSameDealer extends BasePage {
	
//	Initialize the Page Objects
	public FundRecallSubDealer_To_SubDealerOnSameDealer(AppiumDriver driver)
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
	
	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement invalidFund_PopUp;

	

	
	public String validateSubdealerRecallFund_from_SubDealer(String subDealerRecallFund_from_SubDealer, 
			String subDealerRecallAmountS_S, String subDealer_PIN) throws Exception
	{
//		starBtn.click();
//		textInputField.sendKeys("*878*999*33*1*00695#");
		textInputField.sendKeys(subDealerRecallFund_from_SubDealer);
		callButton.click();
		Thread.sleep(8000);
		
//		Amount to Recall
		pinInPutField.sendKeys(subDealerRecallAmountS_S);
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
