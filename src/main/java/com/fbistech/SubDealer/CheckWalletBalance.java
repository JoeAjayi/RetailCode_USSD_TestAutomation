package com.fbistech.SubDealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CheckWalletBalance extends BasePage {
	
	public CheckWalletBalance(AndroidDriver driver)
	{
		super(driver);
	}
	

	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement textField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement callButon;

	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement walletBalance_Popup;
	
	
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement ok_Btn;
	
	
//	public void userCheckBalance(String checkBalance) throws InterruptedException

	public String subdealerCheckWalletBalance() throws InterruptedException
	{
		
//		textField.sendKeys(checkBalance);
		textField.sendKeys("*878*8#");
		callButon.click();
		Thread.sleep(5000);
		
		String balance = walletBalance_Popup.getText();
		Thread.sleep(6000);
		
		ok_Btn.click();

		return balance;
	}	

		
	
}
