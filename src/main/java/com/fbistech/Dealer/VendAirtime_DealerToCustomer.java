package com.fbistech.Dealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class VendAirtime_DealerToCustomer extends BasePage {

	
	public VendAirtime_DealerToCustomer (AppiumDriver driver)
	{
		super(driver);
	}
	
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement textField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement call_Btn;
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement pinInPutField;
	
	@AndroidFindBy(xpath = "//*[@text='SEND']")
	private AndroidElement sendPIN_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement ok_Btn;
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
	private AndroidElement accountBalancePopUp;
	
	
//	public void dealerToFundSubdealerDownline(String subDealerToRetailerDownline) throws Exception
	public String validateDealerVendAirtimeToCustomer() throws Exception
	{
		
//		textField.sendKeys(subDealerToRetailerDownline);
		textField.sendKeys("*878*878*09134056018*1#");
		call_Btn.click(); 
		Thread.sleep(5000);
		
//		pinInPutField.sendKeys("1234");
//		sendPIN_Btn.click();
//		Thread.sleep(4000);
		
		String balance = accountBalancePopUp.getText();
		Thread.sleep(6000);
		
		ok_Btn.click();

		return balance;
	}
}
