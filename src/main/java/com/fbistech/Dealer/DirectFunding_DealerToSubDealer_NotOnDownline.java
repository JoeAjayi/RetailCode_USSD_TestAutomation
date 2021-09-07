package com.fbistech.Dealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DirectFunding_DealerToSubDealer_NotOnDownline extends BasePage {

		
		public DirectFunding_DealerToSubDealer_NotOnDownline(AndroidDriver driver)
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
		
		@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Close\"]")
		private AndroidElement smsOK_Btn;
		
		
//		public void dealerToFundSubdealerDownline(String subDealerToRetailerDownline) throws Exception
		public void dealerFundSubdealerNotOnDownline() throws Exception

		{
//			textField.sendKeys(subDealerToRetailerDownline);
			textField.sendKeys("*878*878*33*94391*1#");
			call_Btn.click();
			Thread.sleep(4000);
			pinInPutField.sendKeys("1234");
			sendPIN_Btn.click();
			Thread.sleep(7000);
			ok_Btn.click();
			Thread.sleep(10000);
			smsOK_Btn.click();
		}

	
}
