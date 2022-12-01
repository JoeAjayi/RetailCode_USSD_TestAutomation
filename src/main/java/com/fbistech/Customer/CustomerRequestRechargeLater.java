package com.fbistech.Customer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CustomerRequestRechargeLater extends BasePage {

	
//	Initialize the Page Objects
	public CustomerRequestRechargeLater (AppiumDriver driver)
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
	private AndroidElement accountBalanceResponse;
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement ok_Button;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Close\"]")
	private AndroidElement smsCancel_Btn;
	
	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement invalidFund_PopUp;
	

	
	public String validateSubdealerCanView_TransactionHistory() throws Exception
	{
//		textField.sendKeys(subDealerToRetailerDownline);
		textField.sendKeys("*878*999*2*00263*100#");
		callButton.click();
		Thread.sleep(8000);
		String balance = accountBalanceResponse.getText();
		Thread.sleep(8000);
		
		ok_Button.click();

		return balance;
	}
	
}