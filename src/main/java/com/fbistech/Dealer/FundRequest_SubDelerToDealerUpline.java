package com.fbistech.Dealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FundRequest_SubDelerToDealerUpline extends BasePage{

	
	public FundRequest_SubDelerToDealerUpline (AppiumDriver driver)
	{
		super(driver);
	}
	

	
		
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement textField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement call_Btn;
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
	private AndroidElement requestSuccess_Token;
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement ok_Button;
	
	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement token_Message;
	

	
	public String validateFundRequestSubdealerToDealerUpline(String fundRequestSubdealerToDealerUpline, 
			String subDealer_PIN) throws Exception
	{
//		textField.sendKeys("*878*878*34*1#");
		textField.sendKeys(fundRequestSubdealerToDealerUpline);
		call_Btn.click();
		Thread.sleep(8000);
		String text = requestSuccess_Token.getText();
		Thread.sleep(10000);
		ok_Button.click();
		return text;
	}
	
}
