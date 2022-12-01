package com.fbistech.Dealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Transaction_HistoryDealer extends BasePage {

	
//	Initialize the Page Objects
	public Transaction_HistoryDealer (AppiumDriver driver)
	{
		super(driver);
	}
	
	

	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement textField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement callButton;
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']") 
	private AndroidElement pinInPutField;
	
	@AndroidFindBy(xpath = "//*[@text='SEND']")
	private AndroidElement sendPinButton;
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
	private AndroidElement accountBalancePopUp;
	
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement ok_Button;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Close\"]")
	private AndroidElement smsCancel_Btn;
	
	
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
//	private AndroidElement invalidFund_PopUp;

	

	
	public String validateDealerCanView_TransactionHistory() throws Exception
	{
		
//		textField.sendKeys(subDealerToRetailerDownline);
		textField.sendKeys("*878*999*11#");
		callButton.click();
		Thread.sleep(8000);
		String balance = accountBalancePopUp.getText();
		Thread.sleep(8000);
		ok_Button.click();

		return balance;
	}
	
}
