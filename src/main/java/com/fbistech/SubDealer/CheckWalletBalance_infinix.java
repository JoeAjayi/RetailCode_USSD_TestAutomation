package com.fbistech.SubDealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CheckWalletBalance_infinix extends BasePage {
	
	
	
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"*\"]") 
	private AndroidElement starBtn;
//	
	@AndroidFindBy(xpath = "//*[@resource-id='com.sh.smart.caller:id/digits']") 
	private AndroidElement digitInputField;	
//	
	@AndroidFindBy(xpath = "//*[@resource-id='com.sh.smart.caller:id/float_sim2']")
	private AndroidElement call_Sim2;

	
//	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
//	private AndroidElement textField;	
//	
//	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
//	private AndroidElement callButon;

	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement walletBalanceResponse;
	
	
	
//	@AndroidFindBy(xpath = "//*[@class='android.widget.Button']") //*[@text='OK']
//	private AndroidElement ok_Btn;
	
	
	
	
	
	public CheckWalletBalance_infinix (AppiumDriver driver)
	{
		super(driver);
	}
	

	
//	Abstraction method
//	public void userCheckBalance(String checkBalance) throws InterruptedException

//	public String subdealerCheckWalletBalance() throws InterruptedException
	public String validateSubdealerCheckBalance(String checkWalletBalance) throws Exception
	{
		
		starBtn.click(); 
		digitInputField.sendKeys(checkWalletBalance);
		call_Sim2.click();
		Thread.sleep(7000);
		
		String balance = walletBalanceResponse.getText();
		Thread.sleep(6000);
		
//		ok_Btn.click();

		return balance;
	}	

		
	
}
