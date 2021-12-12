package com.fbistech.SubDealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ApproveCustomerRechargeLaterRequest_SubDealer extends BasePage {
	
//	Initialize the Page Objects
	public ApproveCustomerRechargeLaterRequest_SubDealer (AppiumDriver driver)
	{
		super(driver);
	}
	
	

	
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
	

	
	public String validateSubdealerApproveCustomerRechargeLaterRequest() throws Exception
	{
		
//		textField.sendKeys(subDealerToRetailerDownline);
		textInputField.sendKeys("*878*999*3*84#");
		callButton.click();
		Thread.sleep(8000);
		
////		Amount to Recall
//		pinInPutField.sendKeys("*999*3");
//		sendPinButton.click();
//		Thread.sleep(5000);
		
//		Enter PIN to complete Fund Recall
		pinInPutField.sendKeys("*999*1234");
		sendPinButton.click();
		Thread.sleep(7000);
		
		String balance = accountBalanceResponse.getText();
		Thread.sleep(7000);
		
		ok_Button.click();

		return balance;
	}

}
