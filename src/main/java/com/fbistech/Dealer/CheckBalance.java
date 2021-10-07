package com.fbistech.Dealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CheckBalance extends BasePage {
	
	public CheckBalance(AndroidDriver driver)
	{
		super(driver);
	}
	

	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement textField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement call_Btn;

	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement ok_Btn;
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement accountBalancePopUp;
	
	
	
//	public void userCheckBalance(String checkBalance) throws InterruptedException
	public String dealerCheckWalletBalance() throws InterruptedException
	{
//		textField.sendKeys(checkBalance);

		textField.sendKeys("*878*878*8#"); 
		call_Btn.click();
		
		Thread.sleep(4000);
		String balance = accountBalancePopUp.getText();
		
		Thread.sleep(5000);
		ok_Btn.click();
		
		return balance;
	}	
	

}
