package com.fbistech.SubDealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CheckSubDealerWalletBalance extends BasePage {
	
	public CheckSubDealerWalletBalance(AppiumDriver driver)
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
//	private AndroidElement callButon;

	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement textField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement callButon;

	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement walletBalanceResponse;
	
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.Button']") //*[@text='OK']
	private AndroidElement ok_Btn;
	
	
	
//	Abstraction method
//	public void userCheckBalance(String checkBalance) throws InterruptedException

//	public String subdealerCheckWalletBalance() throws InterruptedException
	public String validateSubdealerCheckBalance(String checkWalletBalance) throws Exception
	{
		
//		starBtn.click(); 
//		textField.sendKeys("*878*999*8#");
		textField.sendKeys(checkWalletBalance);
		callButon.click();
		Thread.sleep(7000);
		
		String balance = walletBalanceResponse.getText();
		Thread.sleep(6000);
		
		ok_Btn.click();

		return balance;
	}	

		
	
}
