package com.fbistech.Dealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Transaction_HistorySubDealer extends BasePage {

	
//	Initialize the Page Objects
	public Transaction_HistorySubDealer (AppiumDriver driver)
	{
		super(driver);
	}
	
	
	

	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement textField;	
	
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
	

	
	public String validateSubdealerCheck_TransactionHistory(String checkTransactionHistory) throws Exception
	{
//		textField.sendKeys("*878*999*11#");
		textField.sendKeys(checkTransactionHistory);
		callButton.click();
		Thread.sleep(8000);
		
		
		String balance = accountBalanceResponse.getText();
		Thread.sleep(8000);
		
		ok_Button.click();

		return balance;
	}
	
}
