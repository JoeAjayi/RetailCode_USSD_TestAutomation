package com.fbistech.SubDealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FundRequest extends BasePage{

	
	public FundRequest (AppiumDriver driver)
	{
		super(driver);
	}
	

	
		
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement textField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement call_Btn;
	
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement requestSuccess_Token;
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement ok_Button;
	
//	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']") 
	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement token_Message;
	

	
	public String validateFundRequest(String fundRequestSubdealerToDealerUpline, 
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
