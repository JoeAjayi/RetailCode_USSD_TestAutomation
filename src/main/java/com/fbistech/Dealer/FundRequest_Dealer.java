package com.fbistech.Dealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FundRequest_Dealer extends BasePage {

	
	public FundRequest_Dealer(AndroidDriver driver)
	{
		super(driver);
	}
	
	
		
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement textField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement call_Btn;
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement accountBalancePopUp;

	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement ok_Btn;
	
	
//	public void dealerToFundSubdealerDownline(String subDealerToRetailerDownline) throws Exception
	public String validateDealerFundRequest() throws Exception

	{
//		textField.sendKeys(subDealerToRetailerDownline);
		textField.sendKeys("*878*878*34*1#");
		call_Btn.click();
		Thread.sleep(5000);

		
		String balance = accountBalancePopUp.getText();
		Thread.sleep(6000);
		
		ok_Btn.click();


		return balance;
	}



}
